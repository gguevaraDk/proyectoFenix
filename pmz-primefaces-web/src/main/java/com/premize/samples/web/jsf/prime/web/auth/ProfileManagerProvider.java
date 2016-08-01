package com.premize.samples.web.jsf.prime.web.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.api.util.StringUtils;
import com.premize.samples.web.jsf.prime.facade.UsuarioFacade;
import com.premize.samples.web.jsf.prime.modelo.Usuario;
import com.premize.samples.web.jsf.prime.web.dto.Autenticado;
import com.premize.samples.web.jsf.prime.web.dto.ErrorBean;
import com.premize.samples.web.jsf.prime.web.dto.RespuestaWS;
import com.premize.samples.web.jsf.prime.web.dto.RolDTO;
import com.premize.samples.web.jsf.prime.web.dto.UsuarioDTO;
import com.premize.samples.web.jsf.prime.web.dto.enums.EstadoAutenticacionEnum;
import com.premize.samples.web.jsf.prime.web.dto.enums.TipoAutenticacionEnum;
import com.premize.samples.web.jsf.prime.web.dto.enums.TipoCredencialEnum;

public class ProfileManagerProvider extends
		AbstractUserDetailsAuthenticationProvider {

	private static final String ID_APLICACION = "18";
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ProfileManagerProvider.class);

	@Autowired
	private UsuarioFacade usuarioFacade;

	private List<Usuario> listaUsuarios;

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) {
		LOGGER.info("additionalAuthenticationChecks");
	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication) {

		if (StringUtils.isNull(username)) {
			throw new AuthenticationServiceException(
					"No se ha ingresado el usuario");
		}

		if (authentication.getCredentials() == null
				|| String.valueOf(authentication.getCredentials()).trim()
						.length() == 0) {
			throw new AuthenticationServiceException(
					"No se ha ingresado el password");
		}
		return getUser(TipoCredencialEnum.UP, username,
				String.valueOf(authentication.getCredentials()), ID_APLICACION,
				TipoAutenticacionEnum.PROFILE_MANAGER, null);
	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param credencialEnum
	 * @param documento
	 * @param clave
	 * @param idAplicacion
	 * @param autenticacionEnum
	 * @param referenciaOrigen
	 * @return
	 */
	private UserDetails getUser(TipoCredencialEnum credencialEnum,
			String documento, String clave, String idAplicacion,
			TipoAutenticacionEnum autenticacionEnum, String referenciaOrigen) {
		RespuestaWS respuestaWS = autenticarUsuario(credencialEnum, documento,
				clave, idAplicacion, autenticacionEnum, referenciaOrigen);

		if (respuestaWS.getAutenticado().getEstadoAutenticacion() == EstadoAutenticacionEnum.FALLO) {
			throw new AuthenticationServiceException(respuestaWS.getErrorBean()
					.getDescripcion());
		}

		return new UserPremizeDetails(documento, clave, true,
				respuestaWS.getUsuarioDTO());
	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param credencialEnum
	 * @param documento
	 * @param clave
	 * @param idAplicacion
	 * @param autenticacionEnum
	 * @param referenciaOrigen
	 * @return
	 */
	private RespuestaWS autenticarUsuario(TipoCredencialEnum credencialEnum,
			String documento, String clave, String idAplicacion,
			TipoAutenticacionEnum autenticacionEnum, String referenciaOrigen) {
		UsuarioDTO usuario = null;
		RespuestaWS respuestaWS = new RespuestaWS();
		ErrorBean errorBean = new ErrorBean();

		try {
			listaUsuarios = new ArrayList<Usuario>();

			listaUsuarios = usuarioFacade.findByAll();

			if (listaUsuarios != null && !listaUsuarios.isEmpty()) {

				for (Usuario user : listaUsuarios) {

					if (user.getCorreoElectronico().equalsIgnoreCase(documento)
							&& user.getContrasenia().equalsIgnoreCase(clave)) {
						
						usuario = new UsuarioDTO();
						usuario.setNombre(user.getNombre());
						usuario.setPrimerApellido("Admin");
						usuario.setSegundoApellido("Istrador");
						usuario.setRoles(Arrays.asList(new RolDTO("Admin")));
						respuestaWS.setErrorBean(errorBean);
						respuestaWS.setUsuarioDTO(usuario);
						respuestaWS.setAutenticado(new Autenticado(
								EstadoAutenticacionEnum.EXITO));
					}

				}
			}

		} catch (AppBaseException e) {
			LOGGER.error("Error consultando los usuarios", e);
		}

		// if ("gustavo".equalsIgnoreCase(documento)
		//
		// && "gustavo".equalsIgnoreCase(clave)) {
		// usuario = new UsuarioDTO();
		// usuario.setNombre("Administrador");
		// usuario.setPrimerApellido("Admin");
		// usuario.setSegundoApellido("Istrador");
		// usuario.setRoles(Arrays.asList(new RolDTO("Admin")));
		// OpcionDTO opcionDTO = new OpcionDTO("Tipo Parametro",
		// "goTipoParametro", null, Arrays.asList(new AccionDTO(
		// "Nuevo tipo de parámetro")));
		// usuario.setOpciones(Arrays.asList(opcionDTO));
		// respuestaWS.setErrorBean(errorBean);
		// respuestaWS.setUsuarioDTO(usuario);
		// respuestaWS.setAutenticado(new Autenticado(
		// EstadoAutenticacionEnum.EXITO));
		// } else {
		// respuestaWS.setErrorBean(new ErrorBean("2",
		// "Credenciales Erroneas: El Usuario no existe"));
		// respuestaWS.setAutenticado(new Autenticado(
		// EstadoAutenticacionEnum.FALLO));
		//
		// }
		return respuestaWS;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}

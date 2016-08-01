package com.premize.samples.web.jsf.prime.web.auth;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;

import com.premize.pmz.api.util.StringUtils;
import com.premize.samples.web.jsf.prime.web.dto.AccionDTO;
import com.premize.samples.web.jsf.prime.web.dto.Autenticado;
import com.premize.samples.web.jsf.prime.web.dto.ErrorBean;
import com.premize.samples.web.jsf.prime.web.dto.OpcionDTO;
import com.premize.samples.web.jsf.prime.web.dto.RespuestaWS;
import com.premize.samples.web.jsf.prime.web.dto.RolDTO;
import com.premize.samples.web.jsf.prime.web.dto.UsuarioDTO;
import com.premize.samples.web.jsf.prime.web.dto.enums.EstadoAutenticacionEnum;
import com.premize.samples.web.jsf.prime.web.dto.enums.TipoAutenticacionEnum;
import com.premize.samples.web.jsf.prime.web.dto.enums.TipoCredencialEnum;


public class ProfileManagerProvider extends AbstractUserDetailsAuthenticationProvider{
	
	private static final String ID_APLICACION = "18";
	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileManagerProvider.class);

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) {
	    LOGGER.info("additionalAuthenticationChecks");
	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication) {
		
		if (StringUtils.isNull(username)) {
			 throw new AuthenticationServiceException("No se ha ingresado el usuario");
		}
		
		if (authentication.getCredentials() == null
				|| String.valueOf(authentication.getCredentials()).trim()
						.length() == 0) {
			 throw new AuthenticationServiceException("No se ha ingresado el password");
		 }
		return getUser(TipoCredencialEnum.UP, username, String.valueOf(authentication.getCredentials()), ID_APLICACION,
				TipoAutenticacionEnum.PROFILE_MANAGER, null);
	}
	
	/**
	 * Obtener el {@link UserPremizeDetails}
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 6/05/2013
	 * @param credencialEnum
	 * @param documento
	 * @param clave
	 * @param idAplicacion
	 * @param autenticacionEnum
	 * @param referenciaOrigen
	 * @return
	 */
	private UserDetails getUser(TipoCredencialEnum credencialEnum, String documento, String clave,
			String idAplicacion, TipoAutenticacionEnum autenticacionEnum, String referenciaOrigen){
		RespuestaWS respuestaWS = autenticarUsuarioDummy(credencialEnum,
				documento, clave, idAplicacion, autenticacionEnum,
				referenciaOrigen);
		
		if (respuestaWS.getAutenticado().getEstadoAutenticacion() == EstadoAutenticacionEnum.FALLO) {
			throw new AuthenticationServiceException(respuestaWS.getErrorBean().getDescripcion());
		}
		
		return new UserPremizeDetails(documento, clave, true,
				respuestaWS.getUsuarioDTO());
	}

	/**
	 * Dummy de Autenticación con el Servicio
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 6/05/2013
	 * @param credencialEnum
	 * @param documento
	 * @param clave
	 * @param idAplicacion
	 * @param autenticacionEnum
	 * @param referenciaOrigen
	 * @return
	 */
	private RespuestaWS autenticarUsuarioDummy(
			TipoCredencialEnum credencialEnum, String documento, String clave,
			String idAplicacion, TipoAutenticacionEnum autenticacionEnum, String referenciaOrigen) {
		UsuarioDTO usuario = null;
		RespuestaWS respuestaWS = new RespuestaWS();
		ErrorBean errorBean = new ErrorBean();
		if ("admin".equalsIgnoreCase(documento)
				&& "admin".equalsIgnoreCase(clave)) {
			usuario = new UsuarioDTO();
			usuario.setNombre("Administrador");
			usuario.setPrimerApellido("Admin");
			usuario.setSegundoApellido("Istrador");
			usuario.setRoles(Arrays.asList(new RolDTO("Admin")));
			OpcionDTO opcionDTO = new OpcionDTO("Tipo Parametro",
					"goTipoParametro", null, Arrays.asList(new AccionDTO(
							"Nuevo tipo de parámetro")));
			usuario.setOpciones(Arrays.asList(opcionDTO));
			respuestaWS.setErrorBean(errorBean);
			respuestaWS.setUsuarioDTO(usuario);
			respuestaWS.setAutenticado(new Autenticado(EstadoAutenticacionEnum.EXITO));
		}else{
			if ("user".equalsIgnoreCase(documento)
					&& "user".equalsIgnoreCase(clave)) {
				usuario = new UsuarioDTO();
				usuario.setNombre("User");
				usuario.setPrimerApellido("User");
				usuario.setRoles(Arrays.asList(new RolDTO("ROLE_USER")));
				OpcionDTO opcionDTO = new OpcionDTO("Registro Solicitud",
						"goRegistroSolicitud", null, Arrays.asList(new AccionDTO(
								"Guardar Solicitud")));
				usuario.setOpciones(Arrays.asList(opcionDTO));
				respuestaWS.setUsuarioDTO(usuario);
				respuestaWS.setErrorBean(errorBean);
				respuestaWS.setAutenticado(new Autenticado(EstadoAutenticacionEnum.EXITO));
			}else{
				respuestaWS.setErrorBean(new ErrorBean("2", "Credenciales Erroneas: El Usuario no existe"));
				respuestaWS.setAutenticado(new Autenticado(EstadoAutenticacionEnum.FALLO));
			}
		}
		return respuestaWS;
	}
	

}

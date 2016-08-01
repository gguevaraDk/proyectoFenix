/**
 * 
 */
package com.premize.samples.web.jsf.prime.web.ui.registro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.web.AbstractBaseMessageUI;
import com.premize.samples.web.jsf.prime.facade.UsuarioFacade;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-web
 * @class LoginUI
 * @since 29/07/2016
 *
 */

@ManagedBean(name = "loginUI")
@ViewScoped
public class LoginUI extends AbstractBaseMessageUI {

	private static final Logger LOG = LoggerFactory.getLogger(LoginUI.class);

	@ManagedProperty("#{usuarioFacade}")
	private UsuarioFacade usuarioFacade;
	private String nombreUsuario;
	private String contrasena;
	private List<Usuario> listaUsuarios;

	@PostConstruct
	public void init() {
		nombreUsuario = "";
		contrasena = "";

		listaUsuarios = new ArrayList<Usuario>();
	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 */
	public void validarIngreso() {

		try {
			listaUsuarios = usuarioFacade.findByAll();
		} catch (AppBaseException e) {
			LOG.error("Error consultando los usuarios", e);
		}

		if (listaUsuarios != null && !listaUsuarios.isEmpty()) {

			for (Usuario usuario : listaUsuarios) {

				if (usuario.getCorreoElectronico().equals(nombreUsuario)) {

					FacesContext context = FacesContext.getCurrentInstance();

					try {
						context.getExternalContext()
								.redirect(
										"pages/forms/registro/registroFormulario.xhtml");
					} catch (IOException e) {

					}

					// RequestContext
					// .getCurrentInstance()
					// .execute(
					//
					// "window.location.href='pages/forms/registro/registroFormulario.xhtml'");

				}

			}
		}

	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the usuarioFacade
	 */
	public UsuarioFacade getUsuarioFacade() {
		return usuarioFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param usuarioFacade
	 *            the usuarioFacade to set
	 */
	public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
		this.usuarioFacade = usuarioFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the listaUsuarios
	 */
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param listaUsuarios
	 *            the listaUsuarios to set
	 */
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param nombreUsuario
	 *            the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param contrasena
	 *            the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}

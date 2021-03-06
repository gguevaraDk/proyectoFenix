/**
 * 
 */
package com.premize.samples.web.jsf.prime.service;

import com.premize.pmz.api.EntityService;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.PerfilUsuario;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class PerfilUsuarioService
 * @since 1/08/2016
 *
 */
public interface PerfilUsuarioService extends
		EntityService<PerfilUsuario, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param usuario
	 * @return
	 * @throws AppBaseException
	 */
	PerfilUsuario encontrarPerfil(Usuario usuario) throws AppBaseException;

}

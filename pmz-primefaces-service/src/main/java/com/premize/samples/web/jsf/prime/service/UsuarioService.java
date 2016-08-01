/**
 * 
 */
package com.premize.samples.web.jsf.prime.service;

import java.util.List;

import com.premize.pmz.api.EntityService;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class UsuarioService
 * @since 28/07/2016
 *
 */
public interface UsuarioService extends EntityService<Usuario, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @return
	 * @throws AppBaseException
	 */
	List<Usuario> findByAll() throws AppBaseException;

}

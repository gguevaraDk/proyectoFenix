/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.facade.AbstractEntityFacade;
import com.premize.samples.web.jsf.prime.facade.PerfilUsuarioFacade;
import com.premize.samples.web.jsf.prime.modelo.PerfilUsuario;
import com.premize.samples.web.jsf.prime.modelo.Usuario;
import com.premize.samples.web.jsf.prime.service.PerfilUsuarioService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class PerfilUsuarioFacadeImpl
 * @since 1/08/2016
 *
 */
@Service("perfilUsuarioFacade")
public class PerfilUsuarioFacadeImpl extends
		AbstractEntityFacade<PerfilUsuario, Integer> implements
		PerfilUsuarioFacade {

	@Autowired
	private PerfilUsuarioService perfilUsuarioService;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @see com.premize.pmz.facade.AbstractEntityFacade#getEntityService()
	 */
	@Override
	public PerfilUsuarioService getEntityService() {
		return perfilUsuarioService;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @see com.premize.samples.web.jsf.prime.facade.PerfilUsuarioFacade#encontrarPerfil(com.premize.samples.web.jsf.prime.modelo.Usuario)
	 */
	@Override
	public PerfilUsuario encontrarPerfil(Usuario usuario)
			throws AppBaseException {

		return perfilUsuarioService.encontrarPerfil(usuario);
	}

}

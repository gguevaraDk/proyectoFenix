/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.facade.AbstractEntityFacade;
import com.premize.samples.web.jsf.prime.facade.UsuarioFacade;
import com.premize.samples.web.jsf.prime.modelo.Usuario;
import com.premize.samples.web.jsf.prime.service.UsuarioService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class UsuarioFacadeImpl
 * @since 28/07/2016
 *
 */
@Service("usuarioFacade")
public class UsuarioFacadeImpl extends AbstractEntityFacade<Usuario, Integer>
		implements UsuarioFacade {

	@Autowired
	private UsuarioService usuarioService;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @see com.premize.pmz.facade.AbstractEntityFacade#getEntityService()
	 */
	@Override
	public UsuarioService getEntityService() {

		return usuarioService;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @see com.premize.samples.web.jsf.prime.facade.UsuarioFacade#findByAll()
	 */
	@Override
	public List<Usuario> findByAll() throws AppBaseException {

		return usuarioService.findByAll();
	}

}

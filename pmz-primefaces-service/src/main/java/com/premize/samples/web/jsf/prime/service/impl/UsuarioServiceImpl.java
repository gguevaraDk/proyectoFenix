/**
 * 
 */
package com.premize.samples.web.jsf.prime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.service.AbstractEntityService;
import com.premize.samples.web.jsf.prime.dao.UsuarioDao;
import com.premize.samples.web.jsf.prime.modelo.Usuario;
import com.premize.samples.web.jsf.prime.service.UsuarioService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class UsuarioServiceImpl
 * @since 28/07/2016
 *
 */
@Service
public class UsuarioServiceImpl extends AbstractEntityService<Usuario, Integer>
		implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @see com.premize.pmz.service.AbstractEntityService#getDao()
	 */
	@Override
	public UsuarioDao getDao() {

		return usuarioDao;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @see com.premize.samples.web.jsf.prime.service.UsuarioService#findByAll()
	 */
	@Override
	public List<Usuario> findByAll() throws AppBaseException {

		return usuarioDao.findByAll();
	}

}

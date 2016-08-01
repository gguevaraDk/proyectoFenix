/**
 * 
 */
package com.premize.samples.web.jsf.prime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.service.AbstractEntityService;
import com.premize.samples.web.jsf.prime.dao.PerfilUsuarioDao;
import com.premize.samples.web.jsf.prime.modelo.PerfilUsuario;
import com.premize.samples.web.jsf.prime.modelo.Usuario;
import com.premize.samples.web.jsf.prime.service.PerfilUsuarioService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class PerfilUsuarioServiceImpl
 * @since 1/08/2016
 *
 */
@Service
public class PerfilUsuarioServiceImpl extends
		AbstractEntityService<PerfilUsuario, Integer> implements
		PerfilUsuarioService {

	@Autowired
	private PerfilUsuarioDao perfilUsuarioDao;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @see com.premize.pmz.service.AbstractEntityService#getDao()
	 */
	@Override
	public PerfilUsuarioDao getDao() {
		return perfilUsuarioDao;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @see com.premize.samples.web.jsf.prime.service.PerfilUsuarioService#encontrarPerfil(com.premize.samples.web.jsf.prime.modelo.Usuario)
	 */
	@Override
	public PerfilUsuario encontrarPerfil(Usuario usuario)
			throws AppBaseException {

		return perfilUsuarioDao.encontrarPerfil(usuario);
	}

}

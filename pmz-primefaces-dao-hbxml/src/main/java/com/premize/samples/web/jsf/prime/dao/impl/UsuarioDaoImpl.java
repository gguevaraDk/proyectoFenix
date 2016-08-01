/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.UsuarioDao;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class UsuarioDaoImpl
 * @since 28/07/2016
 *
 */
@Repository
public class UsuarioDaoImpl extends HibernateDaoImpl<Usuario, Integer>
		implements UsuarioDao {

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @see com.premize.samples.web.jsf.prime.dao.UsuarioDao#findByAll()
	 */
	@Override
	public List<Usuario> findByAll() throws AppBaseException {

		DetachedCriteria criteria = DetachedCriteria.forClass(Usuario.class);
		return findByCriteria(criteria);
	}

}

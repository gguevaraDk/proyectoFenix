/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.PerfilUsuarioDao;
import com.premize.samples.web.jsf.prime.modelo.PerfilUsuario;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class PerfilUsuarioDaoImpl
 * @since 1/08/2016
 *
 */
@Repository
public class PerfilUsuarioDaoImpl extends
		HibernateDaoImpl<PerfilUsuario, Integer> implements PerfilUsuarioDao {

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @see com.premize.samples.web.jsf.prime.dao.PerfilUsuarioDao#encontrarPerfil(com.premize.samples.web.jsf.prime.modelo.Usuario)
	 */
	@Override
	public PerfilUsuario encontrarPerfil(Usuario usuario)
			throws AppBaseException {

		DetachedCriteria criteria = DetachedCriteria
				.forClass(PerfilUsuario.class);

		criteria.add(Restrictions.eq("usuario.id", usuario.getId()));
		return (PerfilUsuario) getByCriteria(criteria);

	}
}

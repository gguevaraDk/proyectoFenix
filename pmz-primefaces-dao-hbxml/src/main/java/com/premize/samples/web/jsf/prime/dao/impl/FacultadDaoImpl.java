/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.FacultadDao;
import com.premize.samples.web.jsf.prime.modelo.Facultad;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class FacultadDaoImpl
 * @since 29/07/2016
 *
 */
@Repository
public class FacultadDaoImpl extends HibernateDaoImpl<Facultad, Integer>
		implements FacultadDao {

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @see com.premize.samples.web.jsf.prime.dao.FacultadDao#findByAll()
	 */
	@Override
	public List<Facultad> findByAll() throws AppBaseException {

		DetachedCriteria criteria = DetachedCriteria.forClass(Facultad.class);
		return findByCriteria(criteria);
	}

}

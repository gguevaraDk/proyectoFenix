/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.ProgramaDao;
import com.premize.samples.web.jsf.prime.modelo.Programa;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class ProgramaDaoImpl
 * @since 31/07/2016
 *
 */
@Repository
public class ProgramaDaoImpl extends HibernateDaoImpl<Programa, Integer>
		implements ProgramaDao {

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @see com.premize.samples.web.jsf.prime.dao.ProgramaDao#findByAll()
	 */
	@Override
	public List<Programa> findByAll() throws AppBaseException {
		DetachedCriteria criteria = DetachedCriteria.forClass(Programa.class);
		return findByCriteria(criteria);
	}

}

/**
 * 
 */
package com.premize.samples.web.jsf.prime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.service.AbstractEntityService;
import com.premize.samples.web.jsf.prime.dao.AsignaturaDao;
import com.premize.samples.web.jsf.prime.modelo.Asignatura;
import com.premize.samples.web.jsf.prime.service.AsignaturaService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class AsignaturaServiceImpl
 * @since 24/07/2016
 *
 */
@Service
public class AsignaturaServiceImpl extends
		AbstractEntityService<Asignatura, Integer> implements AsignaturaService {

	@Autowired
	private AsignaturaDao asignaturaDao;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 * @see com.premize.pmz.service.AbstractEntityService#getDao()
	 */
	@Override
	public AsignaturaDao getDao() {

		return asignaturaDao;
	}

}

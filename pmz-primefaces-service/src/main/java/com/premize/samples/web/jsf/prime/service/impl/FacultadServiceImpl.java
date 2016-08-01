/**
 * 
 */
package com.premize.samples.web.jsf.prime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.service.AbstractEntityService;
import com.premize.samples.web.jsf.prime.dao.FacultadDao;
import com.premize.samples.web.jsf.prime.modelo.Facultad;
import com.premize.samples.web.jsf.prime.service.FacultadService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class FacultadServiceImpl
 * @since 29/07/2016
 *
 */
@Service
public class FacultadServiceImpl extends
		AbstractEntityService<Facultad, Integer> implements FacultadService {

	@Autowired
	private FacultadDao facultadDao;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @see com.premize.pmz.service.AbstractEntityService#getDao()
	 */
	@Override
	public FacultadDao getDao() {
		return facultadDao;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @see com.premize.samples.web.jsf.prime.service.FacultadService#findByAll()
	 */
	@Override
	public List<Facultad> findByAll() throws AppBaseException {

		return facultadDao.findByAll();
	}

}

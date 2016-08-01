/**
 * 
 */
package com.premize.samples.web.jsf.prime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.service.AbstractEntityService;
import com.premize.samples.web.jsf.prime.dao.ProgramaDao;
import com.premize.samples.web.jsf.prime.modelo.Programa;
import com.premize.samples.web.jsf.prime.service.ProgramaService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class ProgramaServiceImpl
 * @since 31/07/2016
 *
 */
@Service
public class ProgramaServiceImpl extends
		AbstractEntityService<Programa, Integer> implements ProgramaService {

	@Autowired
	private ProgramaDao programaDao;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @see com.premize.pmz.service.AbstractEntityService#getDao()
	 */
	@Override
	public ProgramaDao getDao() {
		return programaDao;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @see com.premize.samples.web.jsf.prime.service.ProgramaService#findByAll()
	 */
	@Override
	public List<Programa> findByAll() throws AppBaseException {

		return programaDao.findByAll();
	}

}

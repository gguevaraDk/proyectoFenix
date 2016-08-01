/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.facade.AbstractEntityFacade;
import com.premize.samples.web.jsf.prime.facade.FacultadFacade;
import com.premize.samples.web.jsf.prime.modelo.Facultad;
import com.premize.samples.web.jsf.prime.service.FacultadService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class FacultadFacadeImpl
 * @since 29/07/2016
 *
 */
@Service("facultadFacade")
public class FacultadFacadeImpl extends AbstractEntityFacade<Facultad, Integer>
		implements FacultadFacade {

	@Autowired
	private FacultadService facultadService;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @see com.premize.pmz.facade.AbstractEntityFacade#getEntityService()
	 */
	@Override
	public FacultadService getEntityService() {
		return facultadService;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @see com.premize.samples.web.jsf.prime.facade.FacultadFacade#findByAll()
	 */
	@Override
	public List<Facultad> findByAll() throws AppBaseException {
		return facultadService.findByAll();
	}

}

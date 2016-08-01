/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.facade.AbstractEntityFacade;
import com.premize.samples.web.jsf.prime.facade.ProgramaFacade;
import com.premize.samples.web.jsf.prime.modelo.Programa;
import com.premize.samples.web.jsf.prime.service.ProgramaService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class ProgramaFacadeImpl
 * @since 31/07/2016
 *
 */
@Service("programaFacade")
public class ProgramaFacadeImpl extends AbstractEntityFacade<Programa, Integer>
		implements ProgramaFacade {

	@Autowired
	private ProgramaService programaService;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @see com.premize.pmz.facade.AbstractEntityFacade#getEntityService()
	 */
	@Override
	public ProgramaService getEntityService() {
		return programaService;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @see com.premize.samples.web.jsf.prime.facade.ProgramaFacade#findByAll()
	 */
	@Override
	public List<Programa> findByAll() throws AppBaseException {

		return programaService.findByAll();
	}

}

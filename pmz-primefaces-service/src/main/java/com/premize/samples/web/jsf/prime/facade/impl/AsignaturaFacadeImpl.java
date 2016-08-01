/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.facade.AbstractEntityFacade;
import com.premize.samples.web.jsf.prime.facade.AsignaturaFacade;
import com.premize.samples.web.jsf.prime.modelo.Asignatura;
import com.premize.samples.web.jsf.prime.service.AsignaturaService;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class AsignaturaFacadeImpl
 * @since 24/07/2016
 *
 */
@Service("asignaturaFacade")
public class AsignaturaFacadeImpl extends
		AbstractEntityFacade<Asignatura, Integer> implements AsignaturaFacade {

	@Autowired
	private AsignaturaService asignaturaService;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 * @see com.premize.pmz.facade.AbstractEntityFacade#getEntityService()
	 */
	@Override
	public AsignaturaService getEntityService() {

		return asignaturaService;
	}

}

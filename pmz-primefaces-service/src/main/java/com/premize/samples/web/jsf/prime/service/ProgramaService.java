/**
 * 
 */
package com.premize.samples.web.jsf.prime.service;

import java.util.List;

import com.premize.pmz.api.EntityService;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Programa;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-service
 * @class ProgramaService
 * @since 31/07/2016
 *
 */
public interface ProgramaService extends EntityService<Programa, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @return
	 * @throws AppBaseException
	 */
	List<Programa> findByAll() throws AppBaseException;

}

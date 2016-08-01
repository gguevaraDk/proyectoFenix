/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade;

import java.util.List;

import com.premize.pmz.api.EntityFacade;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Programa;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-api
 * @class ProgramaFacade
 * @since 31/07/2016
 *
 */
public interface ProgramaFacade extends EntityFacade<Programa, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @return
	 * @throws AppBaseException
	 */
	List<Programa> findByAll() throws AppBaseException;

}

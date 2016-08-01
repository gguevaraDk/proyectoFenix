/**
 * 
 */
package com.premize.samples.web.jsf.prime.facade;

import java.util.List;

import com.premize.pmz.api.EntityFacade;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Facultad;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-api
 * @class FacultadFacade
 * @since 29/07/2016
 *
 */
public interface FacultadFacade extends EntityFacade<Facultad, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return
	 * @throws AppBaseException
	 */
	List<Facultad> findByAll() throws AppBaseException;

}

/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao;

import java.util.List;

import com.premize.pmz.api.Dao;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Facultad;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class FacultadDao
 * @since 29/07/2016
 *
 */
public interface FacultadDao extends Dao<Facultad, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return
	 * @throws AppBaseException
	 */
	List<Facultad> findByAll() throws AppBaseException;

}

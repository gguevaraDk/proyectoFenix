/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao;

import java.util.List;

import com.premize.pmz.api.Dao;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Programa;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class ProgramaDao
 * @since 31/07/2016
 *
 */
public interface ProgramaDao extends Dao<Programa, Integer> {

	List<Programa> findByAll() throws AppBaseException;

}

/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao;

import java.util.List;

import com.premize.pmz.api.Dao;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class UsuarioDao
 * @since 28/07/2016
 *
 */
public interface UsuarioDao extends Dao<Usuario, Integer> {
	
	/**
	 * Metodo que consulta todos los usuarios en BD
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @return
	 * @throws AppBaseException
	 */
	List<Usuario> findByAll() throws AppBaseException;

}

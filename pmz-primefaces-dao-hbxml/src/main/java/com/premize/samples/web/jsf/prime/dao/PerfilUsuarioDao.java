/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao;

import com.premize.pmz.api.Dao;
import com.premize.pmz.api.exception.AppBaseException;
import com.premize.samples.web.jsf.prime.modelo.PerfilUsuario;
import com.premize.samples.web.jsf.prime.modelo.Usuario;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class PerfilUsuarioDao
 * @since 1/08/2016
 *
 */
public interface PerfilUsuarioDao extends Dao<PerfilUsuario, Integer> {

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param usuario
	 * @return
	 * @throws AppBaseException
	 */
	PerfilUsuario encontrarPerfil(Usuario usuario) throws AppBaseException;

}

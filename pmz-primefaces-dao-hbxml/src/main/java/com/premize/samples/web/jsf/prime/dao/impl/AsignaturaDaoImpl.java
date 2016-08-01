/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao.impl;

import org.springframework.stereotype.Repository;

import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.AsignaturaDao;
import com.premize.samples.web.jsf.prime.modelo.Asignatura;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class AsignaturaDaoImpl
 * @since 24/07/2016
 *
 */
@Repository
public class AsignaturaDaoImpl extends HibernateDaoImpl<Asignatura, Integer>
		implements AsignaturaDao {

}

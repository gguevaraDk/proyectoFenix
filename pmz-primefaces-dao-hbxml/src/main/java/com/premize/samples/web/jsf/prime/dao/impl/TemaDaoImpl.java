/**
 * 
 */
package com.premize.samples.web.jsf.prime.dao.impl;

import org.springframework.stereotype.Repository;

import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.TemaDao;
import com.premize.samples.web.jsf.prime.modelo.Tema;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-dao-hbxml
 * @class TemaDaoImpl
 * @since 1/08/2016
 *
 */
@Repository
public class TemaDaoImpl extends HibernateDaoImpl<Tema, Integer> implements
		TemaDao {

}

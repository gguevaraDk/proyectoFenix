package com.premize.samples.web.jsf.prime.dao.impl;

import org.springframework.stereotype.Repository;

import com.premize.pmz.dao.impl.HibernateDaoImpl;
import com.premize.samples.web.jsf.prime.dao.CiudadDao;
import com.premize.samples.web.jsf.prime.modelo.Ciudad;

@Repository
public class CiudadDaoImpl extends HibernateDaoImpl<Ciudad, String> implements
		CiudadDao {

}

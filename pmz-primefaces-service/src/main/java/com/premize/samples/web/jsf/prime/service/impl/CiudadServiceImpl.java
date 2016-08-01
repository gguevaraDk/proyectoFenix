package com.premize.samples.web.jsf.prime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premize.pmz.service.AbstractEntityService;
import com.premize.samples.web.jsf.prime.dao.CiudadDao;
import com.premize.samples.web.jsf.prime.modelo.Ciudad;
import com.premize.samples.web.jsf.prime.service.CiudadService;

@Service
public class CiudadServiceImpl extends AbstractEntityService<Ciudad, String>
		implements CiudadService {

	@Autowired
	private CiudadDao ciudadDao;

	@Override
	public CiudadDao getDao() {
		return ciudadDao;
	}

}

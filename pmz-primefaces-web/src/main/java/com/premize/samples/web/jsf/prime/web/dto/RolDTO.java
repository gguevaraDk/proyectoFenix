package com.premize.samples.web.jsf.prime.web.dto;

import java.io.Serializable;

public class RolDTO implements Serializable{

	/**
     * 
     */
    private static final long serialVersionUID = 3584178270779626833L;
    private String nombreRol;
	
	/**
	 * Constructor por Defecto
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 6/05/2013
	 */
	
	public RolDTO() {
	}

	/**
	 * Contructor Completo
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 6/05/2013
	 * @param nombreRol
	 */
	public RolDTO(String nombreRol) {
		super();
		this.nombreRol = nombreRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	
}

package com.premize.samples.web.jsf.prime.web.dto;

import java.io.Serializable;

/**
 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
 * @project afe-web
 * @class AccionDTO
 * @date 6/05/2013
 *
 */
public class AccionDTO implements Serializable{
	/**
     * 
     */
    private static final long serialVersionUID = -6157142066366646397L;

    public AccionDTO(String nombreAccion) {
		super();
		this.nombreAccion = nombreAccion;
	}

	private String nombreAccion;

	public String getNombreAccion() {
		return nombreAccion;
	}

	public void setNombreAccion(String nombreAccion) {
		this.nombreAccion = nombreAccion;
	}
	
}

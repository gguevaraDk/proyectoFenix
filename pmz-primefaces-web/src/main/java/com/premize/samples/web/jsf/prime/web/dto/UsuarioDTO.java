package com.premize.samples.web.jsf.prime.web.dto;

import java.io.Serializable;
import java.util.List;

public class UsuarioDTO implements Serializable{

	/**
     * 
     */
    private static final long serialVersionUID = -9216626826327545681L;
    
    private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private List<RolDTO> roles;
	private List<OpcionDTO> opciones;
	
	/**
	 * Constructor por Defecto
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 6/05/2013
	 */

	public UsuarioDTO() {
	}
	/**
	 * Constructor completo
	 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
	 * @date 6/05/2013
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param roles
	 * @param opciones
	 */
	public UsuarioDTO(String nombre, String primerApellido,
			String segundoApellido, List<RolDTO> roles, List<OpcionDTO> opciones) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.roles = roles;
		this.opciones = opciones;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public List<RolDTO> getRoles() {
		return roles;
	}
	public void setRoles(List<RolDTO> roles) {
		this.roles = roles;
	}
	public List<OpcionDTO> getOpciones() {
		return opciones;
	}
	public void setOpciones(List<OpcionDTO> opciones) {
		this.opciones = opciones;
	}
	
	
}

package com.premize.samples.web.jsf.prime.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa un motivo. *
 * 
 * @author <a href="mailto:ramiro.andrade@premize.com">Ramiro Andrade</a>
 * @date 06/10/2015
 * 
 */

@Entity
@Table
public class Ciudad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3741066889002771694L;
	private int id;
	private String nombreCiudad;

	public Ciudad() {
		super();

	}

	public Ciudad(int id, String nombreCiudad) {
		super();
		this.id = id;
		this.nombreCiudad = nombreCiudad;
	}

	@Id
	@Column(name = "cod_ciudad", unique = true, nullable = false, length = 20)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "txt_nombre", nullable = false, length = 50)
	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

}

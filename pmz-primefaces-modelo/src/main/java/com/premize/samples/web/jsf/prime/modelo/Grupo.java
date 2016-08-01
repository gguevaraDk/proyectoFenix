/**
 * 
 */
package com.premize.samples.web.jsf.prime.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-modelo
 * @class Grupo
 * @since 27/07/2016
 *
 */
@Entity
@Table(name = "grupos")
public class Grupo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8415552206840290767L;

	private Integer id;
	private String nombre;
	private boolean estado;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grupos_id_seq")
	@SequenceGenerator(name = "grupos_id_seq", sequenceName = "grupos_id_seq", allocationSize = 1)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the nombre
	 */
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the estado
	 */
	@Column(name = "estado")
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}

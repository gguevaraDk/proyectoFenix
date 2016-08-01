package com.premize.samples.web.jsf.prime.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "facultades")
public class Facultad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835393130357503643L;

	private Integer id;
	private String nombre;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facultades_id_seq")
	@SequenceGenerator(name = "facultades_id_seq", sequenceName = "facultades_id_seq", allocationSize = 1)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the nombre
	 */
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

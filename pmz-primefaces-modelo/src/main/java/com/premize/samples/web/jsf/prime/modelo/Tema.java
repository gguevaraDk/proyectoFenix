package com.premize.samples.web.jsf.prime.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "temas")
public class Tema implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4353670187147992446L;

	private Integer id;
	private String nombre;
	private Integer semana;
	private Asignatura asignatura;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
	@SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "temas_id_seq")
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

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the semana
	 */
	@Column(name = "semana")
	public Integer getSemana() {
		return semana;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param semana
	 *            the semana to set
	 */
	public void setSemana(Integer semana) {
		this.semana = semana;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the asignatura
	 */
	@ManyToOne
	@JoinColumn(name = "asignatura_id")
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param asignatura
	 *            the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
}

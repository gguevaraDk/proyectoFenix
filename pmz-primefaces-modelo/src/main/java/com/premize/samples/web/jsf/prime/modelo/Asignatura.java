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
@Table(name = "asignaturas")
public class Asignatura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2541794985412553638L;

	private Integer id;
	private String nombre;
	private Integer numeroCreditos;
	private Integer intensidadHoraria;
	private boolean estado;
	private Programa programa;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asignaturas_id_seq")
	@SequenceGenerator(name = "asignaturas_id_seq", sequenceName = "asignaturas_id_seq", allocationSize = 1)
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
	 * @return the numeroCreditos
	 */
	@Column(name = "numero_creditos")
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param numeroCreditos
	 *            the numeroCreditos to set
	 */
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the intensidadHoraria
	 */
	@Column(name = "intensidad_horaria")
	public Integer getIntensidadHoraria() {
		return intensidadHoraria;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param intensidadHoraria
	 *            the intensidadHoraria to set
	 */
	public void setIntensidadHoraria(Integer intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @return the programa
	 */
	@ManyToOne
	@JoinColumn(name = "programa_id")
	public Programa getPrograma() {
		return programa;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 20/07/2016
	 * @param programa
	 *            the programa to set
	 */

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 * @return the estado
	 */
	@Column(name = "estado")
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}

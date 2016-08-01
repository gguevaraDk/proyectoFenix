/**
 * 
 */
package com.premize.samples.web.jsf.prime.modelo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-modelo
 * @class Asignacion
 * @since 27/07/2016
 *
 */
@Entity
@Table(name = "asignaciones")
public class Asignacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7613146664099152348L;

	private Integer id;
	private Integer anio;
	private String periodo;
	private Integer dia;
	private Timestamp fechaInicio;
	private Usuario vocero;
	private Usuario docente;
	private Grupo grupo;
	private Asignatura asignatura;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asignaciones_id_seq")
	@SequenceGenerator(name = "asignaciones_id_seq", sequenceName = "asignaciones_id_seq", allocationSize = 1)
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
	 * @return the anio
	 */
	@Column(name = "ano")
	public Integer getAnio() {
		return anio;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param anio
	 *            the anio to set
	 */
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the periodo
	 */
	@Column(name = "periodo")
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param periodo
	 *            the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the dia
	 */
	@Column(name = "dia")
	public Integer getDia() {
		return dia;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param dia
	 *            the dia to set
	 */
	public void setDia(Integer dia) {
		this.dia = dia;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the fechaInicio
	 */
	@Column(name = "fecha_inicio")
	public Timestamp getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param fechaInicio
	 *            the fechaInicio to set
	 */
	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the grupo
	 */
	@ManyToOne
	@JoinColumn(name = "grupo_id")
	public Grupo getGrupo() {
		return grupo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param grupo
	 *            the grupo to set
	 */
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the asignatura
	 */
	@ManyToOne
	@JoinColumn(name = "asignatura_id")
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param asignatura
	 *            the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the vocero
	 */
	@ManyToOne
	@JoinColumn(name = "vocero_id")
	public Usuario getVocero() {
		return vocero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param vocero
	 *            the vocero to set
	 */
	public void setVocero(Usuario vocero) {
		this.vocero = vocero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the docente
	 */
	@ManyToOne
	@JoinColumn(name = "docente_id")
	public Usuario getDocente() {
		return docente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param docente
	 *            the docente to set
	 */
	public void setDocente(Usuario docente) {
		this.docente = docente;
	}

}

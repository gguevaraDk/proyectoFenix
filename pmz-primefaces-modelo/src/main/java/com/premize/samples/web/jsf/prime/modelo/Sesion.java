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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-modelo
 * @class Sesion
 * @since 27/07/2016
 *
 */
@Entity
@Table(name = "sesiones")
public class Sesion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7583024889946014532L;

	private Integer id;
	private Integer mes;
	private Integer dia;
	private Double hora;
	private Integer semana;
	private Tema tema;
	private String temaAdicional;
	private String firmaDocente;
	private String firmaVocero;
	private Asignacion asignacion;
	private boolean estado;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sesiones_id_seq")
	@SequenceGenerator(name = "sesiones_id_seq", sequenceName = "sesiones_id_seq", allocationSize = 1)
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
	 * @return the mes
	 */
	@Column(name = "mes")
	public Integer getMes() {
		return mes;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param mes
	 *            the mes to set
	 */
	public void setMes(Integer mes) {
		this.mes = mes;
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
	 * @return the hora
	 */
	@Column(name = "hora")
	public Double getHora() {
		return hora;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param hora
	 *            the hora to set
	 */
	public void setHora(Double hora) {
		this.hora = hora;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the semana
	 */
	@Column(name = "semana")
	public Integer getSemana() {
		return semana;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param semana
	 *            the semana to set
	 */
	public void setSemana(Integer semana) {
		this.semana = semana;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the tema
	 */
	@ManyToOne
	@JoinColumn(name = "tema_id")
	public Tema getTema() {
		return tema;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param tema
	 *            the tema to set
	 */
	public void setTema(Tema tema) {
		this.tema = tema;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the temaAdicional
	 */
	@Column(name = "tema_adicional")
	public String getTemaAdicional() {
		return temaAdicional;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param temaAdicional
	 *            the temaAdicional to set
	 */
	public void setTemaAdicional(String temaAdicional) {
		this.temaAdicional = temaAdicional;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the firmaDocente
	 */
	@Column(name = "firma_docente")
	public String getFirmaDocente() {
		return firmaDocente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param firmaDocente
	 *            the firmaDocente to set
	 */
	public void setFirmaDocente(String firmaDocente) {
		this.firmaDocente = firmaDocente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the firmaVocero
	 */
	@Column(name = "firma_vocero")
	public String getFirmaVocero() {
		return firmaVocero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param firmaVocero
	 *            the firmaVocero to set
	 */
	public void setFirmaVocero(String firmaVocero) {
		this.firmaVocero = firmaVocero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the asignacion
	 */
	@ManyToOne
	@JoinColumn(name = "asignacion_id")
	public Asignacion getAsignacion() {
		return asignacion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param asignacion
	 *            the asignacion to set
	 */
	public void setAsignacion(Asignacion asignacion) {
		this.asignacion = asignacion;
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

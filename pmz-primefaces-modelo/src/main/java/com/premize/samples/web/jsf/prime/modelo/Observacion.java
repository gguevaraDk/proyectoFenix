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
 * @class Observacion
 * @since 27/07/2016
 *
 */
@Entity
@Table(name = "observaciones")
public class Observacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8103550019938457986L;

	private Integer id;
	private String descripcion;
	private Timestamp fechaCreacion;
	private Sesion sesion;
	private Usuario usuario;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the id
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "observaciones_id_seq")
	@SequenceGenerator(name = "observaciones_id_seq", sequenceName = "observaciones_id_seq", allocationSize = 1)
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
	 * @return the descripcion
	 */
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the fechaCreacion
	 */
	@Column(name = "fecha_creacion")
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param fechaCreacion
	 *            the fechaCreacion to set
	 */
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @return the sesion
	 */
	@Column(name = "sesion_id")
	public Sesion getSesion() {
		return sesion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 27/07/2016
	 * @param sesion
	 *            the sesion to set
	 */
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @return the usuario
	 */
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

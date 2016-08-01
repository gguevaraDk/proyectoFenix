/**
 * 
 */
package com.premize.samples.web.jsf.prime.web.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-web
 * @class FormularioDTO
 * @since 5/07/2016
 *
 */
public class FormularioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5963902288034272237L;

	private String nombreDocente;
	private String nombreVocero;
	private String nombreDirector;
	private String rol;
	private String facultad;
	private String materia;
	private String periodo;
	private Date fecha;
	private String grupo;
	private String temas;
	private List<String> listaTemas;
	private String semana;
	private String horas;
	private String observaciones;
	private boolean firmaDocente;
	private boolean firmaRepresentante;
	private String controlPendiente;
	private String pendiente;
	private String programa;

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the nombreDocente
	 */
	public String getNombreDocente() {
		return nombreDocente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param nombreDocente
	 *            the nombreDocente to set
	 */
	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the facultad
	 */
	public String getFacultad() {
		return facultad;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param facultad
	 *            the facultad to set
	 */
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param materia
	 *            the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param periodo
	 *            the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param grupo
	 *            the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the temas
	 */
	public String getTemas() {
		return temas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param temas
	 *            the temas to set
	 */
	public void setTemas(String temas) {
		this.temas = temas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the listaTemas
	 */
	public List<String> getListaTemas() {
		return listaTemas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param listaTemas
	 *            the listaTemas to set
	 */
	public void setListaTemas(List<String> listaTemas) {
		this.listaTemas = listaTemas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the semana
	 */
	public String getSemana() {
		return semana;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param semana
	 *            the semana to set
	 */
	public void setSemana(String semana) {
		this.semana = semana;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the horas
	 */
	public String getHoras() {
		return horas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param horas
	 *            the horas to set
	 */
	public void setHoras(String horas) {
		this.horas = horas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param observaciones
	 *            the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the firmaDocente
	 */
	public boolean isFirmaDocente() {
		return firmaDocente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param firmaDocente
	 *            the firmaDocente to set
	 */
	public void setFirmaDocente(boolean firmaDocente) {
		this.firmaDocente = firmaDocente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the firmaRepresentante
	 */
	public boolean isFirmaRepresentante() {
		return firmaRepresentante;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param firmaRepresentante
	 *            the firmaRepresentante to set
	 */
	public void setFirmaRepresentante(boolean firmaRepresentante) {
		this.firmaRepresentante = firmaRepresentante;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the controlPendiente
	 */
	public String getControlPendiente() {
		return controlPendiente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param controlPendiente
	 *            the controlPendiente to set
	 */
	public void setControlPendiente(String controlPendiente) {
		this.controlPendiente = controlPendiente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the pendiente
	 */
	public String getPendiente() {
		return pendiente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param pendiente
	 *            the pendiente to set
	 */
	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @return the programa
	 */
	public String getPrograma() {
		return programa;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @param programa
	 *            the programa to set
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @return the nombreVocero
	 */
	public String getNombreVocero() {
		return nombreVocero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param nombreVocero
	 *            the nombreVocero to set
	 */
	public void setNombreVocero(String nombreVocero) {
		this.nombreVocero = nombreVocero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @return the nombreDirector
	 */
	public String getNombreDirector() {
		return nombreDirector;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param nombreDirector
	 *            the nombreDirector to set
	 */
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

}

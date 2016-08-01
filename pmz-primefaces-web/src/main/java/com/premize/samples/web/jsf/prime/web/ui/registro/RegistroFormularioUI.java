/**
 * 
 */
package com.premize.samples.web.jsf.prime.web.ui.registro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.premize.pmz.api.exception.AppBaseException;
import com.premize.pmz.web.AbstractBaseMessageUI;
import com.premize.samples.web.jsf.prime.facade.AsignaturaFacade;
import com.premize.samples.web.jsf.prime.facade.FacultadFacade;
import com.premize.samples.web.jsf.prime.facade.PerfilUsuarioFacade;
import com.premize.samples.web.jsf.prime.facade.ProgramaFacade;
import com.premize.samples.web.jsf.prime.facade.UsuarioFacade;
import com.premize.samples.web.jsf.prime.modelo.Asignatura;
import com.premize.samples.web.jsf.prime.modelo.Facultad;
import com.premize.samples.web.jsf.prime.modelo.PerfilUsuario;
import com.premize.samples.web.jsf.prime.modelo.Programa;
import com.premize.samples.web.jsf.prime.modelo.Usuario;
import com.premize.samples.web.jsf.prime.modelo.enums.TemasEnum;
import com.premize.samples.web.jsf.prime.modelo.enums.TipoPerfilEnum;
import com.premize.samples.web.jsf.prime.web.dto.FormularioDTO;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-web
 * @class RegistroFormularioUI
 * @since 5/07/2016
 *
 */
@ManagedBean(name = "registroFormularioUI")
@ViewScoped
public class RegistroFormularioUI extends AbstractBaseMessageUI {

	private static final Logger LOG = LoggerFactory
			.getLogger(RegistroFormularioUI.class);

	@ManagedProperty("#{asignaturaFacade}")
	private AsignaturaFacade asignaturaFacade;
	@ManagedProperty("#{usuarioFacade}")
	private UsuarioFacade usuarioFacade;
	@ManagedProperty("#{facultadFacade}")
	private FacultadFacade facultadFacade;
	@ManagedProperty("#{programaFacade}")
	private ProgramaFacade programaFacade;
	@ManagedProperty("#{perfilUsuarioFacade}")
	private PerfilUsuarioFacade perfilUsuarioFacade;

	private FormularioDTO formularioDTO;
	private List<String> listaGrupos;
	private List<Programa> listaProgramas;
	private List<Programa> listaProgramaSelecion;
	private List<Facultad> listaFacultades;
	private List<String> listaMaterias;
	private List<TemasEnum> listaTemas;
	private List<String> listaTemasEscogidos;
	private List<Usuario> listaUsuarios;
	private List<String> listaPendientes;
	private List<String> listaPeriodos;
	private String temas;
	private List<FormularioDTO> listaRegistros;
	private boolean realizoGeneracion;
	private boolean mostrarPanelPrincipal;
	private PerfilUsuario perUsuario;

	@PostConstruct
	public void init() {
		listaUsuarios = new ArrayList<Usuario>();
		listaFacultades = new ArrayList<Facultad>();
		listaGrupos = new ArrayList<String>();
		listaProgramas = new ArrayList<Programa>();
		setListaTemas(new ArrayList<TemasEnum>());
		listaTemasEscogidos = new ArrayList<String>();
		listaPeriodos = new ArrayList<String>();
		listaPendientes = new ArrayList<String>();
		listaMaterias = new ArrayList<String>();
		listaRegistros = new ArrayList<FormularioDTO>();
		listaProgramaSelecion = new ArrayList<Programa>();
		formularioDTO = new FormularioDTO();
		mostrarPanelPrincipal = false;
		listaPeriodos.add("1");
		listaPeriodos.add("2");
		setListaTemas(Arrays.asList(TemasEnum.values()));
		perUsuario = new PerfilUsuario();

		seteoPendientes();
		realizoGeneracion = false;
		seteoTemas();
		seteoMaterias();

		try {
			listaUsuarios = usuarioFacade.findByAll();
			listaFacultades = facultadFacade.findByAll();
			listaProgramas = programaFacade.findByAll();

			encontralPerfil();

		} catch (AppBaseException e) {
			LOG.error("Error consutando los usuarios", e);
		}
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @throws AppBaseException
	 */
	private void encontralPerfil() throws AppBaseException {
		if (listaUsuarios != null && !listaUsuarios.isEmpty()) {

			for (Usuario usuario : listaUsuarios) {
				if (usuario.getCorreoElectronico().equals(getLogin())) {
					perUsuario = perfilUsuarioFacade.encontrarPerfil(usuario);

				}
			}
		}

		seteoPerfil();

	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 */
	private void seteoPerfil() {
		if (perUsuario != null) {

			if (TipoPerfilEnum.Director.name().equals(
					perUsuario.getPerfil().getNombre())) {

				formularioDTO.setNombreDirector(perUsuario.getUsuario()
						.getNombre());
				formularioDTO.setRol(TipoPerfilEnum.Director.name());
			} else if (TipoPerfilEnum.Docente.name().equals(
					perUsuario.getPerfil().getNombre())) {
				formularioDTO.setNombreDocente(perUsuario.getUsuario()
						.getNombre());
				formularioDTO.setRol(TipoPerfilEnum.Docente.name());
			} else {
				formularioDTO.setNombreVocero(perUsuario.getUsuario()
						.getNombre());
				formularioDTO.setRol(TipoPerfilEnum.Vocero.name());
			}
		}
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 */
	private void seteoPendientes() {
		listaPendientes.add("Pendiente 1");
		listaPendientes.add("Pendiente 2");
		listaPendientes.add("Pendiente 3");
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 */
	private void seteoTemas() {
		listaGrupos.add("Grupo1");
		listaGrupos.add("Grupo2");
		listaGrupos.add("Grupo3");
		listaGrupos.add("Grupo4");
		listaGrupos.add("Grupo5");
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 */
	private void seteoMaterias() {
		listaMaterias.add("Ecuaciones Diferenciales");
		listaMaterias.add("Metodos Númericos");
		listaMaterias.add("Algebra Lineal");

	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 */
	public void seleccionPrograma() {

		listaProgramaSelecion = new ArrayList<Programa>();

		if (listaProgramas != null && !listaProgramas.isEmpty()) {

			for (Programa programa : listaProgramas) {
				if (programa.getFacultad().getNombre()
						.equals(formularioDTO.getFacultad())) {
					listaProgramaSelecion.add(programa);
				}
			}
		}
	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 */
	public void escogerTema() {

		listaTemasEscogidos = new ArrayList<String>();

		for (TemasEnum temas : listaTemas) {
			if (temas.getClave().equals(formularioDTO.getMateria())) {

				listaTemasEscogidos.add(temas.toString());
			}

		}

	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 */
	public void condensarInformacion() {

		realizoGeneracion = true;
		formularioDTO.setSemana("1");
		formularioDTO.setHoras("3");

		listaRegistros.add(formularioDTO);
		formularioDTO = new FormularioDTO();

	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 */
	public void pruebaInsercion() {

		Asignatura asignatura = new Asignatura();
		Programa programa = new Programa();
		Facultad facultad = new Facultad();

		facultad.setId(3);
		facultad.setNombre("Changos");

		asignatura.setEstado(true);
		asignatura.setIntensidadHoraria(12);
		asignatura.setNombre("Prueba Insercion");
		asignatura.setNumeroCreditos(12);
		asignatura.setId(10);

		programa.setId(4);
		programa.setNombre("norverto");
		programa.setFacultad(facultad);
		asignatura.setPrograma(programa);

		try {
			asignaturaFacade.save(asignatura);
			info("Se ha guardado la información de manera exitosa");
		} catch (AppBaseException e) {

			error("Error insertando", e);
			LOG.error(e.getMessage(), e);

		}

	}

	/**
	 * 
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 */
	public void cambioPendiente() {
		mostrarPanelPrincipal = true;

	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the formularioDTO
	 */
	public FormularioDTO getFormularioDTO() {
		return formularioDTO;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param formularioDTO
	 *            the formularioDTO to set
	 */
	public void setFormularioDTO(FormularioDTO formularioDTO) {
		this.formularioDTO = formularioDTO;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the listaGrupos
	 */
	public java.util.List<String> getListaGrupos() {
		return listaGrupos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param listaGrupos
	 *            the listaGrupos to set
	 */
	public void setListaGrupos(java.util.List<String> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the listaMaterias
	 */
	public java.util.List<String> getListaMaterias() {
		return listaMaterias;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param listaMaterias
	 *            the listaMaterias to set
	 */
	public void setListaMaterias(java.util.List<String> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the listaTemas
	 */
	public java.util.List<TemasEnum> getListaTemas() {
		return listaTemas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param listaTemas
	 *            the listaTemas to set
	 */
	public void setListaTemas(java.util.List<TemasEnum> listaTemas) {
		this.listaTemas = listaTemas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the listaTemasEscogidos
	 */
	public List<String> getListaTemasEscogidos() {
		return listaTemasEscogidos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param listaTemasEscogidos
	 *            the listaTemasEscogidos to set
	 */
	public void setListaTemasEscogidos(List<String> listaTemasEscogidos) {
		this.listaTemasEscogidos = listaTemasEscogidos;
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
	 * @return the realizoGeneracion
	 */
	public boolean isRealizoGeneracion() {
		return realizoGeneracion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param realizoGeneracion
	 *            the realizoGeneracion to set
	 */
	public void setRealizoGeneracion(boolean realizoGeneracion) {
		this.realizoGeneracion = realizoGeneracion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the listaPendientes
	 */
	public List<String> getListaPendientes() {
		return listaPendientes;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param listaPendientes
	 *            the listaPendientes to set
	 */
	public void setListaPendientes(List<String> listaPendientes) {
		this.listaPendientes = listaPendientes;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 * @return the mostrarPanelPrincipal
	 */
	public boolean isMostrarPanelPrincipal() {
		return mostrarPanelPrincipal;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 * @param mostrarPanelPrincipal
	 *            the mostrarPanelPrincipal to set
	 */
	public void setMostrarPanelPrincipal(boolean mostrarPanelPrincipal) {
		this.mostrarPanelPrincipal = mostrarPanelPrincipal;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 * @return the listaPeriodos
	 */
	public List<String> getListaPeriodos() {
		return listaPeriodos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 * @param listaPeriodos
	 *            the listaPeriodos to set
	 */
	public void setListaPeriodos(List<String> listaPeriodos) {
		this.listaPeriodos = listaPeriodos;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 * @return the listaRegistros
	 */
	public List<FormularioDTO> getListaRegistros() {
		return listaRegistros;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 6/07/2016
	 * @param listaRegistros
	 *            the listaRegistros to set
	 */
	public void setListaRegistros(List<FormularioDTO> listaRegistros) {
		this.listaRegistros = listaRegistros;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 * @return the asignaturaFacade
	 */
	public AsignaturaFacade getAsignaturaFacade() {
		return asignaturaFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 24/07/2016
	 * @param asignaturaFacade
	 *            the asignaturaFacade to set
	 */
	public void setAsignaturaFacade(AsignaturaFacade asignaturaFacade) {
		this.asignaturaFacade = asignaturaFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @return the usuarioFacade
	 */
	public UsuarioFacade getUsuarioFacade() {
		return usuarioFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @param usuarioFacade
	 *            the usuarioFacade to set
	 */
	public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
		this.usuarioFacade = usuarioFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @return the listaUsuarios
	 */
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 28/07/2016
	 * @param listaUsuarios
	 *            the listaUsuarios to set
	 */
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the facultadFacade
	 */
	public FacultadFacade getFacultadFacade() {
		return facultadFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param facultadFacade
	 *            the facultadFacade to set
	 */
	public void setFacultadFacade(FacultadFacade facultadFacade) {
		this.facultadFacade = facultadFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @return the listaFacultades
	 */
	public List<Facultad> getListaFacultades() {
		return listaFacultades;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 29/07/2016
	 * @param listaFacultades
	 *            the listaFacultades to set
	 */
	public void setListaFacultades(List<Facultad> listaFacultades) {
		this.listaFacultades = listaFacultades;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @return the programaFacade
	 */
	public ProgramaFacade getProgramaFacade() {
		return programaFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @param programaFacade
	 *            the programaFacade to set
	 */
	public void setProgramaFacade(ProgramaFacade programaFacade) {
		this.programaFacade = programaFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @return the listaProgramas
	 */
	public List<Programa> getListaProgramas() {
		return listaProgramas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @param listaProgramas
	 *            the listaProgramas to set
	 */
	public void setListaProgramas(List<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @return the listaProgramaSelecion
	 */
	public List<Programa> getListaProgramaSelecion() {
		return listaProgramaSelecion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 31/07/2016
	 * @param listaProgramaSelecion
	 *            the listaProgramaSelecion to set
	 */
	public void setListaProgramaSelecion(List<Programa> listaProgramaSelecion) {
		this.listaProgramaSelecion = listaProgramaSelecion;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @return the perfilUsuarioFacade
	 */
	public PerfilUsuarioFacade getPerfilUsuarioFacade() {
		return perfilUsuarioFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param perfilUsuarioFacade
	 *            the perfilUsuarioFacade to set
	 */
	public void setPerfilUsuarioFacade(PerfilUsuarioFacade perfilUsuarioFacade) {
		this.perfilUsuarioFacade = perfilUsuarioFacade;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @return the perUsuario
	 */
	public PerfilUsuario getPerUsuario() {
		return perUsuario;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param perUsuario
	 *            the perUsuario to set
	 */
	public void setPerUsuario(PerfilUsuario perUsuario) {
		this.perUsuario = perUsuario;
	}

}

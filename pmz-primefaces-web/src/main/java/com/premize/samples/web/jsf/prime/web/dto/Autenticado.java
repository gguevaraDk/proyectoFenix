package com.premize.samples.web.jsf.prime.web.dto;

import com.premize.samples.web.jsf.prime.web.dto.enums.EstadoAutenticacionEnum;

public class Autenticado {

	private EstadoAutenticacionEnum estadoAutenticacion;
	private String ticketReferencia;
	private String url;
	
	
	
	public Autenticado(EstadoAutenticacionEnum estadoAutenticacion) {
		super();
		this.estadoAutenticacion = estadoAutenticacion;
	}
	
	public Autenticado(EstadoAutenticacionEnum estadoAutenticacion,
			String ticketReferencia, String url) {
		super();
		this.estadoAutenticacion = estadoAutenticacion;
		this.ticketReferencia = ticketReferencia;
		this.url = url;
	}
	public String getTicketReferencia() {
		return ticketReferencia;
	}
	public void setTicketReferencia(String ticketReferencia) {
		this.ticketReferencia = ticketReferencia;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public EstadoAutenticacionEnum getEstadoAutenticacion() {
		return estadoAutenticacion;
	}
	public void setEstadoAutenticacion(EstadoAutenticacionEnum estadoAutenticacion) {
		this.estadoAutenticacion = estadoAutenticacion;
	}
	
}

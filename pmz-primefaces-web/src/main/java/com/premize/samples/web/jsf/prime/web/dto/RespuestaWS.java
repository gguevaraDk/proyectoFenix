package com.premize.samples.web.jsf.prime.web.dto;

public class RespuestaWS {

	private UsuarioDTO usuarioDTO;
	private ErrorBean errorBean;
	private Autenticado autenticado;
	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	public ErrorBean getErrorBean() {
		return errorBean;
	}
	public void setErrorBean(ErrorBean errorBean) {
		this.errorBean = errorBean;
	}
	public Autenticado getAutenticado() {
		return autenticado;
	}
	public void setAutenticado(Autenticado autenticado) {
		this.autenticado = autenticado;
	}
	
}

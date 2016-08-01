package com.premize.samples.web.jsf.prime.web.dto;


public class ErrorBean {
	public ErrorBean() {
		this.codigo = "0";
		this.descripcion = "OK";
	}

	public ErrorBean(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	private String codigo;
	private String descripcion;


	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

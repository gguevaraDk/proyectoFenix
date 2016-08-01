package com.premize.samples.web.jsf.prime.web.dto;

import java.io.Serializable;

public class ItemDetalleDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8743461170263346489L;
	private double valorTotal;
	private double valorIva;
	private double valorNeto;

	public ItemDetalleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDetalleDTO(double valorTotal, double valorIva, double valorNeto) {
		super();
		this.valorTotal = valorTotal;
		this.valorIva = valorIva;
		this.valorNeto = valorNeto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorIva() {
		return valorIva;
	}

	public void setValorIva(double valorIva) {
		this.valorIva = valorIva;
	}

	public double getValorNeto() {
		return valorNeto;
	}

	public void setValorNeto(double valorNeto) {
		this.valorNeto = valorNeto;
	}

}

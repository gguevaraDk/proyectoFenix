/**
 * 
 */
package com.premize.samples.web.jsf.prime.modelo.enums;

/**
 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
 * @project pmz-primefaces-modelo
 * @class TipoPerfilEnum
 * @since 1/08/2016
 *
 */
public enum TipoPerfilEnum {

	Director(2), Vocero(3), Docente(1);

	private int numero;

	private TipoPerfilEnum(int numero) {
		this.numero = numero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 1/08/2016
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}

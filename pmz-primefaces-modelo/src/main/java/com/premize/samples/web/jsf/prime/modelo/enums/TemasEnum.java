package com.premize.samples.web.jsf.prime.modelo.enums;

public enum TemasEnum {

	ECUACIONES_PRIMER_GRADO("lblEcuacionesDiferenciales", 1,
			"Ecuaciones Diferenciales"), ECUACIONES_SEGUNDO_GRADO(
			"lblEcuacionesSegundoGrado", 2, "Ecuaciones Diferenciales"), METODO_EULER(
			"lblMetodoEuler", 3, "Metodos Númericos"), METODOS_ITERATIVOS(
			"lblMetodoIterativo", 4, "Metodos Númericos"), SUMA_VECTORES(
			"lblSumaVectores", 5, "Algebra Lineal"), RESTA_VECTORES(
			"lblRestaVectores", 6, "Algebra Lineal");

	private String label;
	private int numero;
	private String clave;

	private TemasEnum(String label, int numero, String clave) {

		this.label = label;
		this.numero = numero;
		this.clave = clave;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @author <a href="mailto:gustavo guevara@premize.com">Gustavo Guevara</a>
	 * @since 5/07/2016
	 * @param clave
	 *            the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

}

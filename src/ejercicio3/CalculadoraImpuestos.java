package ejercicio3;

public abstract class CalculadoraImpuestos {

	/**
	 * Operacion que según el impuesto se realizará de una manera.
	 * @param ingresos Parametro que define los ingresos.
	 * @return Devuelve el resultado de la operacion.
	 */
	public abstract double calcularImpuestoTotal(double ingresos);

}

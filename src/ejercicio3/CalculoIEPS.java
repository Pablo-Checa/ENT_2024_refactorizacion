package ejercicio3;

public class CalculoIEPS extends CalculadoraImpuestos {

	
	/**
	 * Operacion para calcular impuestoIEPS.
	 */
	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception {
		double impuesto = 0;
		if (tipoImpuesto == TIPO_IEPS) {
			impuesto = ingresos * 0.05;
		}
		return impuesto;
	}

}

package ejercicio3;

public class CalculoISR extends CalculadoraImpuestos {

	
	/**
	 * Operacion para calcular el impuestoISR
	 */
	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception {
		double impuesto = 0;
		if (tipoImpuesto == TIPO_ISR) {
			if (ingresos < 50000) {
				impuesto = ingresos * 0.20;
			} else {
				impuesto = ingresos * 0.30;
			}
		}
		return impuesto;
	}

}

package ejercicio3;

public class CalculoIVA extends CalculadoraImpuestos {

	/**
	 * Operacion para calcular el impuestoIVA
	 */
	public double calcularImpuestoTotal(double ingresos) {
		
		double impuesto = 0;

		if (ingresos < 10000) {
			impuesto = ingresos * 0.10;
		} else if (ingresos >= 10000 && ingresos < 50000) {
			impuesto = ingresos * 0.15;
		} else {
			impuesto = ingresos * 0.20;
		}

		return impuesto;
	}
}

package ejercicio3;

public class ImpuestoISR extends CalculadoraImpuestos {

	@Override
	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {

		double impuesto = 0;

		if (tipoImpuesto.equals("ISR")) {

			if (ingresos < 50000) {

				impuesto = ingresos * 0.20;

			} else {

				impuesto = ingresos * 0.30;

			}

		}

		return impuesto;
	}
}
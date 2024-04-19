package ejercicio3;

public class CalculadoraImpuestos {

	public static final int TIPO_IVA = 1000; //Siempre es mejor crear estas variables a usar Strings, ya que son inestables.
	public static final int TIPO_ISR = 2000;
	public static final int TIPO_IEPS = 3000;
	
	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception {

		double impuesto = 0;

		if (tipoImpuesto == TIPO_IVA) {

			impuesto = impuestoIVA(ingresos); //Refactorizar operacion

		} else if (tipoImpuesto == TIPO_ISR) {

			impuesto = impuestoISR(ingresos); //Refactorizar operacion

		} else if (tipoImpuesto == TIPO_IEPS) {

			impuesto = impuestoIEPS(ingresos); //Refactorizar operacion

		} else {

			throw new Exception("Tipo de impuesto invalido"); //Siempre cambiar un Syso por una excepcion.

		}

		return impuesto;

	}

	private double impuestoIEPS(double ingresos) {
		double impuesto;
		impuesto = ingresos * 0.05;
		return impuesto;
	}

	private double impuestoISR(double ingresos) {
		double impuesto;
		if (ingresos < 50000) {

			impuesto = ingresos * 0.20;

		} else {

			impuesto = ingresos * 0.30;

		}
		return impuesto;
	}

	private double impuestoIVA(double ingresos) {
		double impuesto;
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

package ejercicio3;

public class ImpuestoIva extends CalculadoraImpuestos {

	@Override
	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {
		double impuesto = 0;
		 if (tipoImpuesto.equals("IVA")) {

			 impuesto = impuestoIva(ingresos); 
		 }
		 
		return impuesto;
	}

	private double impuestoIva(double ingresos) {
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



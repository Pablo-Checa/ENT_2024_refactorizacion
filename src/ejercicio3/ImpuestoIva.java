package ejercicio3;

public class ImpuestoIva extends CalculadoraImpuestos {

	@Override
	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {
		double impuesto = 0;
		 if (tipoImpuesto.equals("IVA")) {

			 if (ingresos < 10000) {

			 impuesto = ingresos * 0.10;

			 } else if (ingresos >= 10000 && ingresos < 50000) {

			 impuesto = ingresos * 0.15;

			 } else {

			 impuesto = ingresos * 0.20;
			 
			 } 
		 }
		 
		return impuesto;
	}
}



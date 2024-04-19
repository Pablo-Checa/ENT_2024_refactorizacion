package ejercicio3;

public class ImpuestoIEPS extends CalculadoraImpuestos {

	@Override
	public double calcularImpuestoTotal(double ingresos, String tipoImpuesto) {
		
		double impuesto = 0;
		
		if (tipoImpuesto.equals("IEPS")) {
			impuesto = ingresos * 0.05;
			
		} else {
			System.out.println("Tipo de impuesto no válido");
		}
		return impuesto;
	}

}

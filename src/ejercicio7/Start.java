package ejercicio7;

public class Start {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		System.out.println("Suma: " + calc.sumar(10, 5));
		System.out.println("Resta: " + calc.restar(10, 5));
		System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
		System.out.println("División: " + calc.dividir(10, 5));

		double area = calc.calcularAreaCirculo(5);
		System.out.println("Área del círculo: " + area);
	    double volumen = calc.calcularVolumenCilindro(5, 9);
		System.out.println("Volumen del cilindro: " + volumen);
	}
}

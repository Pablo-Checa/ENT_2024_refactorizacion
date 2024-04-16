package ejercicio1;

public class Calculadora {

	public int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;

	}

	public int restar(int a, int b) {
		int resultado = a - b;
		return resultado;

	}

	public int multiplicar(int a, int b) {
		int resultado = a * b;
		return resultado;

	}

	public int dividir(int a, int b) {

		if (b == 0) {
			System.out.println("Error: No se puede dividir por cero.");
			return 0;

		} else {
			
			int resultado = a / b;
			return resultado;

		}

	}

}

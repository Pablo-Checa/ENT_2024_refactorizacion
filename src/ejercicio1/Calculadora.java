package ejercicio1;

public class Calculadora {

		private int a;
		private int b;
	
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

	    public static void main(String[] args) {
	        Calculadora calc = new Calculadora();

	        System.out.println("Suma: " + calc.sumar(10, 5));
	        System.out.println("Resta: " + calc.restar(10, 5));
	        System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
	        System.out.println("División: " + calc.dividir(10, 5));
	    }
	}

	


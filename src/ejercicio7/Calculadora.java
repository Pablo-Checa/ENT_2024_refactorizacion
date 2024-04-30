package ejercicio7;

public class Calculadora {
	
	/**
	 * Operacion aritmética para sumar.
	 * @param sumando1 Primer numero
	 * @param sumando2 Segundo numero
	 * @return El resultado de la suma de los parametros
	 */
	public int sumar(int sumando1, int sumando2) {
		return sumando1 + sumando2;
	}

	/**
	 * Operacion aritmetica para restar.
	 * @param minuendo Primer numero
	 * @param sustraendo Segundo numero
	 * @return El resultado de la resta de los parametros.
	 */
	public int restar(int minuendo, int sustraendo) {
		return minuendo - sustraendo;
	}
	/**
	 *Operacion aritmetica para multiplicar.
	 * @param numero1 Primer valor
	 * @param numero2 Segundo valor
	 * @return El resultado de la multiplicacion de los parametros
	 */
	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}
	/**
	 * Operacion aritmetica para dividir.
	 * @param dividendo El numero que va a ser dividido
	 * @param divisor El numero por el que divides
	 * @return El resultado final de la operacion.
	 */
	public int dividir(int dividendo, int divisor) {
		if (divisor == 0) {
			System.out.println("Error: No se puede dividir por cero.");
			return 0;
		}
		return dividendo / divisor;
	}

	/**
	 * Operacion que calcula el Area de un circulo.
	 * @param radio Parametro que se necesita para calcular el area.
	 * @return el resultado del area.
	 */
	public double calcularAreaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	/**
	 * Operacion que calcula el volumen de un cilindro.
	 * @param radio Parametro1 que se necesita.
	 * @param altura Parametro2 que se necesita.
	 * @return Resultado final.
	 */
	public double calcularVolumenCilindro(double radio, double altura) {
		return calcularAreaCirculo(radio) * altura;
	}
}

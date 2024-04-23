package ejercicio4;

public class Calculadora {

	/**
	 * Atributos estáticos que nos indican el significado de la operación que pongamos.
	 */
	public static final int CODIGO_SUMA = 0;
	public static final int CODIGO_RESTA = 1;

	/**
	 * Método que realiza una operación aritmética.
	 * @param numero1 Valor 1 de la operacion.
	 * @param numero2 Valor 2 de la operacion.
	 * @param operacion Tipo de operacion segun los codigos static.
	 * @return La operacion hecha
	 * @throws Exception Excepción que salta si introducimos una operacion incorrecta.
	 */
	public int operacionAritmetica(int numero1, int numero2, int operacion) 
		throws Exception {
		switch(operacion) {
		case CODIGO_SUMA: return numero1 + numero2;
		case CODIGO_RESTA: return numero1 - numero2;
		default: throw new Exception("Operacion Incorrecta");
		}
	}

}

package ejercicio4;

public class Calculadora {

	public static final int CODIGO_SUMA = 0;
	public static final int CODIGO_RESTA = 1;

	public int operacionAritmetica(int a, int b) {

		int tipoOperacion = CODIGO_SUMA;
		int c = 0;
		if (tipoOperacion == CODIGO_SUMA) {
			c = a + b;
		} else {
			c = a - b;
		}
		return c;

	}

}

package ejercicio4ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {
	/**
	 * ArrayList que contiene productos.
	 */
	private List<String> productos = new ArrayList<>();

	/**
	 * Atributos estáticos que nos indican el significado de la operación que pongamos.
	 */
	public static final int ADD = 0;
	public static final int REMOVE = 1;

	/**
	 * Operacion donde se controla que hacer con un producto.
	 * @param producto El producto que queremos controlar
	 * @param operacion La operacion que queremos hacer según los static.
	 * @throws Exception Excepcion que permitirá reconocer los errores que cometamos.
	 */
	
	public void manejarProducto(String producto, int operacion) throws Exception {
		
		if (productos.contains(producto) && operacion == REMOVE) {
			productos.remove(producto);
			
		} else if (!productos.contains(producto) && operacion == ADD) {
			productos.add(producto);
		/**
		 * Parte de errores.
		 */
			
		} else if(operacion == ADD) {
			throw new Exception("No es posible añadir, el producto ya está registrado");
			
		} else if(operacion == REMOVE) {
			throw new Exception("No es posible borrar, el producto no está registrado");
			
		} else throw new Exception("No es posible realizar esa opearción");
	}
}

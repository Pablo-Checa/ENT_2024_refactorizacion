package ejercicio4ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {

	private List<String> productos = new ArrayList<>();

	public void agregarProducto(String producto) {
		if (!productos.contains(producto)) {
			productos.add(producto);
			System.out.println("Producto '" + producto + "' agregado al almacén.");
		} else {
			System.out.println("El producto '" + producto + "' ya existe en el almacén.");
		}
	}

	public void eliminarProducto(String producto) {
		if (productos.contains(producto)) {
			productos.remove(producto);
			System.out.println("Producto '" + producto + "' eliminado del almacén.");
		} else {
			System.out.println("El producto '" + producto + "' no existe en el almacén.");
		}
	}
	
	public void manejarProducto(String producto, boolean agregar) {
		
	}

}

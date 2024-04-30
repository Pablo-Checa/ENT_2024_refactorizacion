package ejercicio5;

public class Cliente {

	/**
	 * Atributos que caracteriza al cliente.
	 */
	private String nombre;
	private String apellido;
	private Direccion direccion;

	/**
	 * Setter del nombre.
	 * @param nombre Parametro nombre nuevo.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del nombre.
	 * @return Devuelve el nombre que haya.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Getter del apellido.
	 * @return Devuelve el apellido que haya.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Setter del apellido.
	 * @param apellido Parametro apellido nuevo.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}

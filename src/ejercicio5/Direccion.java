package ejercicio5;

public class Direccion {

	/**
	 * Atributos de la clase direccion.
	 */
	private String direccion;
	private String ciudad;
	private String codigoPostal;

	/**
	 * Getter de la direccion
	 * @return devuelve la direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Setter de la direccion 
	 * @param direccion Nuevo parametro a setear.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Getter de la ciudad
	 * @return devuelve la ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Setter de la ciudad
	 * @param ciudad Nuevo parametro de ciudad a setear.
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Getter del CodigoPostal.
	 * @return devuelve el CodigoPostal.
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Setter del codigoPostal
	 * @param codigoPostal nuevo parametro del codigoPostal.
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}

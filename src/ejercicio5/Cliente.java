package ejercicio5;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private String ciudad;
	private String codigoPostal;

	// Getters y setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * Operacion que sirve para enviar un correo a un cliente
	 * @param cliente Parametro para introducir el cliente al que queremos enviarle el correo.
	 */
	
    public void enviarCorreo(Cliente cliente) {
       
    	
    }
    
    //No hace falta hacer otra operacion si queremos cambiar la direccion, con el cliente.set bastaría.
	
}

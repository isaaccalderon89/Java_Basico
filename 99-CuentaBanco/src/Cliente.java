
public class Cliente {
	/*
	 * todavia no podras ejecutar este programa, porque nos falta el metodo main que será el punto de partida de la 
	 * aplicacion.Crearemos dicho metodo en otro apartado mas adelante.
	 */
	
	private String dni;
	private String nombre;
	private String telefono;
	private String direccion;
	
	public String consultar() {
		return "El cliente "+this.nombre+
				" vive en "+this.direccion+
				" su telefono: "+this.telefono;
	}

	public Cliente(String dni, String nombre, String telefono, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	

}

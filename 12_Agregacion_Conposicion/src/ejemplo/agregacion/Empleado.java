package ejemplo.agregacion;

public class Empleado {
	//Creamos una sencilla clase empleado con esta estructura
	
	private String nombre; 
	private String telefono;
	private String departamento;
	
	//Constructor con parámetros
	public Empleado(String nombre, String telefono, String departamento) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.departamento = departamento;
	}

	//Getters and setters
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public String ver() {
		return this.nombre + " telefono: "+ this.telefono + " Departamento: "+departamento;
	}

}

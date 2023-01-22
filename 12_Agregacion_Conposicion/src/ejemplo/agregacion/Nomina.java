package ejemplo.agregacion;

public class Nomina {
	//creamos la clase Nómina.
	private double sueldo;
	private Empleado trabajador;
	
	//Constructor con parámetros 
	public Nomina(double sueldo, Empleado trabajador) {
		super();
		this.sueldo = sueldo;
		this.trabajador = trabajador;
	}
/*
 * Observa que el contructor nomina recibe un objeto Empleadom que podrá ser creado externamente y pasado como argumento para
 * ser asignado a la propiedad trabajador. El objeto Empleado es autónomo fuera del objeto Nomina. 
 */
	//generando getters and setters
	public double getSueldo() {
		return sueldo;
	}

	public Empleado getTrabajador() {
		return trabajador;
	}
	
	public String ver() {
		return "Nómina por : "+sueldo+" euros, trabajador: "+trabajador.ver(); 
	}

	
	

}

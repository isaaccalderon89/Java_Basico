
public class Cliente {
	/*
	 * todavia no podras ejecutar este programa, porque nos falta el metodo main que será el punto de partida de la 
	 * aplicacion.Crearemos dicho metodo en otro apartado mas adelante.
	 */
	
	String dni;
	String nombre;
	String telefono;
	String direccion;
	
	public String consultar() {
		return "El cliente "+this.nombre+
				" vive en "+this.direccion+
				" su telefono: "+this.telefono;
	}

}

package ejemplo.composicion;

public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private Motor motor;
	
	//cosntructor con parametros
	public Coche(String matricula, String marca, String modelo, int caballos, int tipoCombustible) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new Motor (caballos, tipoCombustible);
	}

	public Motor getMotor() {
		return motor;
	}

	public String ver() {
		return "Matricula=" + matricula + ", Marca="+ marca +", Modelo="+ modelo + ", Caballos=" + motor.getCaballos() +
				", Tipo Combustible=" + motor.getTipoCombustible();
	}
	/*
	 * Observa que ahora, en lugar de pasar como argumento al contructor un Motor ya crreado, le pasamos los valores de caballos
	 * y tipoCombustibles para crear el objeto Motor dentro del código interno de clase Coche.
	 * 
	 * Para cada objeto Coche contruidom se creará un objeto Motor internamente. 
	 * 
	 * El Motor, al haberse construido dentro del ámbito del Coche compratirá con él dicho ámbito y vigencia (tiempo de vida). 
	 * 
	 * Hemos agregado el método getMotor() para poder accerder al motor desde le objeto Coche.
	 * 
	 *  como has podido comprobar, la diferencia entre agregración y composiuón es muy sutil y dependee de la técnica de progamación 
	 *  utilizada.
	 * 
	 */
}
	



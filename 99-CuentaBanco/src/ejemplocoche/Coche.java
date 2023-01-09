package ejemplocoche;

public class Coche {
	
	//Propiedades privadas 
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int velocidad = 0;
	
	//Constructor con todos los parametros
	public Coche(String matricula, String marca, String modelo, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
	}
	
	public Coche (String marca, String modelo, String color) {
		this.matricula = "Pendiente de matricular";
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
	}
	
	public Coche() {
		this.matricula = "Pendiente de matricular";
		this.marca = "Opel";
		this.modelo = "Corsa";
		this.color = "Gris";
		this.velocidad = 0;
	}
	
	/*
	 * Aquí tenemos tres implementaciones del método constructor, de manera que las posibilidades han mejorado. Tenemos tres maneras diferentes de 
	 * crear un objeto de la clase Coche.
	 * Observa que en todos los casos se están inicializando todas las propiedades, en unos casos con valores recibidios como argumentos 
	 * y en otros asignando valores directamente. 
	 * Ten en cuenta que si a una propiedad no le asignamos ningún valor tendrá por defecto el valor que le asigne la máquina virtual de Java. El valor 
	 * por defecto para cualquier variable numérica (int, float, double, etc.) siempre será 0. El valor por defecto para una variable de tipo boolena es false. 
	 * El valor por defecto para cualquier referencia a un objeto es null. En el caso de las variables de tipo String, como objetos, si no les asigna ninguna cadena
	 * tendrán por defecto null. 
	 */
	
	//Metodos
	public void acelerar() {
		this.velocidad = this.velocidad + 10;
	}

	public void frenar() {
		this.velocidad = this.velocidad - 10;
	}
	public void acelerar(int cuanto) {
		this.velocidad = this.velocidad + cuanto;
	}
	public void frenar(int cuanto) {
		this.velocidad = this.velocidad - cuanto;
	}
	/*
	 * No tenemos dos métodos acelerar(), sino dos implementaciones y dos formas distintas de invocar al método acelerar().
	 * La primera implementacion acelerar 10km/hora y la segunda permite al usuartio especificar un valor de aceleración. 
	 */
	
	public String estadoCoche() {
		return this.marca + " "+ this.modelo + " "+ this.matricula +" "+this.color + " va a una velocidad "+this.velocidad;
	}
	//RECUERDA: las propiedades son variables de memoria y los metodos, funciones.

}

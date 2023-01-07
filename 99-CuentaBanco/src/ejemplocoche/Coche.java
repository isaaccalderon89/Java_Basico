package ejemplocoche;

public class Coche {
	
	//Propiedades privadas 
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int velocidad = 0;
	
	//Constructor con todos los parametros
	public Coche(String matricula, String marca, String modelo, String color, int velocidad) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
	}
	
	//Metodos
	public void acelerar() {
		this.velocidad = this.velocidad + 10;
	}

	public void frenar() {
		this.velocidad = this.velocidad - 10;
	}
	
	public String estadoCoche() {
		return this.marca + " "+ this.modelo + " "+ this.matricula +" "+this.color + " va a una velocidad "+this.velocidad;
	}
	//RECUERDA: las propiedades son variables de memoria y los metodos, funciones.

}

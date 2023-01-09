package mates;//BUENAS PRACTICAS: Para respetar las convenciones los identificadores de paquetes deberan ir en minusculas

public class Triangulo {
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	
	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public String comprobarTipo() {
		if (lado1==lado2 && lado2==lado3) 
			return "Equilátero";
		else if (lado1==lado2 || lado2==lado3 || lado1==lado3)
			return "Isósceles";
		else
			return "Escaleno";
	}
	

}

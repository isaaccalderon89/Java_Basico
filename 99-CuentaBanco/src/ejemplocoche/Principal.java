package ejemplocoche;

public class Principal {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche("5544PJK", "Ford", "Fiesta", "rojo", 0);
		
		miCoche.acelerar();
		miCoche.acelerar();
		
		System.out.println(miCoche.estadoCoche());
		

	}

}

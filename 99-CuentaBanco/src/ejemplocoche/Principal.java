package ejemplocoche;

public class Principal {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche("5544PJK", "Ford", "Fiesta", "rojo", 0);
		Coche miCoche2 = miCoche;
		
		miCoche.acelerar();
		miCoche.acelerar();
		miCoche2.acelerar();
		miCoche2.acelerar();
		
		System.out.println("Mostrando información de miCoche");
		System.out.println(miCoche.estadoCoche());
		System.out.println("Mostrando información de miCoche2");
		System.out.println(miCoche2.estadoCoche());
		
		/*
		 * Hemos creado un objeto de la clase coche llamado miCoche. A continuación hemos creado 'Coche miCoche2 = miCoche;'
		 * con esto no hemos creado un objeto nuevo, sino que estamos apuntando a la misma dirección de memoria.Por este 
		 * motivo se accede al mismo objeto a través de las dos variables.
		 */

	}

}

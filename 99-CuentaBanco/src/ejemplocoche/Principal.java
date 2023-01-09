package ejemplocoche;

public class Principal {

	public static void main(String[] args) {
		
		//Coche miCoche = new Coche("5544PJK", "Ford", "Fiesta", "rojo", 0);
		//Coche miCoche2 = miCoche;
		/*
		miCoche.acelerar();
		miCoche.acelerar();
		miCoche2.acelerar();
		miCoche2.acelerar();
		
		
		System.out.println("Mostrando información de miCoche");
		System.out.println(miCoche.estadoCoche());
		System.out.println("Mostrando información de miCoche2");
		System.out.println(miCoche2.estadoCoche());
		*/
		/*
		miCoche.acelerar();
		miCoche.acelerar(50);
		miCoche.frenar();
		miCoche.frenar(20);
		
		System.out.println("mostrando información de miCoche");
		System.out.println(miCoche.estadoCoche());
		*/
		Coche c1 = new Coche();
		//Crea un Opel Corsa gris
		Coche c2 = new Coche("5544PJK", "ford", "Fiesta", "Rojo");
		//Crea un ford Fiesta rojo matricula 5544
		Coche c3 = new Coche("Suzuki", "Ignis", "Gris");
		// Crea un Suzuki Ignis pendiente de matricular.
		
		System.out.println(c1.estadoCoche());
		System.out.println(c2.estadoCoche());
		System.out.println(c3.estadoCoche());
		
		/*
		 * Hemos creado un objeto de la clase coche llamado miCoche. A continuación hemos creado 'Coche miCoche2 = miCoche;'
		 * con esto no hemos creado un objeto nuevo, sino que estamos apuntando a la misma dirección de memoria.Por este 
		 * motivo se accede al mismo objeto a través de las dos variables.
		 */

	}

}

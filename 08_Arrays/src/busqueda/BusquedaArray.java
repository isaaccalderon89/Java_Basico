package busqueda;

public class BusquedaArray {

	public static void main(String[] args) {
		/*
		 * En este apartado aprenderas la busqieda secuencial y la busqieda binaria. 
		 * 
		 * ALGORITMO DE BUSQUEDA SECUENCIAL
		 * Se trata de buscar un elemento determinado en el vector recorriendo todos los elementos desde la 
		 * posicion 0 hasta que lo encontremos, o bien hasta que lleguemos al final del vector sin encontrarlo.
		 * 
		 * Sirve igual para buscar vectores ordenados que desordenados. 
		 * 
		 */
		System.out.println("Vamos a ver un ejemplo de busqueda secuencial");
		System.out.println("\n*******************************************");
		
		//declaracion de un vector
		String nombre[] = new String [10];
		
		//Inicializacion de los valores del vector.
		nombre[0] = "pepe";
		nombre[0] = "Juan";
		nombre[0] = "Luis";
		nombre[0] = "Alicia";
		nombre[0] = "Rosa";
		nombre[0] = "Carlos";
		nombre[0] = "Pedro";
		nombre[0] = "Lucas";
		nombre[0] = "Maria";
		nombre[0] = "Carlota";
		
		//Algoritmo de busqueda para lozalizar a Alicia. 
		String buscado = "Alicia";
		int i=0;
		while (i<10 && !nombre[i].equals(buscado)) {
			i=i+1;
		}
		if (i==10)
			System.out.println("no encontrado");
		else
			System.out.println("Encontrado en posición: "+i);
		
		/*
		 * La expresion "nombre[i].equals(buscado)" compara la cadena situada en la posicion de i del array con el 
		 * contenido de la variable buscado.
		 */
	}
	
}

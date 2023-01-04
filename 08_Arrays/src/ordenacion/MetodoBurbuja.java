package ordenacion;

public class MetodoBurbuja {

	public static void main(String[] args) {
		/*
		 * El metodo burbuja consiste en ir comparando cada elelemtno del array con el siguiente e intercambiarlos
		 * si no estan ordenados de la manera correcta. Este proceso tendra que repetirse varias veces hasta que el 
		 * array este completamente ordenado. 
		 * 
		 * https://es.wikipedia.org/wiki/Ordenamiento_de_burbuja Copia y pega esta URL para obtener una buena explicacion
		 */
		
		
		//Creamos un array desordenado
		String nombre [] = new String[5];
		
		nombre[0] = "Lucas";
		nombre[1] = "Maria";
		nombre[2] = "Alicia";
		nombre[3] = "Rosa";
		nombre[4] = "Carlos";
		
		//Ordenamos por el metodo burbuja
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				if (nombre[j].compareTo(nombre[j+1])>0) {
					String aux = nombre[j];
					nombre [j] = nombre[j+1];
					nombre[j+1] = aux;
				}
			}
		}
		
		//Muestra por pantalla los 5 nombres ya ordenados
		for(int i=0; i<=4; i++) {
			System.out.println(nombre[i]);
		}
			
	}

}

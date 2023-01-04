package busqueda;

public class BusquedaBinaria {

	public static void main(String[] args) {
		/*
		 * ALGORITMO DE BUSQIEDA BINARIA O DICOTOMICA 
		 * 
		 * A diferencia de la anterior solo puede usarse en vectores ordenados. Consiste en determinar el elemento central 
		 * del vector y utilizarlo para compararlo con el elemento buscado. Si el elemento buscado es menos que el central, 
		 * sabremos que el elemento buscado está en la mitad inferior. Si el elemento buscado es mayor sabremos que está en la 
		 * mitad inferior. Si el elemento buscado es mayor, sabremos que está en la mitad superior. Si el elemento buscado 
		 * es igual al central habremos terminado la busqueda. 
		 * 
		 * Por lo explicado anteriormente llegamos a la conclusion de quehay que dividir el array en sdos subarrays mas pequeños,
		 * acotando asi las busqueda a la mitad del array. Despues volveremos a dividr el subarray en otros dos y asi sucesivamente
		 * hasta completar la busqueda. Este procedimiento resulta mucho mas rapido de la busqueda secuencial,pero no hay que olvidar
		 * que es imprescindible que el array esté ordenado.
		 * 
		 */
		
		String nombre[] = new String[10];
		
		nombre[0] = "Alicia";
		nombre[1] = "Carlos";
		nombre[2] = "Carlota";
		nombre[3] = "Juan";
		nombre[4] = "Lucas";
		nombre[5] = "Luis";
		nombre[6] = "Maria";
		nombre[7] = "Pedro";
		nombre[8] = "Pepe";
		nombre[9] = "Rosa";
		
		String buscado = "Maria";
		
		int inicio = 0;
		int fin = 9;
		int posicion = -1;
		
		while (posicion==-1 && inicio <= fin) {
			int medio = (int)((inicio+fin)/2);
			if(nombre[medio].equals(buscado)) {
				posicion = medio;
			}
			else {
				if (buscado.compareTo(nombre[medio])<0) {
					fin = medio-1;
				} else {
					inicio = medio+1;
				}
					
			}
		}
		if (posicion > -1)
			System.out.println("Encontrado en posicion "+posicion);
		else
			System.out.println("No encontrado");
		
		/*
		 * La expresio "buscado.compareTo(nombre[medio])" compara el contedio de la variable buscado con la posicion del 
		 * array determinada por el valor de la variable medio. 
		 * Si las dos cadenas con iguales, retorna 0. Si la primera cadena es menor que la segunda retorna un numero negativo y 
		 * si la primera cadena es mayor que la segunda retorna un numero positivo.
		 */
	}

}

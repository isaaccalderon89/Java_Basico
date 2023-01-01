
public class Concepto {

	public static void main(String[] args) {
		/*
		 * Recuerda, un array es un conjunto de elementos organizados en memoria en posiciones contiguas.
		 * Todos los elementos son del mismo tipo y se puede aceder a ellos a partir de subindices. 
		 * 
		 * La dimension de un array es el numero de subindices que son necesario para acceder al elementos. 
		 * La longitud de un array es el numero de elementos que puede almacenar. 
		 * 
		 * 
		 * Java alamacena los arrays como un tipo especial de objeto con sus propiedades y métodos. En este apartado 
		 * veremos un ejemplo de vector en Java y otro ejemplo de matriz. 
		 * Los subindices en java siempre empiezan con el valor 0.
		 */
		
		//Declaracion del vector
		String nombre[] = new String[10];
		
		//Inicializacion de los valores del vector. 
		nombre[0] = "pepe";
		nombre[1] = "Juan";
		nombre[2] = "Luis";
		nombre[3] = "Alicia";
		nombre[4] = "Rosa";
		nombre[5] = "Carlos";
		nombre[6] = "Pedro";
		nombre[7] = "Lucas";
		nombre[8] = "Maria";
		nombre[9] = "pepe";
		nombre[10] = "Carlota";
		
		//Recorrido del vector
		for (int i=0; i<nombre.length; i++) {
			System.out.println(nombre[i]);
			
			/*
			 * Para recorrer los elementos del vector necesitamos una estructura repetitiva de tipo para(for)
			 * von un contador que tome los valores de las distintas posiciones del array. 
			 * 
			 * La propiedad length contiene el numero total de elementos del array , en nuestro ejemplo 
			 * contendrá el valor 10. Como las posiciones van del 0 al 9, la condicion i<nombre.length
			 * llegará hasta el 9.
			 * 
			 * 
			 * OTRO EJEMPLO
			 * // Declaración del vector.
			 * 
				String nombre[] = {"Pepe", "Juan", "Luis", "Alicia", "Rosa"};
		
				// Recorrido del vector.
				for (int i=0; i<nombre.length; i++) {
					System.out.println(nombre[i]);
		}
		
			 */
		}
	}

}

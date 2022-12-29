
public class Acumuladores {
	
	public static void main(String[]args) {
		/*
		 * Un acumulador es una variable de memoria cuyo valor se incrementa sucesivas veces en cantidades variables. 
		 * Se utiliza en aquellos casos en los que se desea obtener el total acumulado de una serie de valores.
		 * 
		 * Normalmente habra que inicializar el acumulador a 0. En caso de que se acumule por multiplicación
		 * habrá que inicializarlo con el valor 1.
		 */
		int suma = 0; 
		long prod = 1;
		int c = 8;
		
		do {
			c=c+2;
			suma=suma+c;
			prod = prod*c;
		}
		while (c<30);
		System.out.println("suma: "+suma);
		System.out.println("Producto: "+prod);
		
	}

}

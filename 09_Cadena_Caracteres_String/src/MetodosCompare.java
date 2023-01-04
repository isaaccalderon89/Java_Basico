
public class MetodosCompare {

	public static void main(String[] args) {
		/*
		 * METODOS COMPARETO() Y COMPARETOIGNORECASE()
		 * 
		 * El metodo compareTo() compara la cadena del objeto a la que se aplica con la cadena pasada como argumento. 
		 * Si son iguales devuelve 0, si la primera cadena es menor que la segunda devuelve un numero negativo, y si la
		 * primera cadena es mayor que la segunda devuelve un numero positivo.
		 * El metodo compareToIgnoreCase() funciona igual pero no distingue entre mayusculas y minusculas.  
		 */
		String texto = "pepe";
		
		System.out.println(texto.compareTo("Pepe"));
		System.out.println(texto.compareTo("Rosa"));
		System.out.println(texto.compareTo("Alicia"));

	}

}

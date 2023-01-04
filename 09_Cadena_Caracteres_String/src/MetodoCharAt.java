
public class MetodoCharAt {

	public static void main(String[] args) {
		/*
		 * El metodo charAt() devuelve el caracter que ocupa la posicicion indicada en el argumento. El primer
		 * caracter ocupa la posicion 0.
		 */
		String texto = "Cocodrilo";
		//System.out.println(texto.charAt(0));
		//System.out.println(texto.charAt(3));
		
		/*
		 * con la ayuda de un for y el metodo length() podemos recorrer todo los elementos de la cadena. 
		 */
		for (int i = 0; i<texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}

}

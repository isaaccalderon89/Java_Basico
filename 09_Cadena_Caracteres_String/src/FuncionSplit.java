
public class FuncionSplit {

	public static void main(String[] args) {
		/*
		 * La funcion split() devuelve un array de objetos String que resulta la division de la cadena 
		 * del objeto al que se aplica en subcadenas divididas por el caracter especificado como argumentos.
		 */
		
		String texto = "Hola-Hello-Hallo-Ciao-Ni hao-salut-ahoj";
		String [] subcadenas = texto.split("-");
		for (int i=0; i<subcadenas.length; i++) {
			System.out.println(subcadenas[i]);
		}
	}

}

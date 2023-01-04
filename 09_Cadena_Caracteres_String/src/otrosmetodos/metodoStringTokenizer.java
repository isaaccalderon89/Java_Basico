package otrosmetodos;

import java.util.StringTokenizer;

public class metodoStringTokenizer {

	public static void main(String[] args) {
		/*
		 * La calse StringTokenizer también representa a una cadena de caracteres como String, pero en los casos en que 
		 * necesitamos dividir la cadena en varias piezas o tokens.
		 */
		StringTokenizer texto = new StringTokenizer("Hola-Hello-Hallo-Ciao-Ni hao-salut-ahoj", "-");
		System.out.println("Numero de tokens: "+texto.countTokens());
		while(texto.hasMoreTokens()) {
			String subcadena = texto.nextToken();
			System.out.println(subcadena);
		}

	}

}

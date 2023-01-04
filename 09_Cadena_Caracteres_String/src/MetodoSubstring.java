
public class MetodoSubstring {

	public static void main(String[] args) {
		/*
		 * El metodo substring() extrae de la cadena principal una subcadena. Puede utilizarse de dos formas distintas
		 * Si pasamos unnumero entero como argumento, devuelve una subcadena a partir de la posicion indicada en el
		 * argumento y hasta el final. si pasamos dos numeros enteros como argumentos, estos son interpretados como las 
		 * posiciones de incio y fin de la subcadena a extraer.  
		 */
		
		String texto = "La crita mágica";

		String cadena1 = texto.substring(3);
		String cadena2 = texto.substring(3, 8);
		System.out.println(cadena1); 
		System.out.println(cadena2); 
	}

}


public class MetodoComparandoCadenas {

	public static void main(String[] args) {
		/*
		 * COMPARANDO CADENAS: EQUALS() Y EQUALSIGNORECASE()
		 * 
		 * El metodo equlas() compara la cadena del objeto al que se aplica con otra cadena pasada como argumento. 
		 * Si las dos cadenas son iguales devuelve tre y si las dos cadenas son distintas false.
		 * 
		 * El metodo equlasIgnoreCase() funciona igual que el metodo equals() con la diferencia de que no distingue
		 * entre mayusculas y minisculas. En el ejemplo que sigue la primera comparacion es false(las cadenas son distintas)
		 * y la segunda es true (las dos cadenas son iguales porque no se distingue entre mayusculas y minusculas).
 		 */
		
		String texto = "La cripta mágica";
		boolean iguales1 = texto.equals("LA CRIPTA MAGICA");
		boolean iguales2 = texto.equalsIgnoreCase("LA CRIPTA MÁGICA");
		System.out.println(iguales1);// no son iguales
		System.out.println(iguales2);//son iguales
		
		/*
		 * No debes comparar cadenas de caracteres utilizando el operador ==, puedes llevarte sospresas inesperadas. 
		 * La forma correcta es utilizar el metodo equals() que acabas de aprender. Mas adelante comprenderas el motivo
		 * cuando entiendas mejor el funcionamiento de los objetos. 
		 */

	}

}

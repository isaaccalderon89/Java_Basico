
public class MetodoIndexOf {

	public static void main(String[] args) {
		/*
		 * El metodo indexOf() devuelve la posicion que ocupa la primera ocurrencia del caracter especificado como argumento
		 * dentro de la cadena del objeto al que se aplica. Si el caracter no se encientra dentro de la cadena devuelve -1.
		 */

		String texto = "Cocodrilo ";
		int posicion = texto.indexOf('d');
		System.out.println(posicion);
		/*
		 * Tambien puede utilizarse para localizar la posicion de una subcadena en lugar de solo un caracter.
		 */
		int posicion2 = texto.indexOf("ril");
		System.out.println(posicion2);
	}

}

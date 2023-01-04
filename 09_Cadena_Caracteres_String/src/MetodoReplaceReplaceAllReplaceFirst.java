
public class MetodoReplaceReplaceAllReplaceFirst {

	public static void main(String[] args) {
		/*
		 * Los metodos replace(), replaceAll() y replaceFirst() sirven para reemplazar parte de la cadena 
		 * del objeto al que se aplican, aunque funcionan de manera diferente. 
		 */
		String texto = "Este gato es un gato persa que se come la comida de mi gato. ";
		String cadena1 = texto.replace('a', 'e');
		String cadena2 = texto.replaceFirst("gato", "perro");
		String cadena3 = texto.replaceAll("gato", "perro");
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		System.out.println(cadena3);
		

	}

}

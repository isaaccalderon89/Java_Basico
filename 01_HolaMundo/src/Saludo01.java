
public class Saludo01 {

	public static void main(String[] args) {
		
		//AHORA VAMOS A ANALIZAR EL CODIGO MAS DETENIDAMENTE
		
		System.out.println("Hola Mundo Soy Isaac Calderón");

		/*
		 * En este caso "Saludo01" es el nombre de la clase Java. Una aplicacion pude de contener varias clases
		 * pero sera la que contenga la "funcion main()" la que pueda arrancar la aplicacion.
		 * 
		 * "System.out" hace referencia al flujo de salida de datos de la pantalla.
		 * 
		 * "public y static" son modificadores para el metodo.
		 * 
		 * La palabra "void" indica que la funcion main no tiene que devolver ningun valor. 
		 * 
		 */
		System.out.println("\nAhora vamos a ver los elementos indispensables ;-)");
		
		/*
		 * LAS COSTANTES
		 * Es un dato que permanece inalterable a lo largo de la ejecución de un programa. Se guardará en una 
		 * direccion de memoria determinada. 
		 * Pueden ser: numericas, de caracter, alfanumericas o de cadena o booleanas
		 */
		System.out.println("\nESTOS SON CONSTANTES");
		
		//Para declarar una constante utilizamos la parabra reservada "final"
		final double PI = 3.1415926;
		System.out.println(PI);//imprime PI, no se le puede volver a asignar ningun valor ya que es una constante
		 /*
		 * LAS VARIABLES
		 * Es un elemento de un programa que permite almacenar un dato que podrá ser modificado a lo largo del 
		 * programa.
		 * Pueden ser: numericas, de caracter, alfanumericas o de cadena o booleanas.
		 */
		System.out.println("\nESTOS SON VARIABLES");
		
		String cadenaTexto = "Estamos probando las variables";
		int i;//Puede declararse primero la variable e indicar de que tipo va a ser
		i=3;//Aqui estamos asignando el valor a la variable
		System.out.println(cadenaTexto + " | " + i);
		 /*
		 * LAS OPERADORES
		 * Son simbolos que realizan operaciones sobre uno o mas operandos, tales como suma, resta, comparacion, etc.
		 * Pueden ser: Aritmeticos( + - * / % ), unarios(++ -- -), de asignacion(= += -= /= %=), concatenacion(+),
		 * relacionales(< <= > >= != ==), logicos(&& and, || or, ! not), condicional(?), 
		 * otros operadores especiales([] () new) y operadores de bits.
		 */
		System.out.println("\nESTOS SON OPERADORES");//Vamos a crear una clase mas adelante para ver un ejemplo de cada uno
		
		int a = 25;
		int b = 5;
		
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		System.out.println("a%b = "+(a%b));
		
		 /*
		 * 
		 * LAS EXPRESIONES
		 */
	}

}

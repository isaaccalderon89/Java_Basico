
public class EjemploEstructura {

	public static void main(String[] args) {
		/*
		 * ESTRUCTURA GENERAL DE UN PROGRAMA JAVA: BLOQUES Y SENTENCIAS
		 * 
		 * Todo programa Java está estructurado en bloques y cada bloque cuenta con un conjunto de sentencias. 
		 * 
		 * 1. LOS BLOQUES DE CODIGO
		 * 
		 * Java está estructurado en bloques y y cada bloques comienza y termina con un simbolo de llave. 
		 * Los bloques, ademas de brindar un sistema de estructuracion jerarquico, 
		 * delimitan el ambito de las variables. 
		 * 
		 * 2. SENTENCIAS
		 * 
		 * Cada sentencia Java representa una tarea sencilla y termina con un punto y coma (;).
		 */

		int x = 25;//Sentencia 1
		x = x + 3;//Sentencia 2
		System.out.println(x);//Sentencia 3
		
		/*
		 * IDENTIFICADORES JAVA
		 * 
		 * Todo programa necesita identificadores. Los identificadores son las palabras que nos inventamos 
		 * para dar nombre a las variables, constantes, funciones, calses, etc.
		 * 
		 * 1.IDENTIFICADORES
		 * Son las palabras que usamos para identificar nombres de clases, variables, constantes, paquetes, metodos, etc.
		 * 
		 * No pueden contener espacios en blanco 
		 * Son KEYS SENSITIVE
		 * Pueden estar formados por una combinacion de letras, numeros y los caracteres especiales subrayado (_) 
		 * y dolar($).
		 * El primer caracter debe ser una letra, un caracter de subrayado o un dolar.
		 * El primer caracter nunca puede ser un numero.
		 * 
		 *  
		 *  2.PALABRAS RESERVADAS
		 *  
		 *  Son identificadores que no se pueden utilizar porque tienen un significado especial para el compilador.
		 */
		System.out.println("**********************");
		System.out.println("Ahora vamos a ver las convenciones de Java");
		/*
		 * CONVENCIONES PARA DAR LOS NOMBRES A LOS IDENTIFICADORES
		 * 
		 * Son las buenas practicas. 
		 * 
		 * IDENTIFICADOR DE CLASE:
		 * 
		 * - Comenzar por una letra mayuscula y continuar en minusculas salvo el caso de palabras compuestas. 
		 * - Deben ser sustantivos en signular. 
		 * 
		 * IDENTIFICADOR DE VARIBALES: 
		 * 
		 * - Comenzar con una letra minuscula y continuar en minuscula salvo en el caso de las palabras compuestas. 
		 * -Conviene que sean sustantivos en singular. 
		 * 
		 * IDENTIFICADOR DE CONSTANTES:
		 * 
		 * - Estan formados completamente por letras mayusculas. 
		 * - Seran sustantivos. 
		 * 
		 * IDENTIFICADOR DE METODOS O FUNCIONES: 
		 * 
		 * - Comenzar con una letra minuscula y continuar en minusculas, salvo en el caso de las palbaras compuestas. 
		 * - conviene que sean verbos sustantivos o combinaciones de verbo/sustantivo. 
		 * 		Ejemplo: alquilar(), alquilarVivienda().
		 * 
		 * IDENTIFICADOR DE PAQUETES: 
		 * 
		 * - Estan formados unicamente por letras minusculas. 
		 * - Normalmente son sustantivos. 
		 */
	}

}
                    
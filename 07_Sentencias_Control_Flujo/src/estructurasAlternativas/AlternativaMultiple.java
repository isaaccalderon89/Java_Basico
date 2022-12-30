package estructurasAlternativas;

public class AlternativaMultiple {

	public static void main(String[] args) {
		/*
		 * Dependiendo del contenido de una variable o del resultado de una expresion se ejecutara un bloque 
		 * determinado de intrucciones dentro de un conjunto de ellos. 
		 */
		//Según el valor de la variable dia, escribirá una cadena u otra en pantalla. 
		
		int dia = 8;
		switch (dia) {
		
		case 1:
			System.out.println("Hoy es lunes");
			break;
			
		case 2:
			System.out.println("Hoy es martes");
			break;
		
		case 3:
			System.out.println("Hoy es miercoles");
			break;
			
		case 4:
			System.out.println("Hoy es jueves");
			break;
			
		case 5:
			System.out.println("Hoy es viernes");
			break;
			
		case 6:
			System.out.println("Hoy es sábado");
			break;
			
		case 7:
			System.out.println("Hoy es domingo");
			break;
			
		default:
			System.out.println("El numero "+dia+" no es un dia de la semana");
		}

		/*
		 * La sentencia switch de java va evaluando los distintos casos hasta encontrar uno que se cumpla. Cuando uno 
		 * de los casos se cumple ejecuta todos hasta terminar el switch. Por ese motivo hay una sentencia break para 
		 * evitar que se ejecuten el resto de casos.
		 * Si no se ha ejecutado ninguno de los casos se ejecutará el bloque default. 
		 * 
		 * Es posible hacer que varios case ejecuten el mismo codigo de bloque.
		 * 
		 * La expresion a evaluar pueden ser de diferentes tipos.
		 */
	}

}

package estructurasAlternativas;

public class AlternativaDoble {

	public static void main(String[] args) {
		/*
		 * Si se cumple una condicion se ejecuta un bloque de codigo y si no se cumple se ejecuta 
		 * otro bloque de codigo diferente.  
		 */
		int edad = 25;
		
		if (edad<18) {
			System.out.println("Es menor de edad");
		} else {
			System.out.println("Es mayor de edad");
		}
		
		/*
		 * VARIOS IF EN ESCALERA 
		 * 
		 * Dentro de un bloque 'if' o dentro de un bloque 'else', puede ir cualquier grupo de instrucciones, 
		 * incluso otro 'if'. Esto puede formar lo que se llama 'if' anidados o en escalera. 
		 */
		int edad1= 12;
		
		if (edad < 13) {
			System.out.println("infantil");
		} else {
			if (edad < 18) {
				System.out.println("Adolescente");
			} else {
				if (edad < 40) {
					System.out.println("Joven mayor de edad");
				}else {
					if (edad < 65) {
						System.out.println("Adulto mayor de edad");
					} else {
						System.out.println("Jubilado");
					}
				}
			}
		}
		/*
		 * Esto resulta algo engorroso por eso es recomenable el uso de 'else if'
		 * 
			 int edad = 12;
				if (edad<13) {
					System.out.println("Infantil");
				}
				else if (edad<18){
					System.out.println("Adolescente");
				}
				else if (edad<40) {
					System.out.println("Joven mayor de edad");
				}
				else if (edad<65) {
					System.out.println("Adulto mayor de edad");
				}
				else {
					System.out.println("Jubilado");
				}
		 */
	
	}

}

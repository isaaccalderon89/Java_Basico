
public class OperadoresLogicos {

	public static void main(String[] args) {
		/*
		 * Los operadores lógicos se utilizan para construir expresiones de tipo booleano(rsultado verdadero o falso)
		 * más complejas. 
		 * 
		 * && (and): Une dos expresiones booleanas. El resultado final será verdadero si las dos expresiones 
		 * 			son verdaderas.
		 * || (Or): Une dos expresiones booleanas. El resultado  final será verdadero si las dos o una de 
		 * 			las expresiones es verdadera. 
		 * !(not): Se aplica a un solo operando y cambia su valor de verdadero a falso o viceversa. 
		 */
		System.out.println("Estamos viendo los operadores lógicos");
		
		int a = 3;
		int b = 5;
		boolean evaluacion;
		
		evaluacion = a>b && b>1;
		System.out.println(evaluacion);
		
		evaluacion = a>b || b>1;
		System.out.println(evaluacion);
		
		evaluacion = !(a>b);
		System.out.println(evaluacion);

	}

}

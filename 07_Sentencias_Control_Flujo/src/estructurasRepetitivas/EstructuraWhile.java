package estructurasRepetitivas;

public class EstructuraWhile {

	public static void main(String[] args) {
		/*
		 * Una estructura mientras (While) permite ejecutar un bucle mientras se cumpla una condicion. 
		 * 
		 * Existen dos tipos de variantes para la estructura while. 
		 * 
		 * 1 CONDICION/ACCION. Primero evalua la condicion y luego ejecuta el bloque de acciones. En este caso el bucle 
		 * 						puede ejecutarse de 0 a infinita veces. 
		 * 
		 * 2 ACCION/CONDICION. Primero ejecuta el bloque de acciones y luego evalua la condicion. En este caso el bucle 
		 * 						puede ejecutarse de 1 a infinitas veces. 
		 */
		
		System.out.println("Condicion / Accion: contar de1 1 al 5 ");
		
		int i = 0;
		while (i < 5) {
			i = i+1;
			System.out.println(i);
		}

		System.out.println("\n******************************************");
		System.out.println("\nAccion / Condicion: contar de1 1 al 5 ");
		
		int a = 0;
		do{
			a = a+1;
			System.out.println(a);
		} while (a<5);
		
		
	}

}

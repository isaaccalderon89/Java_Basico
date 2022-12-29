
public class ContadorBucle {

	public static void main(String[] args) {
		/*
		 * CONTADORES
		 * 
		 * Un contador es una variable de memoria cuyo valor se incrementa en una cantidad fija positiva o negativa. 
		 * Normalmente va asociado a un bucle.
		 * 
		 * Es necesario inicializar previamente el contador.
		 * 
		 * Existen dos tipo de contadores. En este caso, vamos a ver el CONTADOR DE CONTROL DE BUCLE
		 * 
		 * CONTADOR DE CONTROL DE BUCLE
		 * Un contador de control de bucle sirve para determinar el momento en el que debe termianr un bucle 
		 * o iteracion. 
		 */
		int c = 0;//Es igual que una variable, lo unico que cambia es su uso. 
		
		do {
			c=c+1;
			System.out.println(c);
		}
		while (c<10);
			

	}

}

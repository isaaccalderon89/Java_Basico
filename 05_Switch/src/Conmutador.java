
public class Conmutador {

	public static void main(String[] args) {
		/*
		 * CONMUTADOR, INTERRUPTOR O SWITCH
		 * 
		 * Los conmutadores son variabvles de memoria que pueden tomar dos valores excusivos:
		 * true/false, 0/1, 1/-1, etc.
		 * 
		 * 1. Recordar sucesos 
		 * Recordar un determinado punto del programa la cocurrencia o no de un suceso anterior. 
		 * 
		 * Para ponerlo en practica vamos a crear un programa Java que genera 10 numeros al azar y luego es capaz
		 * de recordar si entre ellos entro un 10.
		 */
		System.out.println("Ahora vaqmos a ver como Recordar Sucesos");
		
		int c = 0;
		boolean sw = false;
		
		do {
			c = c + 1;
			int azar =(int)(Math.random()*10+1);
			System.out.println(azar);
			if(azar==10) {
				sw=true;
			}
			
		} while(c<10);
		System.out.println("¿Se ha encontrado un 10? "+sw);
		
		System.out.println("*****************************");
		System.out.println("Ahora vamos a ver la Ejecucion Alternativa");
		
		/*
		 * 2. Ejecucion alternativa
		 * Para hacer que dos acciones se ejecuten alernativamente dentro de un bucle. 
		 * 
		 * El siguiente programa permite mostrar alternativamente los mensajes "Hola" y "Adios"
		 * en funcion de la variable SW, que tomara los valore 1 y -1.
		 */
		c = 0;
		int sw1 = -1;
		
		do {
			c = c + 1;
			sw1 = -sw1;
			if(sw1==1) {
				System.out.println("Hola");
			}
			else {
				System.out.println("Adios");
			}
		}while(c<10);
	}

}

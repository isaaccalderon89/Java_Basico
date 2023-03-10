
public class ContadorSucesos {

	public static void main(String[] args) {
		/*
		 * CONTADOR DE SUCESOS
		 * 
		 * Un contador de sucesos sirve para contal el numero de veces que se cumpla una condicion.
		 * 
		 * Para ponerlo en practica vamos a crear un programa que genera 10 numero al azar del 1 al 10 y utiliza la 
		 * variable mayor5 como contador para controlar el numero de veces que se genera un numero mayo de 5.
		 * 
		 * La expresion Math.random() geneera un numero al azar entre 0 y 1 con decimales (sin incluir el 0 y el 1). 
		 * Como nosotros queremos un numero entre 1 y el 10, lo estamos multiplicando por 10 y sumandole 1 para 
		 * anular el 0.
		 * Luego lo convertimos en un numero entero, con lo que eliminamos los decimales. 
		 * 
		 * Math es una clase y random() es un metodo que pertenece a la clase Math.
		 */
		int c = 0;
		int mayor5 = 0;
		
		do {
			c=c+1;
			int azar = (int)(Math.random()*10+1);
			System.out.println(azar);
			if (azar>5) {
				mayor5 = mayor5+1;
			}

		}
		while(c<10);
		System.out.println("Mayores de 5: "+mayor5);

	}

}

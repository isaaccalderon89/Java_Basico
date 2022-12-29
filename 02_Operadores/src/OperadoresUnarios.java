
public class OperadoresUnarios {

	public static void main(String[] args) {
		/*
		 * Los operadores Unarios trabajan con un solo operando numérico, entero o real.
		 * 
		 * ++(suma una unidad)
		 * --(resta una unidad)
		 * - (cambio de signo)
		 */
		System.out.println("Ahora vamos a ver los operadores Unarios");
		int a = -25;
		int b = 36;
		
		System.out.println(-a);//Aqui cambia el sigo de la variable 
		b++;//Estamos indicando que a la variable 'b' le sume una unidad
		System.out.println(b);
		b--;//Le estamos pidiendo que reste una unidad
		System.out.println(b);//como el valor de 'b' ha cambiado, al restarlo el resultado es 36
		
		/*
		 * Sobre los operadore ++ y -- hay que tener en cuenta que pueden colocarse antes o después del operando
		 */
		System.out.println("***************************");
		a = 5;
		b=a++;
		System.out.println(a);//vemos que la maquia virtual de java realiza dos operaciones
		System.out.println(b);//Al estar los operadores despues de la a el valor de 'b' se asigna a 5 
		//el valor de a cambia a 6
		
		System.out.println("***************************");
		
		a=5;
		b=++a;
		System.out.println(a);
		System.out.println(b);
		

	}

}

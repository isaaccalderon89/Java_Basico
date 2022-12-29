
public class OperadoresCondicionales {

	public static void main(String[] args) {
		/*
		 * El operador condicional resuleve una expresion u otra en funcion del cumplimiento de una condicion
		 * 
		 * ? (condicional)
		 */
		
		System.out.println("Estamos viendo el operador condicional");
		
		float precio = 50.40F;
		float descuento = (precio<50F)?precio * 0.5F : precio*0.10F;
		
		System.out.println("Precio: "+precio);
		System.out.println("Descuento: "+descuento);
		System.out.println("Total: "+(precio-descuento));
	}

}

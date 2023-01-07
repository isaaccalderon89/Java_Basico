
public class ClienteTest {

	public static void main(String[] args) {
		
		
		Cliente cli1 = new Cliente("53673823B","Isaac Calderón","625975190","C/ Silfide");//Con esta sentencia estas creando un objeto de la clase Cliente.
		/*
		 * Cuando escribimos new Cliente(...) en realidad estamos invocando al metodos constructor pasando cuatro valores
		 * que son recibidos por las cuatro par de la funcion. Los argumentos son variables locales, es decir, su ambito
		 * de actuacion es exclusivamente la funcion donde se sacan.
		 * 
		 * Dentro del codigo constructor la palabra dni hace referencia al argumento, mientras que this.dni hace referencia a 
		 * la propiedad.
		 * 
		 * Ahora mismo las propiedades de los objetos de la clase Cliente siguen siendo privadas, pero podemos establecer 
		 * su valor a traves del constructor y consultarlas a traves del metodo consultar();
		 * 
		 * GETTER AN SETTER
		 * ----------------
		 * Se denomina metodos GET los que tienen como mision retornar el valor de una de las propiedades. 
		 * Se denomina metodos SET los que tienen como objeto establecer o modificar el valor de una propiedad.
		 */

		cli1.setDireccion("Torrejon de ardoz");
		System.out.println(cli1.consultar());
		System.out.println("DNI: "+cli1.getDni());

	}

}

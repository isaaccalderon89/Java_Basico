
public class ClienteTest {

	public static void main(String[] args) {
		
		
		Cliente cli1 = new Cliente();//Con esta sentencia estas creando un objeto de la clase Cliente.
		
		cli1.dni = "53673823B";
		cli1.nombre = "Isaac Calderón";
		cli1.direccion = "C/ Silfide";
		cli1.telefono = "625975190";
		
		System.out.println(cli1.consultar());

	}

}

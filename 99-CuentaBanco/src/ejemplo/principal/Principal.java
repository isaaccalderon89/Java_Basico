package ejemplo.principal;

public class Principal {
	
	private static int num = 25;
	private static String decirMensaje() {
		return "hola Mundo";
	}
	public static void main(String[] args) {
		
		System.out.println(num);
		System.out.println(decirMensaje());
	}

}

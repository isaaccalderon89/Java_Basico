package mates;

public class TablaMultiplicar {
	
	private int numero;

	public TablaMultiplicar(int numero) {
		super();
		this.numero = numero;
	}
	
	public String generarTabla() {
		String tabla= "";
		for(int i=1; i<=10; i++) {
			int result = this.numero*1;
			tabla = tabla.concat(this.numero + " x "+ i + " = "+ result + "\n" );
		}
		return tabla;
	}

}

package ejemplo.composicion;

public class Motor {
	
	private int caballos;
	private int tipoCombustible; //0 = gasolina, 1 = diesel
	
	//Constructor con parametros
	public Motor(int caballos, int tipoCombustible) {
		super();
		this.caballos = caballos;
		this.tipoCombustible = tipoCombustible;
	}

	//Getters and setters
	public int getCaballos() {
		return caballos;
	}

	public int getTipoCombustible() {
		return tipoCombustible;
	}
	
	
	

}

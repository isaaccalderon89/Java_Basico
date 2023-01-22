package ejemplo.composicion;

public class Principal {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche ("8414JZB", "Ford", "Fiesta", 100, 1);
		System.out.println(miCoche.ver());
		
		//Accediendo al objeto motor a través del objeto Coche
		System.out.println("Motor con " +miCoche.getMotor().getCaballos());
	}

}

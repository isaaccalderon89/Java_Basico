package ejemplo.agregacion;

public class Principal {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado ("Luis Perez", "625 97 51 90", "Ventas");
		Nomina nomi = new Nomina(2000, emp);
		
		//Podemos cambiar el telefono al empleado a traves de su nomina
		nomi.getTrabajador().setTelefono("6155556666");
		
		System.out.println(nomi.ver());
		
		nomi = null;
		System.out.println("El objeto empleado sigue activo " +emp.ver());
		/*
		 * Observa que el objeto emp, es independiente del objeto nomi; se ha creado fuera de él y luego se ha convertido
		 * en su componente al pasarlo como argumento al contructor de Nomina. 
		 * 
		 * El objeto emp podría servir de componente para otros objetos diferentes que los requiertan. 
		 * 
		 * Hemos liberado la referencia de nomi asignándolo a null para que el objeto se termine destruyendo, pero emp sigue plenamente
		 * operativo. 
		 * 
		 * Ejecuta el programa para ver que resutlado mostraría.
		 */
	}

}

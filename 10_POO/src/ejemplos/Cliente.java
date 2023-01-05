package ejemplos;

public class Cliente {

	
		String dni;
		String nombre;
		String telefono;
		String direccion;
		
		public String consultar() {
			return "El cliente "+this.nombre+
					" vive en "+this.direccion+
					" su telefono: "+this.telefono;
		}
		/*
		 * La palabra reservada this hace referencia al objeto actual. Mas adelante lo explicaremos mas detenimadamente. 
		 */
		//El proyecto 99-CuentaBanco es un ejemplo
		

	}



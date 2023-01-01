
public class OtraForma {

	public static void main(String[] args) {

		int datos[][] = {
				{1,3,5,7},
				{3,5,7,9,11,13},
				{2,4},
				{8,9,10}
		};
		
		//Recorremos el array mostrando los valores en pantalla. 
		for (int f=0; f<datos.length; f++) {
			for (int c=0; c<datos[f].length; c++) {
				System.out.println(datos[f][c]+" ");
			}
			System.out.println();//retorno de carro 
		}

	}

}

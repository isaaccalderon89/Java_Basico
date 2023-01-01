
public class EjemploMatriz {

	public static void main(String[] args) {
		
		//Construccion de la matriz (vector de vectores)
		String plaza[][] = new String[10][7];
		
		//Primero rellenamos todas las plazas como libres. 
		for (int f=0; f<plaza.length; f++) {
			for(int c=0; c<plaza[0].length; c++) {
				plaza[f][c]="libre";
			}
		}
		
		/*
		 * Ahora entran coches 
		 * Asigno a las plazas ocupadas la matricula correspondiente. 
		 */
		plaza[1][0]="1234BJK";
		plaza[2][4]="1234BJK";
		plaza[3][1]="1234BJK";
		plaza[4][3]="1234BJK";
		plaza[5][0]="1234BJK";
		plaza[6][4]="1234BJK";
		plaza[7][2]="1234BJK";
		plaza[8][6]="1234BJK";
		
		//Recorremos el array (Las plazas)
		for (int f=0; f<plaza.length; f++) {
			for(int c=0; c<plaza[0].length; c++) {
				System.out.println("Plaza "+f+"."+c+": "+plaza[f][c]);
			}
		}

	}

}

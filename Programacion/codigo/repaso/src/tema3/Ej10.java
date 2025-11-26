package tema3;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("De la fila " + (i + 1) + " introduce el valor de la  " + (j + 1) + "º columna:  ");
				matriz[i][j] = Integer.parseInt(sc.nextLine());
			}
		// Suma de columas
		for (int j = 0; j < 5; j++) {
           int  sumaColumnas = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumnas += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas);
        }
		
		//Suma de Filas
		 for (int i = 0; i < 5; i++) {
	            int sumaFilas = 0;
	            for (int j = 0; j < 5; j++) {
	                sumaFilas += matriz[i][j];
	            }
	            System.out.println("Fila " + (i + 1) + ": " + sumaFilas);
	        }

		sc.close();
	}

}

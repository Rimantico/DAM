package array;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Introduzca el valor para posición (" + i + "," + j + "): ");
				matriz[i][j] = Integer.parseInt(sc.nextLine());
			}

		// Calcular suma de cada fila
		for (int[] fila : matriz) {
			int sumaFila = 0;
			for (int valor : fila) {
				sumaFila += valor;
			}
			System.out.println("La suma de todas las filas es de " + sumaFila);
		}

		// Calcular suma de cada columna
		int numColumnas = matriz[0].length;

		for (int i = 0; i < numColumnas; i++) {
			int sumaColumnas = 0;
			for (int[] columna : matriz) {
				sumaColumnas += columna[i];
			}
			System.out.println("La suma de la columna " + (i + 1) + " es " + sumaColumnas);
		}

		sc.close();
	}

}

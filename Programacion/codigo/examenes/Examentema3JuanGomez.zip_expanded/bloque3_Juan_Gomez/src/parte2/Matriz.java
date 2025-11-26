package parte2;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static final int LONGITUD = 10;
	public static final int VALORESMAXIMOS = 5;

	public static void main(String[] args) {
		/*
		 * Juego de los barquitos en el que nos dira si nos hemos acercado o no
		 */
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[LONGITUD][LONGITUD];
		int contador = 0;
		int puntosRestantes = 5;
		int jugar;

		// Relleno de la matriz aleatoria

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(2);
				if (matriz[i][j] == 1)
					contador++;
				if (contador == VALORESMAXIMOS)
					break;
			}
			if (contador == VALORESMAXIMOS)
				break;
		}
		// Mostrar la matriz aleatoria
		mostrarMatriz(matriz);

		// Ver si he tocado el barco o no

		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j < matriz.length; j++)
				do {
					System.out.println("Introduzca el punto x");
					int puntoX = Integer.parseInt(sc.nextLine());
					System.out.println("Introduzca el punto y");
					int puntoY = Integer.parseInt(sc.nextLine());
					if (matriz[puntoX][puntoY] == 1) {
						System.out.println("Has acertado");

						puntosRestantes--;
					}
					mostrarMatriz(matriz);
					System.out.println("¿Quiere seguir jugando?");
					jugar = Integer.parseInt(sc.nextLine());
					if (jugar == 0)
						break;

				} while (puntosRestantes == 0 || jugar == 0);

		}

		sc.close();
	}

	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println(" ");
		}

	}

}

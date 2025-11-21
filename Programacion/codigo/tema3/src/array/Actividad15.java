package array;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables y arrays
		String[] equipos = new String[30];
		int[][] resultado = new int[15][2];
		int valor;

		System.out.println("Quiniela de futbol");

		// Introducimos los equipos que queremos que se enfrenten
		for (int i = 0; i < equipos.length; i++) {
			System.out.print("Dime el nombre del equipo " + (i + 1) + ": ");
			equipos[i] = sc.nextLine();
		}

		// Introducimos los distintos valores de la quiniela. En mi caso he decidido
		// hacer un math random y limitarlo a 10 goles para que tampoco se vaya mucho
		// del limite

		for (int i = 0; i < resultado.length; i++) {
			valor = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < resultado[i].length; j++) {
				resultado[i][j] = valor;
			}
		}

		// Imprimimos los partidos y su resultado

		for (int i = 0; i < resultado.length; i++) {

			int equipo1 = (int) (Math.random() * 30);
			int equipo2 = (int) (Math.random() * 30);

			// Evitar que el equipo juegue contra sí mismo
			while (equipo2 == equipo1) {
				equipo2 = (int) (Math.random() * 30);
			}

			System.out.println(equipos[equipo1] + " - " + equipos[equipo2]);
			System.out.println(resultado[i][0] + " - " + resultado[i][1]);

		}

		sc.close();
	}

}

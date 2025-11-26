package array;

import java.util.Scanner;

public class Actividad15 {
	/**
	 * Crear un programa para gestionar los resultados de la quiniela de fútbol.
	 * Para ello vamos a utilizar dos arrays: Equipos: Que es una array de cadenas
	 * donde guardamos en cada columna el nombre de los equipos de cada partido. En
	 * la quiniela se indican 15 partidos. Resultados: Es una array de enteros donde
	 * se indica el resultado. También tiene dos columnas, en la primera se guarda
	 * el número de goles del equipo que está guardado en la primera columna de la
	 * tabla anterior, y en la segunda los goles del otro equipo. El programa irá
	 * pidiendo los nombres de los equipos de cada partido y el resultado del
	 * partido, a continuación se imprimirá la quiniela de esa jornada. ¿Qué
	 * modificación habría que hacer en las tablas para guardar todos los resultados
	 * de todas las jornadas de la temporada?
	 * 
	 * @param args
	 */

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

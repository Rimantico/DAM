package tema3;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantos conductores quiere introducir?");
		int numConductores = Integer.parseInt(sc.nextLine());

		String[] conductores = new String[numConductores];
		int[][] kilometros = new int[numConductores][5];

		// Introducir nombres de los conductores
		for (int i = 0; i < conductores.length; i++) {
			System.out.print("Introduzca el nombre del " + (i + 1) + "º conductor: ");
			conductores[i] = sc.nextLine();
		}

		// Introducir los kilometros conducidos por cada conductor
		for (int i = 0; i < kilometros.length; i++)
			for (int j = 0; j < kilometros[i].length; j++) {
				System.out.print("Introduzca cuantos kilometros hizo el conductor " + conductores[i] + " el día "
						+ (j + 1) + ": ");
				kilometros[i][j] = Integer.parseInt(sc.nextLine());
			}

		// Vector para los kilometros en total para cada conductor e introducimos los
		// valores que nos piden
		int[] totalKms = new int[numConductores];

		for (int i = 0; i < kilometros.length; i++) {
			int sumaKilometros = 0;
			for (int j = 0; j < kilometros[i].length; j++) {
				sumaKilometros += kilometros[i][j];
			}
			totalKms[i] = sumaKilometros;
		}
		
		
		//Mostramos los valores
		for(int i = 0 ; i<conductores.length ; i++) {
			System.out.print("Conductor " + conductores[i] + ". Kilometros en total recorridos: " + totalKms[i] + "Km");
		}
		sc.close();
	}

}

package array;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numConductores;
		
		System.out.println("¿Cuantos conductores quiere introducir?");
		numConductores = Integer.parseInt(sc.nextLine());
		
		//Creo los arrays
		
		String[] conductores = new String[numConductores];
		int[][] kilometros = new int[numConductores][7];
		
		
		//Almaceno los nombres de los conductores
		for(int i = 0 ; i<conductores.length ; i++) {
			System.out.print("Introduzca el nombre del " + (i+ 1) + "º conductor: ");
			conductores[i] = sc.nextLine();
		}
		
		//Almaceno los kilometros de cada conductor
		
		for(int i = 0 ;i<conductores.length ; i++) {
			for(int j = 0 ; j<kilometros[i].length ; j++) {
				System.out.print("¿Cuantos kilometros hizo " + conductores[i] + " el dia " + (j + 1) +"?: ");
				kilometros[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		
		//Sumo el total de kilometros de cada conductor
		
		int[] totalKms = new int[numConductores];
		for(int i = 0 ; i<conductores.length ; i++) {
			int sumaKilometro = 0;
			for(int j = 0 ; j<kilometros[i].length ; j++) {
				sumaKilometro += kilometros[i][j];
			}
			totalKms[i] = sumaKilometro;
		}
		
		//Imprimo el total de kilometros de cada conductor
		
		for(int i = 0 ; i<conductores.length ; i++)
			System.out.println("El total de kilometros conducidos por el conductor " + conductores[i] + " es: " + totalKms[i]);
		
		sc.close();
	}

}

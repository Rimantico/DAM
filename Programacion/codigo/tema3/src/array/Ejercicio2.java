package array;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector
	 * con datos leídos por el teclado. Copia los elementos del vector en otro
	 * vector pero en orden inverso, y muéstralo por la pantalla
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Inicializamos los arrays
		String[] cadena = new String[5];
		String[] cadena2 = new String[5];
		// Introducir los datos
		for (int i = 0; i < cadena.length; i++) {
			System.out.print("Introduce la " + i + "º cadena de caracteres: ");
			cadena[i] = sc.nextLine();
		}

		cadena2 = cadena;

		for (int i = cadena2.length - 1; i >= 0; i--) {
			System.out.println("El orden inverso es " + cadena2[i]);
		}
		sc.close();
	}

}

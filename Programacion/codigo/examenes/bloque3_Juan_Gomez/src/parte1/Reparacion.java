package parte1;

import java.util.Scanner;

public class Reparacion {
	public static final int NUMMAXCOCHES = 25;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variables y arrays
		int opcion;
		String[] matricula = new String[NUMMAXCOCHES];
		String[] nombre = new String[NUMMAXCOCHES];
		int[] telefono = new int[NUMMAXCOCHES];
		int contador = 25;

		/*
		 * Este programa esta hecho para un taller de reparacion de coches en el que nos
		 * interessa alamcenar la matrícula y el nombre.
		 */

		System.out.println("Taller de Reparación Juan Gómez Ruiz");
		do {
			// Menu principal del programa
			System.out.println("0. Salir del programa");
			System.out.println("1. Introduzca los valores en el programa.");
			System.out.println("2. ¿Esta este coche en el taller?");
			System.out.println("3. Listado del taller.");
			System.out.println("4. Datos sobre coche.");
			System.out.print("Introduzca una opción: ");
			opcion = leerEntero(sc);

			switch (opcion) {
			case 1:

				System.out.println("Has elegido la introducción de valores");
				// Se introducen los valores del array
				for (int i = 0; i < matricula.length; i++) {
					System.out.println("Introduzca la matrícula del " + (i + 1) + "º coche");
					matricula[i] = sc.nextLine();
					if (matricula[i].equals("0"))
						break;
					contador--;
					System.out.println("Introduzca el nombre del propietario del coche: ");
					nombre[i] = sc.nextLine();
					System.out.println("Introduzca el numero de telefono del propietario");
					telefono[i] = leerEntero(sc);

				}
				break;
			case 2:
				cocheTaller(matricula, sc);
				break;
			case 3:
				mostarLista(matricula, nombre, telefono, contador);
				break;
			case 4:
				informacionMatricula(matricula, nombre, telefono, sc);

			}

		} while (opcion != 0);
		sc.close();
	}

	// Para controlar que no
	private static int leerEntero(Scanner sc) {
		int numeroLeido = 0;
		boolean cumplido = true;

		do {
			try {
				numeroLeido = Integer.parseInt(sc.nextLine());
				cumplido = true;
				return numeroLeido;
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Valor Introducido no válido");
				cumplido = false;
			}

		} while (cumplido == false);
		return 0;
	}

	public static void informacionMatricula(String[] matricula, String[] nombre, int[] telefono, Scanner sc) {
		System.out.println("Introduzca la matrícula que quiere ver");
		String informacionMatricula = sc.nextLine();

		for (int i = 0; i < matricula.length; i++) {
			if (matricula[i].equals(informacionMatricula)) {
				System.out.println("Su propietario es " + nombre[i]);
				System.out.println("Su numero de telefono es " + telefono[i]);
				break;
			} else
				System.out.println("La matrícula no ha sido encontrada");
		}
	}

	public static void cocheTaller(String[] matricula, Scanner sc) {
		System.out.println("Introduzca la matrícula que quiere ver");
		String buscarMatricula = sc.nextLine();
		boolean encontrado = false;
		for (int i = 0; i < matricula.length; i++) {
			if (matricula[i].equals(buscarMatricula)) {
				encontrado = true;
				break;
			} else
				encontrado = false;
		}
		System.out.println(encontrado);
	}

	public static void mostarLista(String[] matricula, String[] nombre, int[] telefono, int contador) {
		System.out.println("Datos de los coches");
		if (contador == 25) {
			System.out.println("Por favor introduzca un valor");
		} else
			for (int i = 0; i < matricula.length - contador; i++) {
				System.out.println(nombre[i] + " - " + matricula[i] + " - " + telefono[i]);

			}

	}

}

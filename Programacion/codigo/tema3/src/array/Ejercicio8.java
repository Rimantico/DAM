package array;

import java.util.Scanner;

public class Ejercicio8 {

	/**
	 * Queremos guardar los nombres y las edades de los alumnos de un curso, como
	 * máximo 30 alumnos. Realiza un programa que introduzca el nombre y la edad de
	 * cada alumno. El proceso de lectura de datos terminará cuando se introduzca
	 * como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variables y arrays
		String[] alumnos = new String[30];
		int[] edad = new int[30];
		int contador = 30;
		int mayorEdad = 0;

		for (int i = 0; i < alumnos.length; i++) {
			System.out.print("Dime el nombre del " + (i + 1) + "º Alumno: ");
			alumnos[i] = sc.nextLine();
			if (alumnos[i].equals("*"))
				break;
			contador--;
			System.out.print("Dime la edad del alumno " + alumnos[i] + ": ");
			edad[i] = Integer.parseInt(sc.nextLine());
		}
		if (contador == 30) {
			System.out.println("Introduzca un nombre por favor");
		} else if (contador == 0) {
			for (int i = 0; i < alumnos.length; i++) {
				if (edad[i] >= 18) {
					System.out.println("El alumno " + alumnos[i] + " es mayor de edad");
				}

			}
			for (int i = 0; i < alumnos.length; i++) {
				if (edad[i] > mayorEdad)
					mayorEdad = i;
			}
			
		} else {
			for (int i = 0; i < alumnos.length - contador; i++) {
				if (edad[i] >= 18) {
					System.out.println("El alumno " + alumnos[i] + " es mayor de edad");
				}
			}
			for (int i = 0; i < alumnos.length - contador; i++) {
				if (edad[i] > mayorEdad)
					mayorEdad = i;
			}
			System.out.println("El alumno con mayor edad es " + alumnos[mayorEdad]);
		}

		sc.close();
	}

}
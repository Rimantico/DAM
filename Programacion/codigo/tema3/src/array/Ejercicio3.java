package array;

import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por
	 * un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las
	 * notas, la nota media, la nota más alta que ha sacado y la menor.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[5];

		double mayor = Double.NEGATIVE_INFINITY;
		double menor = Double.POSITIVE_INFINITY;
		double media = 0;
		double contador = 0;

		for (int i = 0; i < notas.length; i++) {
			do {
				System.out.print("Introduzca la nota del " + (i + 1) + "º alumno: ");
				notas[i] = Double.parseDouble(sc.nextLine());
				if (notas[i] < 0 || notas[i] > 10)
					System.out.println("Introduzca una nota entre 0 y 10");
			} while (notas[i] < 0 || notas[i] > 10);

		}

		for (int i = 0; i < notas.length; i++) {
			if (mayor < notas[i])
				mayor = notas[i];

			if (menor > notas[i])
				menor = notas[i];

			media += notas[i];
			contador++;
			System.out.println("La nota del " + (i + 1) + "º es: " + notas[i]);

		}

		media = media / contador;

		System.out.println("La mayor nota es: " + mayor);
		System.out.println("La menor nota es: " + menor);
		System.out.println("La media de todos los numeros es " + media);
		sc.close();
	}

}

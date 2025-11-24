package pruebasclases;

import java.util.Scanner;

public class AAAAA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuantos dias temperaturas");
		int diasTemp = Integer.parseInt(sc.nextLine());

		double[] temperaturas = rellenarArray(diasTemp);

		mostrarMayorMenor(temperaturas);

		sc.close();
	}

	public static void mostrarMayorMenor(double[] temperaturas) {
		double max = Double.NEGATIVE_INFINITY;
		double min = Double.POSITIVE_INFINITY;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > max)
				max = temperaturas[i];
			if (temperaturas[i] < min)
				min = temperaturas[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static double[] rellenarArray(int dias) {
		double[] temperaturas = new double[dias];

		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = Math.random() * 45;
		}

		return temperaturas;
	}

}

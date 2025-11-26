package tema3;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[][] temperaturas = new double[5][2];

		for (int i = 0; i < temperaturas.length; i++)
			do {
				System.out.println("Dime la temperatura máxima del día " + (i + 1) + ": ");
				temperaturas[i][0] = Double.parseDouble(sc.nextLine());
				System.out.println("Dime la temperatura mínima del día " + (i + 1) + ": ");
				temperaturas[i][1] = Double.parseDouble(sc.nextLine());
				if (temperaturas[i][1] > temperaturas[i][0])
					System.out.println("La temperatura mínima debe de ser menor que la máxima");
			} while (temperaturas[i][1] > temperaturas[i][0]);

		// Temperaturas mínimas
		double tempMin = Double.POSITIVE_INFINITY;

		for (int i = 0; i < temperaturas.length; i++)
			for (int j = 0; j < temperaturas[i].length; j++)
				if (tempMin > temperaturas[i][j]) {
					tempMin = temperaturas[i][j];
				}
		System.out.println(tempMin);

		sc.close();
	}

}

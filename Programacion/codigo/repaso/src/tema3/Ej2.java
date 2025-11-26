package tema3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] array1 = new String[5];
		String[] array2 = new String[5];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Introduzca el " + (i + 1) + "º valor: ");
			array1[i] = sc.nextLine();
		}
		for (int i = 0; i < array1.length; i++)
			array2[i] = array1[i];

		for (int i = array2.length - 1; i >= 0; i--)
			System.out.println(array2[i]);

		sc.close();
	}

}

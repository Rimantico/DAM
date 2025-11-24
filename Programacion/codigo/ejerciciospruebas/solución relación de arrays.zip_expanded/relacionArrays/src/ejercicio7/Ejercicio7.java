package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static final int NUMERODEELEMENTOS = 5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa realiza la suma de dos arrays de 5 elementos");
		
		int[] valores1 = new int[NUMERODEELEMENTOS], valores2 = new int[NUMERODEELEMENTOS];
		int[] resultado = new int[NUMERODEELEMENTOS];
		
		for (int i=0; i<NUMERODEELEMENTOS; i++) {
			valores1[i] = 0;
			valores2[i] = 0;
		}
		
		System.out.println("Introduzca los valores del primer array");
		for (int i=0; i<NUMERODEELEMENTOS; i++) {
			boolean test = false;
			System.out.println("Introduzca el elemento " + (i+1) + ": ");
			do {
				try {
					valores1[i] = Integer.parseInt(sc.nextLine());
					test = true;
				}catch (NumberFormatException e) {
					System.err.println("Introduzca un valor correcto");				}	
			}while(!test);
		}
	
		System.out.println("Introduzca los valores del segundo array");
		for (int i=0; i<NUMERODEELEMENTOS; i++) {
			boolean test = false;
			System.out.println("Introduzca el elemento " + (i+1) + ": ");
			do {
				try {
					valores2[i] = Integer.parseInt(sc.nextLine());
					test = true;
				}catch (NumberFormatException e) {
					System.err.println("Introduzca un valor correcto");				}	
			}while(!test);
		}
		
		System.out.println("El resultado es:");
		for (int i=0; i<NUMERODEELEMENTOS; i++) 
			resultado[i] = valores1[i] + valores2[i];

		
		// Visualizamos el resultado
		for (int i=0; i<NUMERODEELEMENTOS; i++) {
			System.out.print(resultado[i] + " ");
		
		sc.close();
	}

}
}

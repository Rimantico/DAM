package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] valores = new String[5];
	
		for (int i=0; i<valores.length; i++) {
			System.out.print("Introduzca el valor " + (i+1) + ":");
			valores[i] = sc.nextLine();
		}
		System.out.print("Los valores del array son: ");
		for (int i=0; i<valores.length; i++) {
			 System.out.print(valores[i] + " ");
		}
		sc.close();
	}

}

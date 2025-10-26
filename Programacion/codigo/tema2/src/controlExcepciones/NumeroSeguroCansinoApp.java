package controlExcepciones;

import java.util.Scanner;

public class NumeroSeguroCansinoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cansino;
		boolean intento = false;
		
		System.out.println("INTRODUCCIÓN DE NÚMERO SEGURA CANSINA");
		
		do {
			System.out.print("Introduce un número entero: ");
			try {
				cansino = Integer.parseInt(sc.nextLine());
				System.out.println("El número introducido es " + cansino);
				intento = true;
			}catch(NumberFormatException e) {
				System.out.println("El dato introducido no es un número válido");
			}
		}while(intento == false);
		
		
		
		sc.close();
	}

}

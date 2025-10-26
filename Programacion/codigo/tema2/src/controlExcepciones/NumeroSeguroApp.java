package controlExcepciones;

import java.util.Scanner;

public class NumeroSeguroApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numEntero;
		
		System.out.println("INTRODUCCIÓN DE NÚMERO SEGURA");
		System.out.print("Introduce un número entero: ");
		try {
			numEntero = Integer.parseInt(sc.nextLine());
			System.out.println("El numero entero introducido es "+ numEntero);
		}catch(NumberFormatException e){
			System.out.print("El dato introducido no es un número válido");
		}
		
			
		sc.close();
	}

}

package controlExcepciones;

import java.util.Scanner;

public class MayorMenorMediaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIntroducir;
		
		
		System.out.println("MAYOR, MENOR Y MEDIA (A PRUEBA DE USUARIOS MALICIOSOS)");
		
		numIntroducir = comprobacion(sc);
		
		System.out.println("Vas a introducir " + numIntroducir + " numeros");
		
		
		sc.close();
	}
	
	public static int comprobacion(Scanner sc) {
		int valor = 0;
		boolean valido = false;
		do {
			System.out.print("¿Cuántos números deseas introducir?: ");
			try {
				valor = Integer.parseInt(sc.nextLine());
				valido = true;
			}catch(NumberFormatException e) {
				System.out.println("El valor introducido no es un número entero correcto. Inténtelo de nuevo");
				valido = false;
			}
		}while (!valido);
		
		
		return valor;
	}
	
}

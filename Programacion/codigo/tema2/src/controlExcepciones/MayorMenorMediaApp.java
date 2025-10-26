package controlExcepciones;

import java.util.Scanner;

public class MayorMenorMediaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numIntroducir;
		
		
		System.out.println("MAYOR, MENOR Y MEDIA (A PRUEBA DE USUARIOS MALICIOSOS)");
		System.out.print("¿Cuántos números deseas introducir?: ");
		do {
			numIntroducir = comprobacion();
		}while (comprobacion() == 1);
		
		
		sc.close();
	}
	
	public static int comprobacion() {
		Scanner sc = new Scanner(System.in);
		int valor;
		int fin;
		do {
			try {
				valor = Integer.parseInt(sc.nextLine());
				fin = 1;
			}catch(NumberFormatException e) {
				System.out.println("El valor introducido no es un número entero correcto. Inténtelo de nuevo");
				fin = 0;
			}
		}while (fin !=1);
		
		
		return fin;
	}
	
}

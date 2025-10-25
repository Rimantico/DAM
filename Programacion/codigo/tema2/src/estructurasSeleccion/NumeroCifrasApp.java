package estructurasSeleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cifra;
		
		System.out.println("CIFRAS DE UN NÚMERO");
		
		System.out.print("Introduce un número entero y te diré cuantas cifras tiene: ");
		cifra = Integer.parseInt(sc.nextLine());
		
		if (cifra < 10) {
			System.out.println("El número " + cifra + " tiene una cifra");
		}else
			if(cifra < 100) {
				System.out.println("El número " + cifra + " tiene dos cifras");
			}else
				if(cifra < 1000) {
					System.out.println("El número " + cifra + " tiene tres cifras");
				}else
					System.out.println("El numero " + cifra + " tiene mas de tres cifras");
		
		sc.close();
	}

}

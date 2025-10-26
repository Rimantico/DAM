package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class CalculaDivisoresApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEntero;
		
		System.out.println("DIVISORES DE UN NÚMERO");
		System.out.print("Introduce un número entero para que calcule sus divisores: ");
		numEntero = Integer.parseInt(sc.nextLine());
		
		for (int i = 1 ; i <= numEntero ; i++) {
			if (numEntero % i == 0) {
				System.out.println("Es divisible por " + i);
			}
		}
		sc.close();
	}

}

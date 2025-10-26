package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class DetectorPrimosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numPrimo;
		int contadorDiv = 0;
		
		System.out.println("DETECTOR DE NUMEROS PRIMOS");
		System.out.print("Introduce un número entero mayor que 1 para ver si es primo o no: ");
		numPrimo = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= numPrimo ; i++) {
			
			if(numPrimo % i == 0) {
				contadorDiv++;
			}
			
			
			
		}
		if(contadorDiv <= 2) {
			System.out.println("El número " + numPrimo + " Si es primo");
		}else
			System.out.println("El número " + numPrimo + " No es primo");
		
		sc.close();
	}

}

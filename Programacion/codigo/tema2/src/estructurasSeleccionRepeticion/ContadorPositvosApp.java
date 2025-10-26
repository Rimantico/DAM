package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class ContadorPositvosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEntero;
		int numPositivo = 0;
		
		
		System.out.println("NUMEROS POSITIVOS Y NEGATIVOS");
		do {
			System.out.print("Introduce un número entero positivo o  cero (Negativo para terminar): ");
			numEntero = Integer.parseInt(sc.nextLine());
			if(numEntero >= 0 ) {
				numPositivo++;
			}
			
		}while(numEntero >= 0);
		
		System.out.println("Has introducido " + numPositivo + " números positivos");
		sc.close();
	}
		
		
}



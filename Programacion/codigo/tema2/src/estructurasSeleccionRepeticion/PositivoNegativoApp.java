package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class PositivoNegativoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEntero;
		
		System.out.println("NUMEROS POSITIVOS Y NEGATIVOS");
		do {
			System.out.print("Introduce un número entero (0 para terminar): ");
			numEntero = Integer.parseInt(sc.nextLine());
			if(numEntero > 0 ) {
				System.out.println("El numero " + numEntero + " es positivo");
			}else
				System.out.println("El numero " + numEntero + " es negativo");
			
		}while(numEntero != 0);
		System.out.println("Has intrducido 0 . Terminando Programa...");
		
		sc.close();
	}

}

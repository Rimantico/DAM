package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class CalculaFactorialApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int factorial;
		long totalFactorial = 1;
		
		System.out.println("CÁLCULO DE FACTORIAL");
		System.out.print("Introduce un número entero mayor que cero para calcular su factorial: ");
		factorial = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= factorial  ; i++) {
			totalFactorial = totalFactorial*i;
			
		}
		System.out.println("El total del factorial es: " + totalFactorial);
		
		sc.close();
	}

}

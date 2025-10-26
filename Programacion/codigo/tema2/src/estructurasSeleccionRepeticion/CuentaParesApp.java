package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class CuentaParesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numerosIntroducir,  numEntero;
		int numerosPares = 0;
		
		System.out.println("CUENTA PARES");
		System.out.print("¿Cuantos números desea introducir?: ");
		numerosIntroducir = Integer.parseInt(sc.nextLine());
			for(int i = 1 ; i <= numerosIntroducir ; i++) {
			
				System.out.print("Introduce un número entero: ");
				numEntero = Integer.parseInt(sc.nextLine());
				
				if(numEntero % 2 == 0) {
					numerosPares++;
				}
		}
		if (numerosPares == numerosIntroducir) {
			System.out.println("Has introducido todos los números pares");
		}else
			System.out.println("No has introducido todos los números pares");
		sc.close();
	}

}

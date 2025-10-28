package planesPruebas;

import java.util.Scanner;

public class PruebaEj30204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numerosIntroducir,  numEntero;
		int numerosPares = 0;
		
		System.out.println("CUENTA PARES");
		do {
			System.out.print("¿Cuantos números desea introducir?: ");
			numerosIntroducir = comprobar(sc);
		}while(numerosIntroducir == 0);
		
			for(int i = 1 ; i <= numerosIntroducir ; i++) {
			do {
				System.out.print("Introduce un número entero: ");
				numEntero = comprobar(sc);
			}while(numEntero <= 0);
				
				
				if(numEntero % 2 == 0) {
					numerosPares++;
				}
		}
		if (numerosPares == numerosIntroducir) {
			System.out.println("Has introducido todos los números pares");
		}else
			System.out.println("No has introducido todos los números pares");
		sc.close();
		
		
		/*
		 *  Plan de pruebas
		 *  
		 *  Prueba 						Resultado Esperado								¿Superado?	
		 *  
		 *  -- Variables
		 *  
		 *  NumerosIntroducir = 30		30
		 *  NumerosIntroducir = Hola 	Introduce un número entero valido
		 *  NumerosIntroducir = 30.5 	Introduce un número entero valido
		 *  NumEntero = 55				55
		 *  NumEntero = 3.5				Introduce un numero entero valido
		 *  NumEntero = Adios			Introduce un número entero valido
		 *  
		 *  -- If numeros Pares
		 * 	Si no introduzco todos los pares indicados sale que no he introducido todo los datos
		 * Si introduzco los pares indicados el programa se ejecuta correctamente
		 *  
		 */
	}
	public static int comprobar(Scanner sc) {
		int pares = 0;
		try {
			pares = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Introduce un número entero valido");
			pares = 0;
		}
		
		return pares;
	}
}
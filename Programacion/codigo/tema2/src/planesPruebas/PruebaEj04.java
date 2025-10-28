package planesPruebas;

import java.util.Scanner;

public class PruebaEj04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		
		double lado1;
		double lado2;
		double lado3;
	
		
		
		System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
		
		do {
			System.out.print("Introduzca la longitud del primer lado: ");
			lado1 = comprobar(sc);
		}while(lado1 <= 0);
		do {
			System.out.print("Introduzca la longitud del segundo lado: ");
			lado2 = comprobar(sc);
		}while(lado2 <= 0);
		do {
			System.out.print("Introduzca la longitud del tercer lado: ");
			lado3 = comprobar(sc);
		}while(lado3 <= 0);
		if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("El triangulo es equilatero");
		}else
			if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("El triangulo es escaleno");
			}else
				System.out.println("El triangulo es isoceles");
		
		sc.close();
		
		/*
		 * Plan de Pruebas
		 * Prueba 				Resultado Esperado										¿Superado?	
		 * 
		 *  -- Variables
		 *  
		 *  lado1=hola			Error(La variable no lee letras)						Si
		 *  lado1= 4 			4														Si
		 *  lado2= 0 			Error(Introduce un numero valido)						Si
		 *  lado2 = -4			Error(Este programa no permite numeros negativos)		Si
		 *  lado3= 8 			8														Si
		 *  lado3= 55.4 		55.4													Si
		 *  
		 *  -- If lados
		 *  
		 *  Todos los lados Iguales 		El triangulo es equilatero
		 *  Todos los lados Desiguales 		El triangulo es escaleno
		 *  Un lado Desigual				El triangulo es Desigual
		 */
		
	}
	
	public static double comprobar(Scanner sc) {
		double longitud = 0;
		try {
			longitud = Double.parseDouble(sc.nextLine());
			if (longitud <= 0 ) {
				System.out.println("Introduce un numero mayor a 0");
			}
		}catch(NumberFormatException e) {
			System.out.println("Introduce un número valido");
			longitud = 0;
		}
		
		return longitud;
	}

}

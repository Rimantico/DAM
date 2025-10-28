package planesPruebas;

import java.util.Scanner;

public class PruebaEj30302 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int cansino;
		boolean intento = false;
		
		System.out.println("INTRODUCCIÓN DE NÚMERO SEGURA CANSINA");
		
		do {
			System.out.print("Introduce un número entero: ");
			try {
				cansino = Integer.parseInt(sc.nextLine());
				System.out.println("El número introducido es " + cansino);
				intento = true;
			}catch(NumberFormatException e) {
				System.out.println("El dato introducido no es un número válido");
			}
		}while(intento == false);
		
		/*
		 * Plan de pruebas
		 * 
		 *   Prueba 						Resultado Esperado								¿Superado?	
		 *  
		 *  -- Variables
		 *  cansino = Hola					Error(Se repite el programa)					Si
		 *  cansino = 55 					55												Si
		 *  cansino = 3.5					Error(Se repite el programa)					Si
		 *  cansino = 77					77												Si
		 *  cansino = 47.3					Error(Se repite el programa)					Si
		 */
		
		sc.close();
	}

}

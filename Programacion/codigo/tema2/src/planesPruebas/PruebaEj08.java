package planesPruebas;

import java.util.Scanner;

public class PruebaEj08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int mes;
				
				System.out.println("NOMBRE DE MES II");
				do {
					System.out.print("Introduce un número entero del 1 al 12 y te diré que mes ocupa esa posición: ");
					mes = comprobar(sc);
				}while(mes<1 || mes>12);
				
				switch(mes) {
				case 1:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Enero\"");
					break;
				case 2:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Febrero\"");
					break;
				case 3:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Marzo\"");
					break;
				case 4:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Abril\"");
					break;
				case 5:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Mayo\"");
					break;
				case 6:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Junio\"");
					break;
				case 7:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Julio\"");
					break;
				case 8:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Agosto\"");
					break;
				case 9:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Septiembre\"");
					break;
				case 10:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Octubre\"");
					break;
				case 11:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Noviembre\"");
					break;
				case 12:
					System.out.println("El mes con posicion " + mes + " tiene el nombre \"Diciembre\"");
					break;
				}

				
				sc.close();
	}
				
				/*Planes de Pruebas
				 * Prueba 				Resultado Esperado					¿Superado?	
				 * 
				 *  -- Variable
				 *  mes = 55 			Introduce un número valido			Si
				 *  mes = 5 			Mayo								Si
				 *  mes = -5 			Introduce un número valido			Si
				 *  mes = 0 			Introduce un número valido			Si
				 *  mes = 10 			Octubre								Si
				 *  
				 *  --switch
				 *  
				 *  Caso 1:	 			Enero								Si				
				 *  Caso 2:				Febrero								Si
				 *  Caso 3:				Marzo								Si
				 *  Caso 4:				Abril								Si
				 *  Caso 5:				Mayo								Si
				 *  Caso 6:				Junio								Si
				 *  Caso 7:				Julio								Si
				 *  Caso 8:				Agosto								Si
				 *  Caso 9:				Septiembre							Si
				 *  Caso 10:			Octubre								Si
				 *  Caso 11:			Noviembre							Si
				 *  Caso 12:			Diciembre							Si
				 */ 
		public static int comprobar(Scanner sc) {
			int longitud = 0;
			try {
				longitud = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Introduce un número valido");
				longitud = 0;
			}
			return longitud;
	}
}
	

	





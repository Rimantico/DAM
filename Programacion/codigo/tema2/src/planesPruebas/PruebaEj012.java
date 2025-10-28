package planesPruebas;

import java.util.Scanner;

public class PruebaEj012 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		
		System.out.println("PROMOCIONA O NO PROMOCIONA");
		do {
			System.out.print("Introduce la calificación de Matemáticas: ");
			nota1 = comprobar(sc);
		}while(nota1 < 0 || nota1 > 10);
		do {
			System.out.print("Introduce la calificación de Lengua: ");
			nota2 = comprobar(sc);
		}while(nota2 < 0 || nota2 > 10);
		
		
		
		if (nota1 >= 5 && nota2 >= 5) {
			
			System.out.println("El alumno pasa limpio");
		}else
			if (nota1 < 5 && nota2 < 5 ) {
				System.out.println("El alumno repite");
			}else
				System.out.println("El alumno pasa con una pendiente");
		
		sc.close();
		
		
		
		/*
		 *  Plan de pruebas
		 *  
		 *  Prueba 					Resultado Esperado								¿Superado?	
		 *  
		 *  -- Variables
		 *  
		 *  nota1 = -3				Introduce un número entre 0 y 10(Repite)		Si
		 *  nota1 = 15				Inrtoduce un número entre 0 y 10(Repite)		Si
		 *  nota1 = hola			Introduce un número valido(Repite)				Si
		 *  nota1 = 5				5												Si
		 *  nota1 = 5.9				5.9												Si
		 *  	
		 *  nota2 = 10.4			Introduce un número entre 0 y 10(Repite)		Si
		 *  nota2 = 7.5				7.5												Si
		 *  nota2 = 75				Introduce un número entre 0 y 10(Repite)		Si
		 *  nota2 = -4				Introduce un número entre 0 y 10(Repite)		Si
		 *  nota2 = adios			Inroduce un número valido(Repite)				Si
		 *  
		 *  
		 *  -- IF para ver si ha aprobado o no
		 *  
		 *  Si las dos asignaturas estan suspensas			El alumno repite
		 *  Si una asignatura de las dos esta suspensa 		El alumno pasa con una suspensa
		 *  El alumno no suspende ninguna					El alumno pasa limpio
		 *  
		 */
	}

	
	public static double comprobar(Scanner sc) {
		double nota = 0;
		try {
			nota = Double.parseDouble(sc.nextLine());
			if (nota < 0 || nota > 10) {
				System.out.println("Introduce un numero entre 0 y 10(Los dos incluidos)");
			}
		}catch(NumberFormatException e) {
			System.out.println("Introduce un número valido");
			nota = -1;
		}
		
		return nota;
	}
}
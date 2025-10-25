package estructurasSeleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		
		System.out.println("PROMOCIONA O NO PROMOCIONA");
		System.out.print("Introduce la calificación de Matemáticas: ");
		nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la calificación de Lengua: ");
		nota2 = Double.parseDouble(sc.nextLine());
		
		
		if (nota1 >= 5 && nota2 >= 5) {
			
			System.out.println("El alumno pasa limpio");
		}else
			if (nota1 < 5 && nota2 < 5 ) {
				System.out.println("El alumno repite");
			}else
				System.out.println("El alumno pasa con una pendiente");
		
		sc.close();
	}

}
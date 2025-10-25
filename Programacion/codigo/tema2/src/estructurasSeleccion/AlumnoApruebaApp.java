package estructurasSeleccion;

import java.util.Scanner;

public class AlumnoApruebaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double eval1;
		double eval2;
		double eval3;
		double media;
		
		System.out.println("APROBADOS Y SUSPENSOS");
		
		System.out.println("Introduce la calificiación de la primera evaluación");
		eval1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la calificiación de la segunda evaluación");
		eval2 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la calificiación de la tercera evaluación");
		eval3 = Double.parseDouble(sc.nextLine());
		
		media = (eval1 + eval2 + eval3)/3;
		
		if (media >= 5) {
			System.out.println("El alumno ha aprobado con una media de " + media);
		}else
			System.out.println("El alumno ha suspendido con una media de " + media);
		sc.close();
	}

}
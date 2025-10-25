package estructurasSeleccion;

import java.util.Scanner;

public class ClasificarTriangulosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		
		double lado1;
		double lado2;
		double lado3;
		
		
		System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
		
		System.out.print("Introduzca la longitud del primer lado");
		lado1 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduzca la longitud del segundo lado");
		lado2 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduzca la longitud del tercer lado");
		lado3 = Double.parseDouble(sc.nextLine());
		
		if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("El triangulo es equilatero");
		}else
			if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("El triangulo es escaleno");
			}else
				System.out.println("El triangulo es isoceles");
		
		sc.close();
	}

}

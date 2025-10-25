package estructurasSeleccion;

import java.util.Scanner;

public class EcuacionesSegundoGradoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor1, valor2 , valor3, discriminante, discriminantex1 , discriminantex2;
		
		System.out.println("PROGRAMA DE CÁLCULO DE ECUACIONES DE SEGUNDO GRADO");
		System.out.print("Introduce el primer valor: ");
		valor1 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce el segundo valor: ");
		valor2 = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce el tercer valor: ");
		valor3 = Double.parseDouble(sc.nextLine());
		
		discriminante = Math.pow(valor2, 2) - 4 * valor1 * valor3;
		
		if(valor1 == 0) {
			System.out.println("No es una ecuación de segundo grado");
		}else
			if(discriminante > 0 ) {
				discriminantex1 = (-valor2 + Math.sqrt(discriminante)) / (2* valor1);
				discriminantex2 = (-valor2 + Math.sqrt(discriminante)) / (2* valor1);
				 System.out.println("Las soluciones son reales y distintas:");
		            System.out.println("x1 = " + discriminantex1);
		            System.out.println("x2 = " + discriminantex2);
			}else
				if(discriminante == 0) {
		            discriminantex1 = -valor2 / (2 * valor1);
		            System.out.println("Las soluciones son reales e iguales:");
		            System.out.println("x1 = x2 = " + discriminantex1);
				}else
					System.out.println("La ecuacion no tiene soluciones reales");
		
		sc.close();
	}

}

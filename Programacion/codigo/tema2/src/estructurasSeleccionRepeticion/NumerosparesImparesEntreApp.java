package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class NumerosparesImparesEntreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicioIntervalo;
		int finIntervalo;
		
		System.out.println("PARES O IMPARES EN UN INTERVALO");
		System.out.print("Introduce el número de comienzo del intervalo: ");
		inicioIntervalo = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el número de fin del intervalo: ");
		finIntervalo = Integer.parseInt(sc.nextLine());
		
		if (finIntervalo<inicioIntervalo) {
			System.out.println("El inicio del intervalo debe de ser menor que el fin del intervalo, por favor introduzca otro valor");
		}else
			for( int i = inicioIntervalo ; i <= finIntervalo ; i++) {
				if(i % 2 == 0 ) {
					System.out.println("El número " + i + " es par");
				}else
					System.out.println("El número " + i + " es impar");
			}
		
		
		sc.close();
	}

}

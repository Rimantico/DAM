package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class SumaParesIntervaloApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicioIntervalo;
		int finIntervalo;
		int suma = 0;
		
		System.out.println("SUMA DE PARES EN UN INTERVALO");
		do {
		
		System.out.print("Introduce el número de comienzo del intervalo: ");
		inicioIntervalo = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el número de final del intervalo: ");
		finIntervalo = Integer.parseInt(sc.nextLine());
		
		if (finIntervalo<inicioIntervalo) {
			System.out.println("El numero de final del intervalo es menor al del comienzo, por favor vuelva a introducir los datos.");
		}
		}while(finIntervalo<inicioIntervalo); 
		
		for(int i = inicioIntervalo ; i<= finIntervalo ; i++) {
			if(i % 2 == 0) {
				suma+= i ;
			}
		}
		
		System.out.println("La suma de los números desde el " + inicioIntervalo + " hasta " + finIntervalo + " vale " + suma );
		
		sc.close();
	}

}

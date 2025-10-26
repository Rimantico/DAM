package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class MediaPositivosApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int numeroSuma= 0;
		int contador = 0;
		double resultado;
		
		System.out.println("CALCULO DE LA MEDIA");
		do {
			System.out.print("Introduce un número real positivo o cero (Negativo para terminar): ");
			numero = Integer.parseInt(sc.nextLine());
			if(numero >= 0 ) {
				numeroSuma =numero + numero;
				contador++;
			}
		}while(numero >=0);
		
		resultado = numeroSuma/contador;
		
		System.out.println("La media de " + contador + " números introducidos vale " + resultado);
		
		
		sc.close();
	}

}

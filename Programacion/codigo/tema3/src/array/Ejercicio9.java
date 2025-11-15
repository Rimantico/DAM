package array;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		//Iniciamos variables y arrays
		double[][] temperaturas = new double[5][2];
		double encontrarTemperatura;
		
		
		//Programa principal
		
		System.out.println("Programa temperaturas");
		for(int i = 0 ; i<5 ; i++)
			for(int j = 0 ; j<2 ; j++) {
				System.out.print("Introduzca la " + (j +1) + "º temperatura del día " + (i + 1) + ":");
				temperaturas[i][j] = Double.parseDouble(sc.nextLine());
			}
		
		//Calculo de media
		
		for(int i = 0 ; i<5 ; i++) {
			double media = 0;
			for(int j = 0 ;j<2 ; j++) {
				media += temperaturas[i][j];
			}
			media /= 2;
			System.out.println("La media del día " + (i + 1) + " es: " + media);
		}
		
		//Busqueda de temperatura minima

		double minima = temperaturas[0][0];

		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 2; j++) {
		        if (temperaturas[i][j] < minima) {
		            minima = temperaturas[i][j];
		        }
		    }
		}
		
		System.out.println("La temperatura mínima es: " + minima);
		System.out.println("Días en los que se registró la temperatura mínima:");

		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 2; j++) {
		        if (temperaturas[i][j] == minima) {
		            System.out.println("Día " + (i + 1));
		        }
		    }
		}
		//Buscar Temperatura
		
		do {
			System.out.println("Dime una temperatura. (999 para terminar)");
			encontrarTemperatura = Double.parseDouble(sc.nextLine());
			for (int i = 0; i < 5; i++) {
			    for (int j = 0; j < 2; j++) {
			        if (temperaturas[i][j] == encontrarTemperatura) {
			            System.out.println("El día " + (i+ 1) + " tiene esa temperatura");
			        }else
			        	System.out.println("Temperatura no encontrada. Por favor introduzca otra temperatura.");
			    }
			}
		}while(encontrarTemperatura != 999);
		
		
		
		sc.close();
	}

}

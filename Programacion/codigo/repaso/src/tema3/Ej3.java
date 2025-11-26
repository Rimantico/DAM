package tema3;

import java.util.Scanner;

public class Ej3 {
	
	public static int NOTASTOTALES = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[NOTASTOTALES];
		
		for(int i = 0 ; i<notas.length ; i++) {
			do {
				System.out.print("Introduzca la " + (i+1) + "º nota (Entre 0 y 10): ");
				notas[i] = Double.parseDouble(sc.nextLine());
				if(notas[i]< 0 || notas[i]> 10)
					System.out.println("Introduzca una nota valida por favor");
			}while(notas[i] < 0 || notas[i]>10 );
		}
		//Mostrar Resultados
		System.out.println("Notas obtenidas");
		for(int i = 0 ; i<notas.length ; i++) {
			System.out.println((i+1) + " Alumno: " + notas[i]);
		}
		//Calculo de Media
		double media = 0;
		for(double suma : notas)
			media+= suma;
		media = media/NOTASTOTALES;
		System.out.println("La media total de los cinco examenes es " + media);
		
		//Mayor y menor nota
		
		double mayor = Double.NEGATIVE_INFINITY;
		double menor = Double.POSITIVE_INFINITY;
		
		for(double recorrido : notas) {
			if(recorrido> mayor)
				mayor=recorrido;
			if(recorrido<menor)
				menor=recorrido;
		}
		System.out.println("La mayor nota ha sido de " + mayor + " puntos");
		System.out.println("La mayor nota ha sido de " + menor + " puntos");
		
		
		sc.close();
	}

}

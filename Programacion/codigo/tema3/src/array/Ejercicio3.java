package array;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[5];
		
		double mayor = notas[0];
		double menor = notas[0];
		
		for (int i = 0 ; i<notas.length ; i++ ) {
			System.out.println("Introduzca la nota del " + (i +1) + "º alumno: ");
			notas[i] = Double.parseDouble(sc.nextLine());
		}
		
		
		for (int i = 0 ; i<notas.length ; i++ ) {
			if(mayor < notas[i])
				mayor = notas[i];
			
			if (menor > notas[i])
				menor = notas[i];
			
			System.out.println("La nota del " +(i+1) + "º es: " + notas[i]);
		
		}
		sc.close();
	}

}

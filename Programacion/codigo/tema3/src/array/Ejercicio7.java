package array;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vector1 = new double [5];
		double[] vector2 = new double [5];
		double[] vector3 = new double [5];
		
		System.out.println("Valor del 1º vector");
		for(int i = 0 ; i<vector1.length ; i++) {
			System.out.println("Dime el " + (i + 1) + " valor de este vector: ");
			vector1[i] = Double.parseDouble(sc.nextLine());
		}
		System.out.println("Valor del 2º vector");
		for(int i = 0 ; i<vector2.length ; i++) {
			System.out.println("Dime el " + (i + 1) + " valor de este vector: ");
			vector2[i] = Double.parseDouble(sc.nextLine());
		}
		System.out.println("Los valores del vector 3 son: ");
		for(int i = 0 ; i<vector3.length ; i++) {
			System.out.println("Los " + i + " primeros valores de los vectores 1 y 2 son " + vector1[i] + " y " + vector2[i] + ". El total de su suma es " + (vector1[i] + vector2[i]));
		} 
		
		
		sc.close();
	}

}

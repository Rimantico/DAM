package tema3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vector1 = new double[5];
		double[] vector2 = new double[5];
		double[] vector3 = new double[5];
		
		//Pedimos los valores del vector 1
		
		System.out.println("Valores del vector 1");
		for(int i = 0 ; i<vector1.length ; i++) {
			System.out.print("Dime el " + (i+1) + "º valor del vector 1: ");
			vector1[i] = Double.parseDouble(sc.nextLine());
		}
		System.out.println("Valores del vector 1 correctamente leidos");
		
		//Pedimos los valores del vector 2
		System.out.println("Valores del vector 2");
		for(int i = 0 ; i<vector2.length ; i++) {
			System.out.print("Dime el " + (i+1) + "º valor del vector 2: ");
			vector2[i] = Double.parseDouble(sc.nextLine());
		}
		System.out.println("Valores del vector 2 correctamente leidos");
		
		//Resultados de vector 1 y 2 dentro del vector 3
		System.out.println("Resultados en el vector 3");
		for(int i = 0 ; i<vector3.length ; i++) {
			System.out.println(vector1[i] + " + " + vector2[i] + "= " + (vector1[i]+vector2[i]));
		}
		
		sc.close();
	}

}

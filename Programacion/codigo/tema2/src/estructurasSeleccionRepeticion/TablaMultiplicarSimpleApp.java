package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class TablaMultiplicarSimpleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numEntero;
		
		
		
		System.out.println("TABLA DE MULTIPLICAR DE...");
		System.out.println("¿De que número entero quieres mostrar su tabla de multiplicar?: ");
		numEntero = Integer.parseInt(sc.nextLine());
		
		System.out.println("Tabla de multiplicar de " + numEntero);
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(numEntero + " X " + i + " = " + numEntero*i);
		}
		
		
		sc.close();
	}

}

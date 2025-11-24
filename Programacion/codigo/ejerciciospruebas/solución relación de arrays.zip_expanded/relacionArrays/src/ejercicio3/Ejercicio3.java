package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static final int NUMERODENOTAS = 5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] valores = new double[NUMERODENOTAS];
	
		for (int i=0; i<valores.length; i++) {
			boolean test;
			do {
				test = false;
				System.out.print("Introduzca la nota " + (i+1) + ": ");
				try {
					valores[i] = Double.parseDouble(sc.nextLine());
					test = true;
				}catch (NumberFormatException e) {
					continue;
				}
			}while(!isCorrect(valores[i]) || (!test));
		}
		
		// Visualizamos los valores
		System.out.print("Los valores del array son: ");
		for (int i=0; i<valores.length; i++) {
			 System.out.print(valores[i] + " ");
		}
		
		//Visualizamos la nota más alta
		double mayorValor = valores[0];
		for (int i=0; i<valores.length; i++) {
			 mayorValor = (valores[i]>mayorValor)? valores[i]: mayorValor; 
		}
		System.out.print("\nLa nota más alta es: " + mayorValor);
		
		//Visualizamos la nota más baja
		double menorValor = valores[0];
		for (int i=0; i<valores.length; i++) {
			menorValor = (valores[i]<menorValor)
				? valores[i] 
				: menorValor
			; 
		}
		System.out.print("\nLa nota más baja es: " + menorValor);
		
		//Visualizamos la nota media
		double suma = 0;
		for (int i=0; i<valores.length; i++) {
			 suma += valores[i];
		}
		System.out.print("\nLa nota media de las notas es: " + (suma/valores.length));	
		
		
		sc.close();
	}
	// Comprueba si el valor se encuentra entre cero y diez
	public static boolean isCorrect(double valor) {
		if ((valor>=0) && (valor<=10))
			return true;
		return false;
	}
}

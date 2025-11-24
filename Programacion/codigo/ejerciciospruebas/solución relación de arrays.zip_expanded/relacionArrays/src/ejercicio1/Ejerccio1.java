package ejercicio1;

import java.util.Random;

public class Ejerccio1 {

	public static void main(String[] args) {

		int[] valores = new int[10];
		Random valor = new Random();
		for (int i=0; i<valores.length; i++) {
			valores[i] = valor.nextInt(11);
		}
		System.out.print("Los valores del array son: ");
		for (int i=0; i<valores.length; i++) {
			 System.out.print(valores[i] + " ");
		}
	}

}

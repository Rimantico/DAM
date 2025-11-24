package ejercicio5;

import java.util.Random;

public class Ejercicio5 {

	public static final int NUMERODEELEMENTOS = 20;
	
	public static void main(String[] args) {
		
		int[] valores = new int[NUMERODEELEMENTOS];
		Random random = new Random();
		
		for (int i=0; i<valores.length; i++) {
			valores[i] = random.nextInt(11);
		}
		
		// Visualizamos los valores originales
		System.out.print("Los valores originales son: ");
		for (int i=0; i<valores.length; i++) 
			System.out.print(valores[i] + " ");
		
		valores = burbuja(valores);
		
		// Visualizamos los valores ordenados
		System.out.print("\nLos valores ordenados son: ");
		for (int i=0; i<valores.length; i++) 
			System.out.print(valores[i] + " ");
	}
	// Método que ordena el array por el método de la burbuja
	public static int[] burbuja(int[] array) {
	    int n = array.length;
	    boolean hayIntercambio;

	    for (int i = 0; i < n - 1; i++) {
	        hayIntercambio = false;

	        // Recorrer el array
	        for (int j = 0; j < n - 1 - i; j++) {
	            // Si el elemento actual es mayor que el siguiente, intercambiar
	            if (array[j] > array[j + 1]) {
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	                hayIntercambio = true;
	            }
	        }

	        // Si no hubo intercambios, ya está ordenado
	        if (!hayIntercambio) 
	        	break;
	    }
	    return array;
	}

}

package array;

public class Ejercicio5 {
	/**
	 * Hacer un programa que inicialice un vector de números con valores aleatorios,
	 * y posterior ordene los elementos de menor a mayor. Utiliza el método de la
	 * burbuja.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Inicializamos dos variables.
		int valor = (int) (Math.random() * 20);
		int numeroAleatorio;
		// Inicializamos el array donde la longitud máxima es el valor aleatorio
		// anterior
		int[] vector = new int[valor];
		int auxiliar;
		// Introducimos valores aleatorios dentro del array
		for (int i = 0; i < valor; i++) {
			numeroAleatorio = (int) (Math.random() * 100);
			vector[i] = numeroAleatorio;
		}
		// A continuación la Bubble Sort
		for (int i = 0; i < vector.length - 1; i++) {
			// En cada iteración llegamos hasta n-1-i ya que hemos ordenado i enteros
			// en las i iteraciones pasadas.
			for (int j = 0; j < (vector.length - 1 - i); j++) {
				// Comparamos e intercambiamos si se cumple la condición
				if (vector[j] > vector[j + 1]) {
					auxiliar = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = auxiliar;
				}
			}
		}
		// Imprimimos los valores
		for (int i = 0; i < vector.length; i++) {
			System.out.println("El valor del " + (i + 1) + "º numero es " + vector[i]);
		}

	}

}

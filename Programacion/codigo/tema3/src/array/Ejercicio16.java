package array;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion;

		System.out.println("Programa menú actividad 16 por Juan Gómez Ruiz");
		int[] array = new int[7];

		do {
			System.out.println(
					"1. Introducción de valores\n2. Realiza la búsqueda secuencial\n3. Búsqueda por el método de búsqueda binaria\n4. Realiza la ordenación por el método burbuja\n5. Realiza la ordenacion por el método de selección\n6. Realiza la ordenación por el método de quick-sort\n7. Salir del programa");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			// Introducción de datos
			case 1:
				System.out.println("Ha elegido Introducción de valores al array");
				for (int i = 0; i < array.length; i++) {
					System.out.print("Introduzca el " + (i + 1) + "º valor: ");
					array[i] = Integer.parseInt(sc.nextLine());
				}
				System.out.println("Todos los valores han sido introducidos correctamente");
				break;
			// búsqueda secuencial
			case 2:

				int numeroBuscar;
				System.out.println("Ha elegido la búsqueda secuencial dentro del array");
				System.out.println("¿Cual número quiere buscar?");
				numeroBuscar = Integer.parseInt(sc.nextLine());
				int posicion = -1;
				int comprobar = 0;
				for (int i = 0; i < array.length; i++) {// recorremos todo el arreglo
					if (array[i] == numeroBuscar) {
						posicion = i;
						comprobar = 0;
						break;
					} else
						comprobar = -1;
				}
				if (comprobar == 0)
					System.out.println("El numero " + numeroBuscar + " se encuentra en la posicion " + (posicion + 1));
				else
					System.out.println("El numero " + numeroBuscar + " no se encuentra en este array");
				break;
			// Búsqueda por método binario
			case 3:
				System.out.println("Ha elegido la búsqueda por método binario ");
				int numeroBuscarBinario = Integer.parseInt(sc.nextLine());

				int numeroMinimo = 0;
				int numeroMaximo = array.length - 1;
				int medio;
				int resultado = -1;

				while (numeroMinimo <= numeroMaximo) {
					medio = numeroMinimo + (numeroMaximo - numeroMinimo) / 2;

					if (array[medio] == numeroBuscarBinario) {
						resultado = medio;
						break;
					}

					if (array[medio] < numeroBuscarBinario) {
						numeroMinimo = medio + 1;
					} else {
						numeroMaximo = medio - 1;
					}
				}

				if (resultado != -1) {
					System.out.println("Encontrado en el índice: " + resultado);
				} else {
					System.out.println("No encontrado.");
				}
				break;
			// Ordenacion por metodo de burbuja
			case 4:
				System.out.println("Ha elegido ordenación por método de burbuja");
				int auxiliar;
				for (int i = 0; i < array.length - 1; i++) {
					// En cada iteración llegamos hasta n-1-i ya que hemos ordenado i enteros
					// en las i iteraciones pasadas.
					for (int j = 0; j < (array.length - 1 - i); j++) {
						// Comparamos e intercambiamos si se cumple la condición
						if (array[j] > array[j + 1]) {
							auxiliar = array[j];
							array[j] = array[j + 1];
							array[j + 1] = auxiliar;
						}
					}
				}
				for (int i = 0; i < array.length; i++) {
					System.out.println("El valor del " + (i + 1) + "º numero es " + array[i]);
				}
				break;
			// Ordenacion por método de selección
			case 5:
				System.out.println("Ha elegido ordenación por método de selección");
				for (int i = 0; i < array.length - 1; i++) {

					int indiceMin = i;

					// Buscar el mínimo en el restante del array
					for (int j = i + 1; j < array.length; j++) {
						if (array[j] < array[indiceMin]) {
							indiceMin = j;
						}
					}

					// Intercambio
					int temp = array[indiceMin];
					array[indiceMin] = array[i];
					array[i] = temp;
				}

				// Imprimir resultado
				System.out.println("Array ordenado:");
				for (int n : array) {
					System.out.print(n + " ");
				}

				break;
			// Ordenación por quick sort
			case 6:
				System.out.println("Ha elegido ordenación por método quick sort");
				int low = 0;
				int high = array.length - 1;

				// Pila para simular las llamadas recursivas
				int[] stackLow = new int[array.length];
				int[] stackHigh = new int[array.length];
				int top = -1;

				// Push inicial
				stackLow[++top] = low;
				stackHigh[top] = high;

				while (top >= 0) {

					low = stackLow[top];
					high = stackHigh[top--];

					while (low < high) {

						// -------- PARTITION dentro del mismo main --------
						int pivot = array[high];
						int i = low - 1;

						for (int j = low; j < high; j++) {
							if (array[j] <= pivot) { // Cambiar <= por >= para ordenar de mayor a menor
								i++;

								int temp = array[i];
								array[i] = array[j];
								array[j] = temp;
							}
						}

						int temp = array[i + 1];
						array[i + 1] = array[high];
						array[high] = temp;

						int pivotIndex = i + 1;
						// --------------------------------------------------

						// Optimizar: procesar primero el subarray más pequeño
						if (pivotIndex - 1 - low > high - (pivotIndex + 1)) {

							if (low < pivotIndex - 1) {
								stackLow[++top] = low;
								stackHigh[top] = pivotIndex - 1;
							}

							low = pivotIndex + 1;

						} else {

							if (pivotIndex + 1 < high) {
								stackLow[++top] = pivotIndex + 1;
								stackHigh[top] = high;
							}

							high = pivotIndex - 1;
						}
					}
				}

				// Imprimir
				for (int n : array)
					System.out.print(n + " ");
				break;
			// Salida del programa
			case 7:
				System.out.println("Saliendo del programa...");
			}
		} while (opcion != 7);

		sc.close();
	}

}

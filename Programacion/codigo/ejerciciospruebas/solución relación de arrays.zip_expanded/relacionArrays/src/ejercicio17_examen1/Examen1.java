package ejercicio17_examen1;

import java.util.Random;

public class Examen1 {
	
	    public static final int NUMEROELEMENTOS = 100;

	    public static void main(String[] args) {

	        int[] arrayAzul = new int[NUMEROELEMENTOS];
	        int[] arrayRojo = new int[NUMEROELEMENTOS];

	        // Rellenamos los arrays con valores aleatorios
	        crear_array(arrayAzul);
	        crear_array(arrayRojo);

	        // Imprimir arrays
	        System.out.println("Array Azul");
	        imprimir_array(arrayAzul);

	        System.out.println("\nArray Rojo");
	        imprimir_array(arrayRojo);

	        // Contadores
	        int mayorArrayAzul = 0;
	        int mayorArrayRojo = 0;
	        int iguales = 0;

	        for (int i = 0; i < NUMEROELEMENTOS; i++) {
	            int r = comparar_valores(arrayAzul[i], arrayRojo[i]);

	            if (r == 1)
	                mayorArrayAzul = incrementar_valor(mayorArrayAzul);
	            else if (r == -1)
	                mayorArrayRojo = incrementar_valor(mayorArrayRojo);
	            else
	                iguales = incrementar_valor(iguales);
	        }

	        // Estadísticas de cada array
	        int max1 = maximo(arrayAzul);
	        int min1 = minimo(arrayAzul);
	        double media1 = media(arrayAzul);

	        int max2 = maximo(arrayRojo);
	        int min2 = minimo(arrayRojo);
	        double media2 = media(arrayRojo);

	        // Mostrar resultados
	        System.out.println("\nLos resultados son:\n");

	        System.out.println("Veces que array Azul > array Rojo: " + mayorArrayAzul);
	        System.out.println("Veces que array Rojo > array Azul: " + mayorArrayRojo);
	        System.out.println("Veces que son iguales: " + iguales);

	        if (mayorArrayAzul > mayorArrayRojo)
	            System.out.println("\nEL ARRAY AZUL ES EL GANADOR");
	        else if (mayorArrayRojo > mayorArrayAzul)
	            System.out.println("\nEL ARRAY ROJO ES EL GANADOR");
	        else
	            System.out.println("\nLos arrays son iguales en cantidad de valores mayores.");

	        System.out.println("\nEstadísticas Array Azul:");
	        System.out.println("Máximo: " + max1);
	        System.out.println("Mínimo: " + min1);
	        System.out.println("Media: " + media1);

	        System.out.println("\nEstadísticas Array Rojo");
	        System.out.println("Máximo: " + max2);
	        System.out.println("Mínimo: " + min2);
	        System.out.println("Media: " + media2);
	    }

	    public static void crear_array(int[] array) {
	        Random random = new Random();
	        for (int i = 0; i < array.length; i++)
	            array[i] = random.nextInt(10) + 1;
	    }

	    // Imprime un array completo
	    public static void imprimir_array(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
	            if ((i + 1) % 20 == 0) System.out.println();  // salto de línea cada 20 números
	        }
	    }

	    // Compara dos valores y devuelve:
	    // 1 si a > b, -1 si b > a, 0 si son iguales
	    public static int comparar_valores(int a, int b) {
	        if (a > b) return 1;
	        if (b > a) return -1;
	        return 0;
	    }

	    // Incrementa un valor y lo devuelve
	    public static int incrementar_valor(int v) {
	        return v + 1;
	    }

	    // Máximo de un array
	    public static int maximo(int[] array) {
	        int max = array[0];
	        for (int n : array)
	            if (n > max) max = n;
	        return max;
	    }

	    // Mínimo de un array
	    public static int minimo(int[] array) {
	        int min = array[0];
	        for (int n : array)
	            if (n < min) min = n;
	        return min;
	    }

	    // Media de un array
	    public static double media(int[] array) {
	        int suma = 0;
	        for (int n : array)
	            suma += n;
	        return (double) suma / array.length;
	    }
	}

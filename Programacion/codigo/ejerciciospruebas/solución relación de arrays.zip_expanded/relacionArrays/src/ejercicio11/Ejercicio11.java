package ejercicio11;

public class Ejercicio11 {

	    public static final int FILAS = 5;
	    public static final int COLUMNAS = 5;

	    public static void main(String[] args) {

	        int[][] diagonal = new int[FILAS][COLUMNAS];

	        // Rellenamos el array bidimensional
	        for (int i = 0; i < FILAS; i++) {
	            for (int j = 0; j < COLUMNAS; j++) {
	                if (i == j) {
	                    diagonal[i][j] = 1; // diagonal principal
	                } else {
	                    diagonal[i][j] = 0; // resto de elementos
	                }
	            }
	        }

	        // Mostramos el array
	        System.out.println("Contenido de la matriz:");
	        for (int i = 0; i < FILAS; i++) {
	            for (int j = 0; j < COLUMNAS; j++) {
	                System.out.print(diagonal[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

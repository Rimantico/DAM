package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	
    public static final int FILAS = 5;
    public static final int COLUMNAS = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[FILAS][COLUMNAS];

        System.out.println("Introduzca los valores a la matriz con enteros:");

        // Introducimos los datos
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = leerEntero(sc,
                        "Elemento [" + i + "][" + j + "]: ");
            }
        }

        System.out.println("\nLas sumas de las filas son:");
        for (int i = 0; i < FILAS; i++) {
            int sumaFila = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        System.out.println("\nLas filas de las columnas son:");
        for (int j = 0; j < COLUMNAS; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < FILAS; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        sc.close();
    }

    public static int leerEntero(Scanner sc, String mensaje) {
        int numero = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.err.println("Error: introduce un número entero válido.");
            }
        } while (!valido);

        return numero;
    }
}

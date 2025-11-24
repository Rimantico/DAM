package ejercicio12;

public class Ejercicio12 {
    public static final int FILAS = 5;
    public static final int COLUMNAS = 15;

    public static void main(String[] args) {

        int[][] marco = new int[FILAS][COLUMNAS];

        // Introducimos los valores en el array
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i == 0 || i == FILAS - 1 || j == 0 || j == COLUMNAS - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Visualizamos el array
        System.out.println("Contenido del array: ");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static final int DIASDELASEMANA = 7;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de conductores: ");
        int numConductores = leerEntero(sc);

        String[] nombres = new String[numConductores];
        double[][] kms = new double[numConductores][DIASDELASEMANA]; 
        double[] total_kms = new double[numConductores];

        // Lectura de datos
        for (int i = 0; i < numConductores; i++) {
            System.out.print("\nNombre del conductor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.println("Introduce los kilómetros para cada día de la semana:");

            for (int j = 0; j < 7; j++) {
                kms[i][j] = leerDecimal(sc, "Día " + (j + 1) + ": ");
            }
        }

        // Cálculo de los kilómetros totales
        for (int i = 0; i < numConductores; i++) {
            double suma = 0;
            for (int j = 0; j < 7; j++) {
                suma += kms[i][j];
            }
            total_kms[i] = suma;
        }

        // Mostramos los resultados
        System.out.println("\nKilómetros totales por conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + " -> " + total_kms[i] + " km");
        }

        sc.close();
    }

    public static int leerEntero(Scanner sc) {
        int numero = 0;
        boolean valido = false;

        do {
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero > 0) {
                    valido = true;
                } else {
                    System.err.print("Debe ser un número positivo. Inténtelo de nuevo: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("Error: introduce un número entero válido: ");
            }
        } while (!valido);

        return numero;
    }

    public static double leerDecimal(Scanner sc, String mensaje) {
        double numero = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);
            try {
                numero = Double.parseDouble(sc.nextLine());
                if (numero >= 0) {
                    valido = true;
                } else {
                    System.err.println("El valor no puede ser negativo.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error: introduce un número válido.");
            }
        } while (!valido);

        return numero;
    }
}

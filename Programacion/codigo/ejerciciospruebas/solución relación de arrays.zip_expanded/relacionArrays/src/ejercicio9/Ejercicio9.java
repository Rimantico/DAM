package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	    public static final int DIAS = 5;
	    public static final int TIPOS = 2; // 0=min, 1=max

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double[][] temperaturas = new double[DIAS][TIPOS];
	        double[] medias = new double[DIAS];

	        System.out.println("Este programa guarda las temperaturas mínimas y "
	        		+ "máximas durante 5 días");

	        // Entrada de datos
	        for (int i = 0; i < DIAS; i++) {
	            System.out.println("\nDía " + (i + 1));

	            temperaturas[i][0] = leerValorDecimal(sc, "Introduce temperatura mínima: ");

	            // Leer temperatura máxima con try/catch
	            temperaturas[i][1] = leerValorDecimal(sc, "Introduce temperatura máxima: ");

	            medias[i] = (temperaturas[i][0] + temperaturas[i][1]) / 2.0;
	        }

	        // Cálculo de la temperatura media
	        System.out.println("\nTemperatura media de cada día:");
	        for (int i = 0; i < DIAS; i++) {
	            System.out.println("Día " + (i + 1) + ": " + medias[i]);
	        }

	        // Cálculo de la temperatura mínima
	        double menorTemp = temperaturas[0][0];
	        for (int i = 1; i < DIAS; i++) {
	            if (temperaturas[i][0] < menorTemp) {
	                menorTemp = temperaturas[i][0];
	            }
	        }

	        System.out.println("\nDía(s) con la menor temperatura mínima (" + menorTemp + "):");
	        for (int i = 0; i < DIAS; i++) {
	            if (temperaturas[i][0] == menorTemp) {
	                System.out.println("Día " + (i + 1));
	            }
	        }

	        // Buscamos la temperatura máxima
	        double buscada = leerValorDecimal(sc,
	                "\nIntroduce una temperatura máxima para buscar: ");
	        boolean encontrado = false;
	
	        System.out.println("Día(s) cuya temperatura máxima coincide:");
	        for (int i = 0; i < DIAS; i++) {
	            if (temperaturas[i][1] == buscada) {
	                System.out.println("Día " + (i + 1));
	                encontrado = true;
	            }
	        }
	        if (!encontrado) {
	            System.out.println("No existe ningún día con esa temperatura máxima.");
	        }
	        sc.close();
	    }

	    // Lee un valor decimal
	    public static double leerValorDecimal(Scanner sc, String mensaje) {
	        double numero = 0;
	        boolean valido = false;

	        do {
	            System.out.print(mensaje);
	            try {
	                numero = Double.parseDouble(sc.nextLine());
	                valido = true;
	            } catch (NumberFormatException e) {
	                System.err.println("Error: introduce un número válido.");
	            }
	        } while (!valido);

	        return numero;
	    }
	}

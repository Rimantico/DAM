package ejercicio15Modificacion;

import java.util.Scanner;

public class Ejercicio15Modificacion {

    public static final int PARTIDOS = 15;
    public static final int JORNADAS = 38;  

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][][] equipos = new String[JORNADAS][PARTIDOS][2];
        int[][][] resultados = new int[JORNADAS][PARTIDOS][2];

        // Pedimos los valores de todos los partidos de la temporada
        System.out.println("Introduzca la jornada, el nombre de los equipos y los goles que han marcado");
        for (int i = 0; i < JORNADAS; i++) {
            System.out.println("\nJORNADA " + (i + 1) + " ");
            for (int j = 0; j < PARTIDOS; j++) {
                System.out.println("\nPartido " + (j + 1));

                System.out.print("Equipo local: ");
                equipos[i][j][0] = sc.nextLine();

                System.out.print("Equipo visitante: ");
                equipos[i][j][1] = sc.nextLine();

                resultados[i][j][0] = leerEntero(sc, "Goles de " + equipos[i][j][0] + ": ");
                resultados[i][j][1] = leerEntero(sc, "Goles de " + equipos[i][j][1] + ": ");
            }
        }

        // Se muestran los resultados completos de una temporada
        System.out.println("\nRESULTADOS COMPLETOS DE LA TEMPORADA\n");

        for (int i = 0; i < JORNADAS; i++) {
            System.out.println("\n Jornada " + (i + 1));

            for (int j = 0; j < PARTIDOS; j++) {
                System.out.println(
                    equipos[i][j][0] + " " + resultados[i][j][0] +
                    " - " +
                    resultados[i][j][1] + " " + equipos[i][j][1] +
                    "  -> Quiniela: " + calcularSigno(resultados[i][j][0], resultados[i][j][1])
                );
            }
        }
        sc.close();
    }

    public static int leerEntero(Scanner sc, String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero >= 0)
                    return numero;
                else
                    System.err.println("El valor no puede ser negativo.");
            } catch (NumberFormatException e) {
                System.err.println("Introduce un número válido.");
            }
        }
    }

    // Calcula el signo de la quiniela
    public static String calcularSigno(int goles1, int goles2) {
        if (goles1 > goles2)
            return "1";      
        else if (goles2 > goles1)
            return "2";      
        else
            return "X";      
    }
}



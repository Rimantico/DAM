package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static final int NUMERODEELEMENTOS = 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa guarda el nombre y la edad de un máximo de 30 alumnos.");
        System.out.println("Introduzca un asterisco (*) en el nombre para terminar.");

        String[] nombres = new String[NUMERODEELEMENTOS];
        int[] edades = new int[NUMERODEELEMENTOS];

        int numeroDeValoresIntroducidos = 0;

        // Introduciomos los valores
        for (int i = 0; i < NUMERODEELEMENTOS; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            if (nombres[i].equals("*")) 
                break; 

            numeroDeValoresIntroducidos++;

            // Pedir edad
            System.out.print("Edad del alumno: ");
            boolean test = false;

           do {
                try {
                    int edad = Integer.parseInt(sc.nextLine());
                    if (edad >= 0 && edad <= 120) {
                        edades[i] = edad;
                        test = true;
                    } else {
                        System.err.print("Edad no válida (0-120). Inténtelo de nuevo: ");
                    }
                } catch (NumberFormatException e) {
                    System.err.print("Debe introducir un número válido. Intente de nuevo: ");
                }
            }while(!test);
        }

        // Mostrar mayores de edad
        System.out.println("\nAlumnos mayores de edad:");
        boolean hayMayores = false;

        for (int i = 0; i < numeroDeValoresIntroducidos; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " (" + edades[i] + " años)");
                hayMayores = true;
            }
        }

        if (!hayMayores) {
            System.out.println("No hay ningún alumno mayor de edad");
        }

        // Mostrar los 3 alumnos de mayor edad
        if (numeroDeValoresIntroducidos > 0) {

            // Array para almacenar índices de los 3 mayores
            int[] mayores = {-1, -1, -1};

            for (int i = 0; i < numeroDeValoresIntroducidos; i++) {

                // Si es mayor que el 1º mayor
                if (mayores[0] == -1 || edades[i] > edades[mayores[0]]) {
                    mayores[2] = mayores[1];
                    mayores[1] = mayores[0];
                    mayores[0] = i;
                }

                // Si es el 2º mayor
                else if (mayores[1] == -1 || edades[i] > edades[mayores[1]]) {
                    mayores[2] = mayores[1];
                    mayores[1] = i;
                }

                // Si es el 3º mayor
                else if (mayores[2] == -1 || edades[i] > edades[mayores[2]]) {
                    mayores[2] = i;
                }
            }

            System.out.println("\nLos alumnos más mayores de edad son:");

            for (int j = 0; j < 3; j++) {
                if (mayores[j] != -1) {
                    System.out.println(nombres[mayores[j]] + " -> " + edades[mayores[j]] + " años");
                }
            }
        }
        int alumnoMayor;
        sc.close();
    }
}

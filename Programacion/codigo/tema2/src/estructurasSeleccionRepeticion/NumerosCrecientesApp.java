package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class NumerosCrecientesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAnterior, numeroActual;
        boolean creciente; 

        System.out.println("NÚMEROS CRECIENTES");
        System.out.print("Introduce un número entero: ");
        numeroAnterior = Integer.parseInt(sc.nextLine());

        do {
            System.out.print("Introduce ahora un número mayor que " + numeroAnterior +
                             " (Introduce un número menor o igual para terminar): ");
            numeroActual = Integer.parseInt(sc.nextLine());

            
            creciente = numeroActual > numeroAnterior;

            if (creciente) {
                numeroAnterior = numeroActual; 
            } else {
                System.out.println("Número introducido menor o igual. Programa terminado.");
            }

        } while (creciente); 

        sc.close();
    }
}

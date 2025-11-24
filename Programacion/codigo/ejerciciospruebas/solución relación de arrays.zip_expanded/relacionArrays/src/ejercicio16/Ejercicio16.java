package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static final int NUMVALORES = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[NUMVALORES];
        int opcion;
        
        do {
            System.out.println("\nElija una opción: ");
            System.out.println("0 - Salir");
            System.out.println("1 - Introducir valores en el array");
            System.out.println("2 - Búsqueda secuencial");
            System.out.println("3 - Búsqueda binaria");
            System.out.println("4 - Ordenación por burbuja");
            System.out.println("5 - Ordenación por selección");
            System.out.println("6 - Ordenación por quick-sort");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(sc);

            switch (opcion) {
            	case 0: break;
                case 1:
                    rellenarArray(numeros, sc);
                    break;
                case 2:
                    busquedaSecuencial(numeros, sc);
                    break;
                case 3:
                    busquedaBinaria(numeros, sc);
                    break;
                case 4:
                    burbuja(numeros);
                    mostrarArray(numeros);
                    break;
                case 5:
                    seleccion(numeros);
                    mostrarArray(numeros);
                    break;
                case 6:
                    quickSort(numeros, 0, numeros.length - 1);
                    mostrarArray(numeros);
                    break;
                default:
                    System.err.println("Opción no válida.");
            }
        }while(opcion!=7);
        
        sc.close();
    }

    public static int leerEntero(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.print("Error. Introduzca un número entero: ");
            }
        }
    }

    public static void rellenarArray(int[] array, Scanner sc) {
        System.out.println("Introduzca " + array.length + " valores enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array[i] = leerEntero(sc);
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array: ");
        for (int n : array)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void busquedaSecuencial(int[] array, Scanner sc) {
        System.out.print("Valor a buscar: ");
        int valor = leerEntero(sc);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                System.out.println("Encontrado en la posición: " + i);
                return;
            }
        }
        System.out.println("No se encontró ese valor en el array.");
    }

    public static void busquedaBinaria(int[] array, Scanner sc) {
        System.out.println("El array debe estar ordenado.");
        mostrarArray(array);

        System.out.print("Valor a buscar: ");
        int valor = leerEntero(sc);

        int inicio = 0, fin = array.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;

            if (array[mitad] == valor) {
                System.out.println("Encontrado en la posición: " + mitad);
                return;
            }
            if (array[mitad] < valor)
                inicio = mitad + 1;
            else
                fin = mitad - 1;
        }
        System.out.println("No se encontró el valor.");
    }

    public static void burbuja(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void seleccion(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            int aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
    }

    public static void quickSort(int[] array, int izquierda, int derecha) {
        int i = izquierda, j = derecha;
        int pivote = array[(izquierda + derecha) / 2];

        while (i <= j) {
            while (array[i] < pivote) i++;
            while (array[j] > pivote) j--;

            if (i <= j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }

        if (izquierda < j)
            quickSort(array, izquierda, j);
        if (i < derecha)
            quickSort(array, i, derecha);
    }
}

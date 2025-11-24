package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static final int NUM_SUCURSALES = 4;
    public static final int NUM_ARTICULOS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[][] cantidades = new int[NUM_SUCURSALES][NUM_ARTICULOS];
        double[][] precios = new double[NUM_SUCURSALES][NUM_ARTICULOS];
        
        // Lectura de datos 
        for (int i=0; i < NUM_SUCURSALES; i++) {
            System.err.println("DATOS DE LA SUCURSAL " + (i + 1) + ":");
            for (int j = 0; j < NUM_ARTICULOS; j++) {
                cantidades[i][j] = leerEnteroPositivo(sc, "Ingrese la CANTIDAD del artículo " + (j + 1) + ": ");
                precios[i][j] = leerDoublePositivo(sc, "Ingrese el PRECIO del artículo " + (j + 1) + ": ");
            }
        }
        
        // Mostrar los resultados
        mostrarTotalesPorArticulo(cantidades);
        cantidadArticuloSucursal(cantidades, 1, 2); // Artículo 3 en la sucursal 1 
        cantidadArticuloSucursal(cantidades, 2, 1); // Artículo 3 en la sucursal 2
        mostrarRecaudacionSucursal(cantidades, precios);
        mostrarRecaudacionTotal(cantidades, precios);
        mostrarSucursalConMayorRecaudacion(cantidades, precios);
        
        sc.close();
    }
    
    // Leer un número entero positivo con control de errores
    public static int leerEnteroPositivo(Scanner sc, String mensaje) {
        int valor = -1;
        while (valor < 0) {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(sc.nextLine());
                if (valor < 0) {
                    System.out.println("Por favor, ingrese un valor positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            }
        }
        return valor;
    }
    
    // Leer un número decimal positivo con control de errores
    private static double leerDoublePositivo(Scanner sc, String mensaje) {
        double valor = -1;
        while (valor < 0) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(sc.nextLine());
                if (valor < 0) {
                    System.out.println("Por favor, ingrese un valor positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número decimal.");
            }
        }
        return valor;
    }
    
    // Mostrar la cantidad total de cada artículo en todas las sucursales
    private static void mostrarTotalesPorArticulo(int[][] cantidades) {
        System.out.println("\nCantidades totales de cada artículo:");
        for (int i = 0; i < cantidades[0].length; i++) {
            int total = 0;
            for (int j = 0; j < cantidades.length; j++) {
                total += cantidades[j][i];
            }
            System.out.println("Artículo " + (i + 1) + ": " + total);
        }
    }
    
    // Mostrar la cantidad de un artículo en una sucursal específica
    private static void cantidadArticuloSucursal(int[][] cantidades, int articulo, int sucursal) {
        // Se resta 1 porque los índices en los arrays comienzan en 0
        int cantidad = cantidades[sucursal - 1][articulo - 1];
        System.out.println("\nCantidad del artículo " + articulo + " en la Sucursal " + sucursal + ": " + cantidad);
    }
    
    // Mostrar la recaudación de cada sucursal
    private static void mostrarRecaudacionSucursal(int[][] cantidades, double[][] precios) {
        System.out.println("\nRecaudación total por sucursal:");
        for (int i = 0; i < cantidades.length; i++) {
            double recaudacion = 0;
            for (int j = 0; j < cantidades[i].length; j++) {
                recaudacion += cantidades[i][j] * precios[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": " + recaudacion);
        }
    }
    
    // Mostrar la recaudación total de la empresa
    private static void mostrarRecaudacionTotal(int[][] cantidades, double[][] precios) {
        double recaudacionTotal = 0;
        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 0; j < cantidades[i].length; j++) {
                recaudacionTotal += cantidades[i][j] * precios[i][j];
            }
        }
        System.out.println("\nRecaudación total de la empresa: " + recaudacionTotal);
    }
    
    // Mostrar la sucursal con mayor recaudación
    private static void mostrarSucursalConMayorRecaudacion(int[][] cantidades, double[][] precios) {
        double mayorRecaudacion = 0;
        int sucursalMayor = -1;
        
        for (int i = 0; i < cantidades.length; i++) {
            double recaudacion = 0;
            for (int j = 0; j < cantidades[i].length; j++) {
                recaudacion += cantidades[i][j] * precios[i][j];
            }
            if (recaudacion > mayorRecaudacion) {
                mayorRecaudacion = recaudacion;
                sucursalMayor = i + 1;  
            }
        }
        System.out.println("\nLa sucursal con mayor recaudación es la Sucursal " + sucursalMayor + " con una recaudación de " + mayorRecaudacion);
    }
}

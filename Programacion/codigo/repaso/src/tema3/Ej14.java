package tema3;

import java.util.Scanner;

public class Ej14 {

	public static final int SUCURSALES = 4;
	public static final int TOTAL_PRECIOS = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] precio = new double[TOTAL_PRECIOS];
		int[][] sucursales = new int[SUCURSALES][TOTAL_PRECIOS];

		// Introducimos los precios de los artículos
		for (int i = 0; i < precio.length; i++) {
			System.out.print("Introduzca el precio del " + (i + 1) + "º producto: ");
			precio[i] = Double.parseDouble(sc.nextLine());
		}

		// Introducimos cuantos productos se han vendido en las 4 sucursales
		for (int i = 0; i < sucursales.length; i++) {
			for (int j = 0; j < sucursales[i].length; j++) {
				System.out.print("Introduce cuanto vendio el producto " + (j + 1) + " en la sucursal " + (i + 1) + ": ");
				sucursales[i][j] = Integer.parseInt(sc.nextLine());
			}
		}

		// Cantidad total de productos vendidos
		for (int j = 0; j < TOTAL_PRECIOS; j++) {
			int totalProducto = 0;
			for (int i = 0; i < SUCURSALES; i++) {
				totalProducto += sucursales[j][i];
			}
			System.out.println("El total del articulo " + (j + 1) + " es: " + totalProducto);
		}
		// Cantidad total de productos vendidos en la sucursal 2
		int productosVendidosSucursal = 0;

		for (int j = 0; j < TOTAL_PRECIOS; j++) {
			productosVendidosSucursal += sucursales[1][j];
		}

		System.out.println("El total de articulos vendidos en la sucursal 2 es: " + productosVendidosSucursal);
		sc.close();
	}

}

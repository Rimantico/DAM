package array;

import java.util.Scanner;

public class Actividad14 {
	/**
	 * Crear un programa que lea los precios de 5 artículos y las cantidades
	 * vendidas por una empresa en sus 4 sucursales. Informar: Las cantidades
	 * totales de cada artículo. La cantidad de artículos en la sucursal 2. La
	 * cantidad del artículo 3 en la sucursal 1. La recaudación total de cada
	 * sucursal. La recaudación total de la empresa. La sucursal de mayor
	 * recaudación.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] precios = new double[5];
		int[][] ventasSucursales = new int[4][5];

		// Introducimos los precios de los productos

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Dime el precio del producto " + (i + 1) + ": ");
			precios[i] = Double.parseDouble(sc.nextLine());
		}

		// Introducimos cuantos productos hemos vendido por cada sucursal

		for (int i = 0; i < ventasSucursales.length; i++)
			for (int j = 0; j < ventasSucursales[i].length; j++) {
				System.out.println("¿Cuantos productos hemos vendido en la " + (i + 1) + "º sucursal sobre el "
						+ (j + 1) + "º producto?: ");
				ventasSucursales[i][j] = Integer.parseInt(sc.nextLine());
			}

		// Suma de productos totales vendidos

		int sumaCantidades = 0;
		for (int i = 0; i < ventasSucursales.length; i++)
			for (int j = 0; j < ventasSucursales[i].length; j++)
				sumaCantidades += ventasSucursales[i][j];
		System.out.println("La cantidad total de productos vendidos es: " + sumaCantidades);

		// Cantidad de articulos vendidos en la sucursal 2

		int sumaSucursal2 = 0;
		for (int i = 0; i < ventasSucursales[1].length; i++) {
			sumaSucursal2 += ventasSucursales[1][i];
		}
		System.out.println("El total de artículos en la sucursal 2 es " + sumaSucursal2);

		// Cantidad del artículo 3 en la sucursal 1

		System.out.println("La cantidad del artículo 3 en la sucursal 1 es " + ventasSucursales[0][2]);

		// Recaudación total de cada sucursal y ver cual es la mayor sucursal

		double maxRecaudacion = Double.NEGATIVE_INFINITY;
		int sucursalMax = -1;
		for (int i = 0; i < ventasSucursales.length; i++) {
			double recaudacionSucursales = 0;

			for (int j = 0; j < ventasSucursales[i].length; j++) {
				recaudacionSucursales += ventasSucursales[i][j] * precios[j];

			}
			System.out.println("La recaudación total de la sucursal " + (i + 1) + " es: " + recaudacionSucursales);
			if (recaudacionSucursales > maxRecaudacion) {
				maxRecaudacion = recaudacionSucursales;
				sucursalMax = i;
			}
		}

		// Recaudación total

		double recaudacionTotal = 0;
		for (int i = 0; i < ventasSucursales.length; i++)
			for (int j = 0; j < ventasSucursales[i].length; j++)
				recaudacionTotal += ventasSucursales[i][j] * precios[j];
		System.out.println("La recaudación total de la empresa es: " + recaudacionTotal);

		// Sucursal con mayor recaudación

		System.out.println("La sucursal con mayor recaudación es la " + (sucursalMax + 1) + " con una recaudación de "
				+ maxRecaudacion);

		sc.close();
	}

}

package estructurasSeleccion;

import java.util.Scanner;

public class CalculeImporteApp {
	public static final double DESCUENTO = 0.20;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double compra;
		double total;
		
		
		System.out.println("DESCUENTOS AL COMPRAR");
		System.out.print("Introduce el importe de la compra en euros: ");
		compra = Double.parseDouble(sc.nextLine());
		
		if (compra >= 100) {
			 total = compra-(compra * DESCUENTO);
			 
			 System.out.println("Como la compra es superior a 100€ la compra tinene un descuento del 20%. El importe a pagar es de " + total);
		}else
			System.out.println("El importe a pagar es de " + compra);
		
		sc.close();
	}

}

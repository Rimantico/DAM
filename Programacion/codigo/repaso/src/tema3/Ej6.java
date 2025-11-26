package tema3;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] mes = { "Salir","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int[] diasAno = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int numMes;
		do {
			System.out.println("Introduzca un numero de mes (0 para salir):");
			 numMes = Integer.parseInt(sc.nextLine());
			
			if(numMes == 0) {
				System.out.println("Saliendo del programa...");	
			}else
				if(numMes > 0 && numMes < 13) {
					System.out.println("El mes " + numMes + " tiene " + diasAno[numMes] + " dias");
					System.out.println("El mes " + numMes + "tiene el nombre de " + mes[numMes]);
				}else
					System.err.println("Numero invalido. Por favor introduzca un nuevo dígito");
				
		}while(numMes != 0);

		sc.close();
	}

}

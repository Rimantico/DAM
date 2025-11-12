package array;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numMes = new int[12];
	
		int[] numDias = new int [12];
		
		String[] nombreMes = new String[12];
		
		
		System.out.println("Ejercicio 6");
		for(int i = 0 ; i< numMes.length; i++) {
			System.out.print("Dime el número del mes: ");
			numMes[i] = Integer.parseInt(sc.nextLine());
			
			
			System.out.print("Dime cuantos dias tiene el mes: ");
			numDias[i] = Integer.parseInt(sc.nextLine());;
			
			
			System.out.print("Dime el nombre del mes: ");
			nombreMes[i] = sc.nextLine();
		}
		
		for(int i = 0 ; i < 12 ; i++) {
			System.out.println("Mes Nº " + numMes[i] + "\nDias del mes " + numDias[i] + "\nNombre del mes" + nombreMes );
		}
		
		sc.close();
	}

}

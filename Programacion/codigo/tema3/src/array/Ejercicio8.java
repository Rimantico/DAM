package array;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		String introducirNombre;
		do {
			contador++;
			String[] nombre = new String[contador+1];
			int[] edad = new int[contador+1];
			System.out.print("Introduzca el nombre del " + contador + "º Alumno");
			introducirNombre = sc.nextLine();
			nombre[contador] = introducirNombre;
			System.out.println("Introduce la edad de " + nombre[contador]);
			edad[contador] = Integer.parseInt(sc.nextLine());
			
		}while(introducirNombre != "*");
		
		sc.close();
	}

}

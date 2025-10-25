package estructurasSeleccion;

import java.util.Scanner;

public class NombreMesesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes;
		
		System.out.println("NOMBRE DE MES");
		
		System.out.print("Introduce un número entero del 1 al 12 y te diré que mes ocupa esa posición: ");
		mes = Integer.parseInt(sc.nextLine());
		
		switch(mes) {
		case 1:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Enero\"");
			break;
		case 2:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Febrero\"");
			break;
		case 3:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Marzo\"");
			break;
		case 4:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Abril\"");
			break;
		case 5:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Mayo\"");
			break;
		case 6:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Junio\"");
			break;
		case 7:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Julio\"");
			break;
		case 8:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Agosto\"");
			break;
		case 9:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Septiembre\"");
			break;
		case 10:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Octubre\"");
			break;
		case 11:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Noviembre\"");
			break;
		case 12:
			System.out.println("El mes con posicion " + mes + " tiene el nombre \"Diciembre\"");
			break;
		}
		sc.close();
	}

}

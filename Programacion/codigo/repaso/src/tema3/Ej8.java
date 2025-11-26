1package tema3;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] alumnos = new String[30];
		int[] edad = new int[30];
		int contador = 30;
		do {
			for(int i = 0 ; i<alumnos.length ; i++) {
				System.out.print("Introduzca el nombre del " + (i+1) + "º Alumno(* para terminar): ");
				alumnos[i] = sc.nextLine();
				if(alumnos[i].equals("*"))
					break;
				
				System.out.println("Introduzca la edad de " + alumnos[i] + ": ");
				edad[i] = Integer.parseInt(sc.nextLine());
				contador--;
			}
			
			//Si solo se ha introducido un * saldra este error
			if(contador == 30) {
				System.err.println("Introduzca un nombre");
			}
		}while(contador==30);
		
		//Para comprobar si el alumno es menor o mayor
			if(contador == 0) {
				for(int i = 0 ; i<edad.length ; i++) {
					if(edad[i] >= 18) {
						System.out.println("El alumno " + alumnos[i] + " es mayor de edad");
					}
				}
			}else {
				for(int i = 0 ; i<edad.length ; i++) {
					if(edad[i] >= 18) {
						System.out.println("El alumno " + alumnos[i] + " es mayor de edad");
					}
				}
			}
				
		
		
		sc.close();
		
	}

}

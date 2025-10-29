package examenes;

import java.util.Scanner;

public class ExamenBloque2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("PROGRAMA EXAMEN TEMA2");
		do {
			System.out.println("0--Salir\n1--Suma de dos numeros\n2--Suma de los valores que introduzcamos hasta que se introduzca un cero\n3--Media de los valores que introduzcamos hasta que introduzcamos un cero\n4--Funcion módulo de la división enterea entre dos valores que introduzcamos");
			System.out.println("Eliga una opción:");
			opcion = comprobar(sc);
		}while(opcion <= 0 && opcion>=4);
		
		
		sc.close();
	}

	
	public static int comprobar(Scanner sc) {
		int numEntero = -1;
		try {
			numEntero= Integer.parseInt(sc.nextLine());
			if(numEntero >4)
			System.out.println("Introduce un numero entre el 0 y el 4");
		}catch(NumberFormatException e) {
			System.out.println("Introduce un formato de numero válido");
		}
		return numEntero;
	}
}

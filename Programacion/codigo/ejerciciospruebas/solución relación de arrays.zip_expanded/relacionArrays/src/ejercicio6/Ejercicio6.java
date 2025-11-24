package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static final int NUMERODEELEMENTOS = 12;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
		int diaDelMes = -1;
		int esBisiesto = -1;
		
		// Si el año es bisiesto, hay que cambiar los días que tiene febrero
		System.out.print("Indique si el año es bisiesto: \n0 - no es bisiesto "
				+ "\n1 - si es bisiesto");
		do {
			try {
				esBisiesto = Integer.parseInt(sc.nextLine());
			}catch (NumberFormatException e) {
				continue;
			}	
		}while(!isCorrect(esBisiesto, 0, 1));
		
		if (esBisiesto==1) 
			meses[1] = 29; // Si es año bisiesto, febrero tiene 29 días
			
		// Pedimos el número del mes que tenemos que visualizar
		System.out.print("Introduzca el día del mes");
		do {
		try {
			diaDelMes = Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			continue;
		}	
		}while(!isCorrect(diaDelMes, 1, 31));
	
		// Visualizamos el resultado
		System.out.print("El mes seleccionado tiene " + meses[diaDelMes-1] + " días");
		
		sc.close();
	}
	// Comprueba si el valor se encuentra entre cero y diez o es -1
	public static boolean isCorrect(int valor, int minimo, int maximo) {
		if ((valor>=minimo) && (valor<=maximo))
			return true;
		
		System.err.println("Introduzca un valor correcto");
		return false;
	}
}

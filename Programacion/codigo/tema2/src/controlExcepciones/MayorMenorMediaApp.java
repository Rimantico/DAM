package controlExcepciones;

import java.util.Scanner;

public class MayorMenorMediaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MAYOR, MENOR Y MEDIA (A PRUEBA DE USUARIOS MALICIOSO)");
		
		int numIntroducir;
		double num = 0 ;
		double mayor = Double.NEGATIVE_INFINITY;
		double menor = Double.POSITIVE_INFINITY;
		double suma= num;
		int contador = 0;
		double media;
		
		numIntroducir = introducirNumeros(sc);
		
		
		
		for(int i = 1 ; i <= numIntroducir ; i++) {
			num = numeros(sc, i);
			suma+= num;
			contador++;
			
			if(num > mayor) {
				mayor =num;
			}
			if(num < menor) {
				menor = num;
			}
		}
		
		media = suma/contador;
		
		System.out.println("El mayor de los números introducidos ha sido " + mayor);
		System.out.println("El menor de los números introducidos ha sido " + menor);
		System.out.println("La media de todos los números vale: " + media);
		
		
		sc.close();
	}

	public static int introducirNumeros(Scanner sc) {
		boolean comprobacion = false;
		int valor = 0;
		do {
			System.out.print("¿Cuantos numeros desea introducir?: ");
			
			try {
				valor = Integer.parseInt(sc.nextLine());
				comprobacion = true;
			}catch(NumberFormatException e){
				System.out.println("Dato erroneo.Introduzca otro valor");
			}
		}while(!comprobacion);
		
		return valor;
	}
	public static double numeros(Scanner sc, int i) {
		double num = 0;
		boolean comprobacion = false;
		do {
			System.out.println("Introduzca el numero " + i + ": ");
			try {
				num = Double.parseDouble(sc.nextLine());
				comprobacion = true;
			}catch(NumberFormatException e) {
				System.out.println("Dato erroneo, Introduzca de nuevo un valor");
				comprobacion = false;
			}
		
			
		}while(!comprobacion);
		
		
		return num;
	}
	

}

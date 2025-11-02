package examenes;

import java.util.Scanner;

public class ExamenEjemploTema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		int suma = 0;
		double media;
		
		
		System.out.println("EXAMEN TEMA 2 EJEMPLO POR JUAN GÓMEZ RUIZ");
		
		do {
			System.out.print("Introduzca un numero entero: ");
			numero = Integer.parseInt(sc.nextLine());
			if(numero == 0) {
				System.out.println("Has introducido 0. Cerrando programa");
				break;
			}
			if(numero % 2 == 0) {
				System.out.println("El numero " + numero + " es par");
			}else
				System.out.println("El numero " + numero + " es impar");
			if(numero > 0 ) {
				System.out.println("El numero " + numero + " es positivo");
			}else
				System.out.println("El numero " + numero + " es negativo");
			if( numero % 2 != 0 && (numero <= -11 || numero > 20 || numero == 3 || numero == -1  )) {
				suma = suma + numero;
				contador++;
			}
		}while(numero != 0);
		
		media = suma / contador;
		System.out.println("La cantidad de numeros impares introducidos fuera del intervalo de -11 y 20 (-11 incluido) exceptuando -1 y 3 es " + contador);
		System.out.println("La media de los valores introducidos es: "+ media);
		
		
		
		sc.close();
	}

	
	
	
}

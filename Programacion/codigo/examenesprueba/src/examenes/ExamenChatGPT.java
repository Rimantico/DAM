package examenes;

import java.util.Scanner;

public class ExamenChatGPT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temperatura;
		int tempBaja = 0;
		int tempAlta = 0;
		int contador = 0;
		double sumaTemp = 0;
		double media = 0;
		double porcentajeBajas = 0;
		
		System.out.println("Programa de temperaturas por Juan Gómez Ruiz");
		do {
			System.out.println("Introduzca una temperatura(Grados Celsius)");
			temperatura =temperatura(sc);
			
			
			if(temperatura == 999) {
				System.out.println("Has introducido el numero que cierra el programa.Cerrando programa...");
				break;
			}
			
			sumaTemp = sumaTemp + temperatura;
			media = sumaTemp/contador;
			
			if(temperatura < 10) {
				System.out.println("Esta temperatura es baja");
				tempBaja++;
				contador++;
			}else
				if (temperatura > 25) {
					System.out.println("Esta temperatura es alta");
					tempAlta++;
					contador++;
				}else {
					System.out.println("Esta temperatura es media");
					contador++;
				}
			
			if (contador > 1)
				if(media < temperatura) {
					System.out.println("La temperatura introducida esta por encima de la media");
				}else {
					System.out.println("La temperatura introducida esta por debajo de la media");
				}else
					System.out.println("La temperatura introducida es igual a la media");
			
		}while(temperatura != 999);

		if(contador == 0) {
			System.out.println("La media en total de las temperaturas es de 0");
		}else {
			media = sumaTemp / contador;
			porcentajeBajas = (tempBaja * 100) /100;
		}
		System.out.println("La media en total de las temperaturas es de " + media);
		System.out.println("El total de las temperaturas altas es de " + tempAlta);
		System.out.println("El total de las temperatuas bajas es de " + tempBaja);
		System.out.println("El porcentaje de las temperaturas bajas es de " + porcentajeBajas);
		
		sc.close();
	}
public static double temperatura(Scanner sc) {
	double temperatura = 0;
	boolean comprobar = false;
	do {
		try {
		temperatura = Double.parseDouble(sc.nextLine());
		comprobar = true;
	}catch(NumberFormatException e) {
		System.out.println("El dato introducido no es una temperatura válida");
		System.out.println("Introduzca una temperatura(Grados Celsius)");
	}
	}while(!comprobar);
	return temperatura;
	
}
}

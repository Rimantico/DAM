package examenes;

import java.util.Scanner;


/**
 * Programa que se encarga de festionar varias operaciones que se le pueden hacer a las notas del alumnado. En este examen hemos realizado los siguientes calculos:
 * 1. Calculo de media
 * 2.Mostrar la nota mas alta y mas baja
 * 3.Contador de Aprobados
 * Estas tres operaciones constituyen mi programa.
 * 
 * @author Juan Gómez Ruiz
 * @version 1.0 3/11/2025
 */
public class ExamenChatGPT2 {
	
	/**
	 * Modulo principal
	 * @param args no usado
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		double valor;
		
		System.out.println("Sistema de gestión de notas");
		do {
			System.out.println("0-- Salir\n1-- Calcular la nota media\n2-- Mostrar la nota más alta y la más baja\n3-- Contar cuántos alumnos han aprobado");
			System.out.print("Introduzca una opción: ");
			opcion = leerValorOpcion(sc);
			
			switch (opcion){
				case 0:
					System.out.println("0 detectado. Cerrando programa");
					break;
				case 1:
					double suma = 0;
					int contador = 0;
					double media;
					System.out.println("Calculo de media");
					do {
						System.out.print("Dime un numero (negativo para cerrar): ");
						valor = leerValorDouble(sc);
						if(valor < 0) {
							System.out.println("Numero negativo detectado");
							break;
						}
						suma += valor;
						contador++;
						
					}while(valor > 0);
					if (contador == 0) {
						System.out.println("No podemos dividir entre 0");
					}else {
						media = suma / contador;
						System.out.println("La media de todos los numeros es " + media);
					}
					break;
				case 2:
					double mayor = Double.NEGATIVE_INFINITY;
					double menor = Double.POSITIVE_INFINITY;
					
					System.out.println("Mostrar la nota más alta y la más baja");
					do {
						System.out.println("Introduzca un valor (Introduzca negativo para salir): ");
						valor = leerValorDouble(sc);
						if (valor < 0)
							break;
						if(valor > mayor) {
							mayor = valor;
						}
						if(valor< menor) {
							menor = valor;
						}
					}while(valor > 0 );
					System.out.println("El valor mayor es " + mayor);
					System.out.println("El valor menor es " + menor);
					break;
				case 3:
					contador = 0;
					int contadorAprobado = 0;
					
					System.out.println("Contador de aprobados");
					do{
						System.out.println("Introduzca un valor(Introduzca negativo para salir): ");
						valor = leerValorDouble(sc);
						if(valor < 0)
							break;
						if(valor > 10)
							System.out.println("Introduzca un valor valido");
						if (valor >= 5) {
							contador++;
							contadorAprobado++;
						}else
							contador++;
					}while(valor > 0);
						System.out.println("De " + contador + " notas introducidas. " + contadorAprobado + " estan aprobados");
						break;
			}
		}while(opcion != 0);
		
		sc.close();
	}
	
	/**
	 * 
	 * @param sc
	 * @return valor que introduzcamos por teclado
	 */
	public static int leerValorOpcion(Scanner sc) {
		int valor = 0;
		boolean comprobar = false;
		do {
			try {
				valor = Integer.parseInt(sc.nextLine());
				comprobar = true;
			}catch(NumberFormatException e) {
				System.out.println("ERROR. El dato introducido no es un número válido");
				System.out.print("Introduzca una opción: ");
			}
		}while(comprobar == false);
		
		return valor;
	}
	
	/**
	 * 
	 * @param sc
	 * @return valor que introduzcamos por teclado
	 */
	public static double leerValorDouble(Scanner sc) {
		double valor= 0;
		boolean comprobar = false;
		do {
			try {
				valor = Double.parseDouble(sc.nextLine());
				comprobar = true;
			}catch(NumberFormatException e) {
				System.out.println("ERROR. El dato introducido no es un número válido");
				System.out.println("Introduzca un valor(Introduzca negativo para salir): ");
			}
		}while(comprobar == false);
		
		return valor;
	}
}

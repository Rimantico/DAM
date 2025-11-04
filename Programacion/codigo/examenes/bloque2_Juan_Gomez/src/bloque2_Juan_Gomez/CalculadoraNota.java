package bloque2_Juan_Gomez;

import java.util.Scanner;

/**
 * Programa que dependiendo de la opcion introducida utilizará un metodo u otro.
 *  En este caso encontraremos 4 métodos: 
 *  Cálculo de nota de asistencia, 
 *  Cálculo de notatrabajos individuales, 
 *  Cálculo de nota de trabajos grupales
 *  Cálculo de nota de exámenes
 * @author Juan Gómez Ruiz
 * @version 1.0 4/11/2025
 */

public class CalculadoraNota {
	/**
	 * Modulo Principal 
	 * @param args no utilizado
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		int horasClase = 0;
		int horasAsistidas = 0;
		double nota;
		boolean correcto;
		
		//En este apartado se definen las variables y donde se introducen los parametros principales
		
		System.out.println("Calculadora hecha por Juan Gómez Ruiz");
		do {
			
			System.out.println("0--Salir\n1--Calcular nota de asistencia\n2--Calcular nota de trabajos individuales\n3--Calcular nota de trabajos en grupo\n4--Calcular nota de exámanes");
			System.out.println("Eliga una opción: ");
			opcion = comprobarOpcion(sc);
			
			switch(opcion) {
			case 0:
				System.out.println("0 detectado. Cerrando Programa");
				break;
			case 1:
				System.out.println("Cálculo de nota de asistencia");
				do {
					System.out.print("Introduzca el total de numero de horas de clase: ");
					horasClase = comprobarEntero(sc);
					System.out.print("Introduzca el total de horas asistidas: ");
					horasAsistidas = comprobarEntero(sc);
				}while(horasClase == -1 || horasAsistidas == -1);
				
				
				if(horasAsistidas > horasClase) {
					System.out.println("El número de horas asistidas no puede ser mayor que las horas de clase");
				}else
					nota(horasClase , horasAsistidas);
				break;
				
			case 2:
				double nota1 = 0;
				double nota2 = 0;
				double nota3 = 0;
				System.out.println("Cálculo notas individuales");
				do {
					System.out.print("Introduzca la primera nota: ");
					nota1 = comprobarDoble(sc);
					System.out.print("Introduzca la segunda nota: ");
					nota2 = comprobarDoble(sc);
					System.out.print("Introduzca la tercera nota: ");
					nota3 = comprobarDoble(sc);
					
				}while(nota1 == -1 || nota2 == -1 || nota3 == -1);
				if(nota1 > 10 || nota2 > 10 || nota3 > 10) {
					System.out.println("Las notas no pueden ser mayor que 10");
				}else
					nota(nota1 , nota2 , nota3);
				break;
				
			case 3:
				System.out.println("Cálculo nota de trabajos individuales");
				System.out.print("¿Está correcto el trabajo?: ");
				correcto = comprobarBoolean(sc);
				nota(correcto);
				break;
				
			case 4:
				
				System.out.println("Calcular nota exámenes");
				do {
					System.out.print("Introduzca la nota de examenes.Introduzca una nota(0) para acabar: ");
					nota = Double.parseDouble(sc.nextLine());
					if (nota == 0)
						break;
					if(nota > 10) {
						System.out.println("La nota no puede ser mayor a 10");
					}else
						nota(nota);
				}while(nota != 0);
				break;
				
			}
		}while (opcion != 0);
		
		
		
		sc.close();
	}
	/**
	 *  Función para saber si las horas de asistencia son validas o no
	 * @param horasClase Estas son las horas de clase
	 * @param horasAsistidas Estan son las horas que hemos asistido
	 * @return Retornaremos la asistencia si aprobada o suspensa
	 */
	
	public static boolean nota(int horasClase ,int horasAsistidas) {
		double faltas;
		boolean asistencia = false;
		
		faltas = horasClase *0.2;
		
		if(horasAsistidas < faltas) {
			System.out.println("La nota de asistencia es 0");
			asistencia = false;
		}else {
			System.out.println("la nota de asistencia es 1");
			asistencia = true;
		}
			
		return asistencia;
	}
	
	/**
	 *  Función para saber la media de tres valores o 0
	 * @param nota1 Primer valor Segundo valor Introducido
	 * @param nota2 Segundo valor introducido
	 * @param nota3 Segundo valor introducido
	 * @return Retornamos la media o que tenemos un 0
	 */
	public static double nota(double nota1, double nota2, double nota3) {
		double media = 0;
		if(nota1 < 5 || nota2 < 5 || nota3< 5) {
			System.out.println("La nota es cero");
		}else {
			media = (nota1 + nota2 + nota3)/3;
			System.out.println("La media aritmética de los valores inroducidos es " + media);
		}
		
		return media;
	}
	/**
	 *  Función para saber si el trabajo tiene un 10 o un 2.5
	 * @param correcto
	 * @return Si el trabajo esta correcto un 10, si no un 2.5
	 */
	public static boolean nota(boolean correcto) {
		if (correcto == true) {
			System.out.println("La nota es 10");
		}else
			System.out.println("La nota es 2.5");
		
		return correcto;
	}
	
	/**
	 *  Función para saber si la nota esta aprobada o suspensa
	 * @param nota
	 * @return Retornamos si el examen esta aprobado o suspenso
	 */
	public static double nota(double nota) {
		if(nota >= 5) {
			System.out.println("Aprobado");
		}else
			System.out.println("Suspenso");
		return nota;
	}
	/**
	 * Función para comprobar que no se meta una cosa invalida por teclado
	 * @param sc Scanner
	 * @return Si es correcto o no
	 */
	public static int comprobarOpcion(Scanner sc){
		int opcion = 0;
		boolean comprobar = false;
		do {
			try {
			opcion = Integer.parseInt(sc.nextLine());
			comprobar = true;
		}catch(NumberFormatException e){
			System.out.println("Error. Introduzca un tipo de valor válido");
			System.out.println("Eliga una opción: ");
		}
		}while(comprobar == false);
		return opcion;
		
	}
	/**
	 * Función para comprobar que no se meta una cosa invalida por teclado
	 * @param sc Scanner
	 * @return Si es correcto o no
	 */
	public static int comprobarEntero(Scanner sc){
		int opcion = -1;
		
		try {
		opcion = Integer.parseInt(sc.nextLine());
			
		}catch(NumberFormatException e){
			System.out.println("Error. Introduzca un tipo de valor válido");
		}
		return opcion;
		
	}
	/**
	 * Función para comprobar que no se meta una cosa invalida por teclado
	 * @param sc Scanner
	 * @return Si es correcto o no
	 */
	public static double comprobarDoble(Scanner sc){
		int opcion = -1;
		
		
		try {
			opcion = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e){
			System.out.println("Error. Introduzca un tipo de valor válido");
		}
		
		return opcion;
	}
	/**
	 * Función para comprobar que no se meta una cosa invalida por teclado
	 * @param sc Scanner
	 * @return Si es correcto o no
	 */
	public static boolean comprobarBoolean(Scanner sc){
		boolean comprobar = true;
		
		
		try {
			comprobar = Boolean.parseBoolean(sc.nextLine());
		}catch(NumberFormatException e){
			System.out.println("Error. Introduzca un tipo de valor válido");
			
		}
		
		return comprobar;
	}
	
	/*
	 * PLAN DE PRUEBAS
	 * 
	 * Valor de las Variables		Resultado esperado		Resultado obtenido
	 * 
	 * opcion -> 1
	 * horasClase->10
	 * horasAsistidas->8			La nota es 1			La nota es 1
	 * 
	 * opcion -> 2
	 * nota1->3
	 * nota2->7						La nota es 0			La nota es 0
	 * nota3->8
	 * 
	 * opcion -> 3
	 * correcto->true				La nota es 10			La nota es 10
	 * correcto->false				La nota es 2.5			La nota es 2.5
	 * 
	 * opcion -> 4
	 * nota->5						Aprobado				Aprobado
	 * nota->3						Suspenso				Suspenso
	 */
}

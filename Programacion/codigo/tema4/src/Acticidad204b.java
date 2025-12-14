
import java.util.Scanner;

import paquete1.Fraccion;
public class Acticidad204b {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el numerador de la primera fraccion");
		int numerador1 = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el denominador de la primera fraccion");
		int denominador1 = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el numerado de la segunda fracción");
		int numerador2 = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el denominador de la segunda fraccion");
		int denominador2 = Integer.parseInt(sc.nextLine());
		
		Fraccion fraccion1 = new Fraccion(numerador1 , denominador1);
		Fraccion fraccion2 = new Fraccion(numerador2 , denominador2);
		
		
		// Operaciones
		
		Fraccion suma = fraccion1.suma(fraccion2);
		Fraccion resta =fraccion1.resta(fraccion2);
		Fraccion mult = fraccion1.producto(fraccion2);
		Fraccion div = fraccion1.division(fraccion2);
		
		//Resultado
		
		System.out.println("El resultado de la suma es: ");
		System.out.println("El numerador nos da" + suma.getNumerador() + " y el denominador nos da " + suma.getDenominador())  ;
		System.out.println("El resultado de la resta es: ");
		System.out.println("El numerador nos da" + resta.getNumerador() + " y el denominador nos da " + resta.getDenominador())  ;
		System.out.println("El resultado de la multiplicación es: ");
		System.out.println("El numerador nos da" + mult.getNumerador() + " y el denominador nos da " + mult.getDenominador())  ;
		System.out.println("El resultado de la división es: ");
		System.out.println("El numerador nos da" + div.getNumerador() + " y el denominador nos da " + div.getDenominador())  ;		
		
		// Simplificador
		System.out.println("Simplificado de las fracciones");
		
		sc.close();
	}

}

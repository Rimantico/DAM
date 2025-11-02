package examenes;

import java.util.Scanner;

public class ExamenBloque2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		double valor1 = 0;
		double valor2 = 0;
		
		
		double resultado;
		
		
		
		System.out.println("PROGRAMA EXAMEN ANTERIOR TEMA 2 JUAN GÓMEZ RUIZ ");
		do {
			
			System.out.println("0--Salir \n1--Suma de dos números \n2--Suma de los valores que introduzcamos hasta que se introduzca un cero\n3--Media de los valores que introduzcamos hasta que introduzcamos un cero\n4--Función módulo de la división entera entre dos valores que introduzcamos");
			System.out.print("Introduzca una opcion: ");
			opcion = errorOpciones(sc);
			
			switch(opcion) {
			case 0:
				System.out.println("Muchas gracias por utilizar mi calculadora. Cerrando calculadora...");
				break;
			case 1:
				System.out.println("Has introducido la opción de suma de dos numeros");
				System.out.print("Introduzca el primer valor: ");
				valor1 = errorNumeros(sc);
				System.out.print("Introduzca el segundo valor: ");
				valor2 = errorNumeros(sc);
				resultado = valor1 + valor2;
				System.out.println("El resultado de la suma entre los dos valores es: " + resultado);
				break;
			case 2:
				double suma= 0;
				System.out.println("Has introducido la suma de valores hasta introducir 0");
				do {
					System.out.print("Introduzca un valor(Si quiere acabar de sumar introduzca 0): ");
					valor1 = errorNumeros(sc);
					suma = suma +valor1;
				}while(valor1 != 0);
				resultado = suma;
				System.out.println("El valor de todos los valores sumados es de " + resultado);
				break;
			case 3:
				double media = 0;
				double contador = 0;
				System.out.println("Has introducido la media de los valores que introduzcamos hasta introducir 0");
				do {
					System.out.print("Introduzca el valor con los que quiera hacer la media (Introduzca 0 para acabar): ");
					valor1 = errorNumeros(sc);
					if (valor1 != 0 ) {
						media = media + valor1;
						contador ++;
					}
				}while(valor1 != 0);
				resultado= media / contador;
				System.out.println("El total de la media es de " + resultado); 
				break;
			case 4:
				System.out.println("Has elegido calcular el resto de la division entera entre dos valores que introduzcamos");
				System.out.println("Introduzca el primer valor");
				valor1 = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el segundo valor");
				valor2 = Double.parseDouble(sc.nextLine());
				if(valor2 == 0) {
					System.out.println("El valor 2 no puede ser 0");
				}else {
					resultado = valor1 % valor2;
					System.out.println("El resultado del modulo de valor 1 y valor 2 es " + resultado);
				}
				
				break;
			default:
				System.out.println("Has introducido un valor erroneo. Por favor vuelva a iontroducir un valor entre 0 y 4.");
			}
		}while( opcion != 0);	
		
		sc.close();
		
	}
	
	public static int errorOpciones(Scanner sc) {
		int comprobar;
		try {
			comprobar = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("ERROR. El dato introducido no es un número entero valido");
			return -1;
		}
		return comprobar;
	}
	public static double errorNumeros(Scanner sc) {
		double comprobar;
		try {
			comprobar = Double.parseDouble(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("ERROR. El dato introducido no es un número entero valido. Se cerrará la opcion");
			return 0;
		}
		return comprobar;
	}
}

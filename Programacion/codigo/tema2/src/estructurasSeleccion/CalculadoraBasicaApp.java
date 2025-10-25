package estructurasSeleccion;

import java.util.Scanner;

public class CalculadoraBasicaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char operacion;
		double valor1;
		double valor2;
		double resultado;
		
		System.out.println("PROGRAMA CALCULADORA BÁSICA");
		
		System.out.print("Introduce la operación a realizar (S para suma, R para resta, P para producto y D para división): ");
		operacion = sc.nextLine().charAt(0);
		
		switch(operacion) {
		case 'S':
			System.out.println("Ha elegido Sumar");
			System.out.print("Introduzca el primer valor: ");
			valor1 = Double.parseDouble(sc.nextLine());
			System.out.print("Introduzca el segundo valor: ");
			valor2 = Double.parseDouble(sc.nextLine());
			
			resultado = valor1 + valor2;
			
			System.out.println("El resultado de la suma es " + resultado);
			break;
		case 'R':
			System.out.println("Ha elegido Restar");
			System.out.print("Introduzca el primer valor: ");
			valor1 = Double.parseDouble(sc.nextLine());
			System.out.print("Introduzca el segundo valor: ");
			valor2 = Double.parseDouble(sc.nextLine());
			
			resultado = valor1 - valor2;
			System.out.println("El resultado de la resta es " + resultado);
			break;
		case 'P':
			System.out.println("Ha elegido Multiplicar");
			System.out.print("Introduzca el primer valor: ");
			valor1 = Double.parseDouble(sc.nextLine());
			System.out.print("Introduzca el segundo valor: ");
			valor2 = Double.parseDouble(sc.nextLine());
			
			resultado = valor1 * valor2;
			System.out.println("El resultado de la multiplicación es " + resultado);
			break;
		case 'D':
			System.out.println("Ha elegido Dividir");
			System.out.print("Introduzca el primer valor: ");
			valor1 = Double.parseDouble(sc.nextLine());
			System.out.print("Introduzca el segundo valor: ");
			valor2 = Double.parseDouble(sc.nextLine());
			
			resultado = valor1 / valor2;
			System.out.println("El resultado de la división es " + resultado);
			break;
		}
		
		
		sc.close();
	}

}

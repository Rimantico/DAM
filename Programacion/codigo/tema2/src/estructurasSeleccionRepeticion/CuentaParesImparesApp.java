package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class CuentaParesImparesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int introducirNumeros;
		int num;
		int par = 0;
		int impar = 0;
		
		
		System.out.println("CUENTA PARES O IMPARES");
		System.out.print("¿Cuantos números deseas introducir?: ");
		introducirNumeros = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= introducirNumeros ; i++) {
			System.out.print("Introduce el número " + i +": ");
			num = Integer.parseInt(sc.nextLine());
			
			if(num % 2 == 0) {
				System.out.println("El número " + num + " es par");
				par++;
			}else {
				System.out.println("El número " + num + " es impar");
				impar++;
			}
				
		}
		
		System.out.println("Se han introducido " + par + " números pares y " + impar + " números impares");
		
		
		sc.close();
	}

}

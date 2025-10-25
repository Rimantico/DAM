package estructurasSeleccion;

import java.util.Scanner;

public class EsParImparApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par;
		
		System.out.println("¿PAR O IMPAR?");
		System.out.println("Introduce un número entero: ");
		par = Integer.parseInt(sc.nextLine());
		
		if (par % 2 == 0) {
			System.out.println("El numero es par");
		}else
			System.out.println("El numero es impar");
		
		
		sc.close();
	}

}

package estructurasSeleccionRepeticion;

import java.util.Scanner;

public class MayorMenorMediaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MAYOR, MENOR Y MEDIA");
		
		int numIntroducir;
		double num = 0;
		double mayor = num;
		double menor = num;
		double suma= num;
		int contador = 0;
		double media;
		
		System.out.print("¿Cuantos numeros desea introducir?: ");
		numIntroducir = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= numIntroducir ; i++) {
			System.out.print("Introduzca el numero " + i + ": ");
			num = Double.parseDouble(sc.nextLine());
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

}

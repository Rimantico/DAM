package array;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] reales = new double[12];
		int contador = 12;
		
		for(int i = 0 ; i < reales.length ; i++) {
			System.out.println("Introduzca el numero "+ (i+1) + " hasta 12 o negativo");
			reales[i] = Double.parseDouble(sc.nextLine());
			if(reales[i] < 0)
				break;
			
			contador--;
		}
		//Si introduzco un numero negativo de primeras me saldrá este error
		if (contador == 12)
			System.out.println("Dato inicial erroneo");
		//El resultado si se meten los 12 numeros
		if(contador == 0) {
			for(int i = 0 ; i< reales.length ; i++) {
				System.out.println("el numero " + (i+1) + " es " + reales[i]);
			}
		}else {
			//Se utiliza en caso de que no se llegue a los 12 números para que enseñe cuantos ha introducido
			for(int i = 0 ; i< reales.length- contador ; i++) {
				System.out.println("el numero " + (i+1) + " es " + reales[i]);
			}
			
		}
		sc.close();
	}

}

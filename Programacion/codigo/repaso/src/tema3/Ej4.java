package tema3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] numReal = new double[12];
		int contador = 12;
		
		for(int i = 0 ; i<numReal.length ; i++) {
			System.out.println("Introduzca el " + (i+1) + "º numero (numero negativo para finalizar)");
			numReal[i] = Double.parseDouble(sc.nextLine());
			if(numReal[i] < 0)
				break;
			contador--;
		}
		if(contador == 12)
			System.out.println("Introduzca un digito por favor");
		else
			if(contador == 0) {
				for(double imprimir : numReal)
					System.out.println(imprimir + " ");
			}else
				for(int i = 0 ; i<numReal.length-contador ; i++)
					System.out.println(numReal[i] + " ");
				
		
		
		
		
		sc.close();
	}

}

package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
		
		public static final int NUMERODEELEMENTOS = 12;
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			double[] valores = new double[NUMERODEELEMENTOS];
		
			for (int i=0; i<valores.length; i++) {
				boolean test;
				do {
					test = false;
					System.out.print("Introduzca el valor " + (i+1) + ": ");
					try {
						valores[i] = Double.parseDouble(sc.nextLine());
						test = true;
					}catch (NumberFormatException e) {
						System.err.println("Introduzca un valor correcto");
					}

				}while(!isCorrect(valores[i]) || (!test));
				if (valores[i] == -1.0)
					break;
			}
			
			// Visualizamos los valores
			if (valores[0]==-1)
				System.out.println("El array está vacío");
			else {
				System.out.print("Los valores del array son: ");
				for (int i=0; i<valores.length; i++) {
					if (valores[i]== -1)
						break;
					System.out.print(valores[i] + " ");
				}
			}
			sc.close();
		}
		// Comprueba si el valor se encuentra entre cero y diez o es -1
		public static boolean isCorrect(double valor) {
			if (((valor>=0) && (valor<=10)) || (valor==-1))
				return true;
			return false;
		}
	}

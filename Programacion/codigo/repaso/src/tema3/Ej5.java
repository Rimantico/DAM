package tema3;

import java.util.Random;

public class Ej5 {

	public static void main(String[] args) {
		Random r = new Random();

		int[] aleatorio = new int[r.nextInt(20)];

		for (int i = 0; i < aleatorio.length; i++)
			aleatorio[i] = r.nextInt(50);

		// Metodo burbuja

		for (int i = 0; i < aleatorio.length - 1; i++) {
			for (int j = 0; j < (aleatorio.length - 1 - i); j++) {
				if (aleatorio[j] > aleatorio[j + 1]) {
					int aux = aleatorio[j];
					aleatorio[j] = aleatorio[j + 1];
					aleatorio[j + 1] = aux;
				}
			}
		}
		
		//Array ordenado
		for(int ordenado : aleatorio)
			System.out.print(ordenado + " ");
	}

}

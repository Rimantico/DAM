package tema3;

import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[10];
		for(int i = 0 ; i<array.length ; i++)
			array[i] = r.nextInt(11);
		for(int recorrer : array)
			System.out.print(recorrer + " ");

	}

}

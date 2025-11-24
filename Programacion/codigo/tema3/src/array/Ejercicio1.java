package array;

public class Ejercicio1 {
	/**
	 * Realiza un programa que defina un array de 10 enteros. A continuación
	 * inicialízalo con valores aleatorios (del 1 al 10) y posteriormente muestre en
	 * pantalla cada elemento del vector. Para crear valores aleatorios puedes
	 * utilizar la función Math.Random().
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Declaracion del array
		int[] aleatorio = new int[10];
	

		// Introducir datos en el array
		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i] =(int)  (Math.random() * 10) + 1;;
		}

		// Saca por pantalla los datos del array
		for (int i = 0; i < aleatorio.length; i++) {
			System.out.println("El numero aleatorio " + (i + 1) + " es " + aleatorio[i]);
		}
	}

}

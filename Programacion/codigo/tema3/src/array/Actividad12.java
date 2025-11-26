package array;

public class Actividad12 {
	/**
	 * Diseñar el algoritmo correspondiente a un programa, que: Crea una tabla
	 * bidimensional de longitud 5x15 y nombre ‘marco’. Carga la tabla con dos
	 * únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos
	 * que delimitan la tabla, es decir, las más externas, mientras que el resto de
	 * los elementos contendrán el valor 0.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[][] marco = new int[5][15];

		for (int i = 0; i < marco.length; i++) {
			for (int j = 0; j < marco[i].length; j++) {
				if (i == 0 || j == 0 || j == 14 || i == 4) {
					System.out.print("1");
				} else
					System.out.print("0");
			}
			System.out.println(" ");
		}

	}

}

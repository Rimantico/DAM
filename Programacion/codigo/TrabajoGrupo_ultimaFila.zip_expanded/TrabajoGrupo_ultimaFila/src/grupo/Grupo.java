package grupo;


public class Grupo {

	/**
	 * Programa que saca 10 grupos de 3 personas de una clase  de 30
	 * @param 
	 * @author Ramon Marin, JoseMiguel Marin, Benjamin Agüera, Antonio Ruiz
	 * @version 1.0
	 */
	public static void main(String[] args) {

		int[] numeros = new int[30];

		String[] alumnos = { "Benjamin Agüera jimenez", "Helena Berzosa García", "Javi Callero Martín",
				"Jorge Campos Gómez", "Manuel Castillo Lara", "Mohamed El Baghdadi El Belhadji",
				"Samuel Espejo Naranjo", "Naia Fernández Gumiel", "Juan Andrés Gaspar Maldonado", "Raul Gomez Guzman",
				"Juan Gómez Ruiz", "Lucas González Aneas", "David Liñán Núñez", "Alejandro López-Salvatierra Ruiz",
				"Ramon Marin", "José Miguel Marín Santos", "Raúl Mena García", "Franco Mingrone",
				"Anahí Molina Sandino", "Javier Montiel López", "David Morales Ortíz", "Hugo Pérez Lobato",
				"Daniel Ramírez Cabello", "Álvaro Rodríguez Mondéjar", "David Rollán Arias", "Francisco Ruiz López",
				"Antonio Ruiz Martin", "Pablo Sánchez Moscoso", "Amel Selselet Attou Timimoun",
				"Christian Torres Torreblanca" };

		String[][] grupos = new String[3][10];
		numeros = llenarIndex();

		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				grupos[i][j] = alumnos[numeros[k]];
				k++;
			}
		}
		int i = 0;
		for (int j = 0; j < 10; j++) {
			System.out.println("\nGrupo: "+(j+1));
			for (i = 0; i < 3; i++) {
				System.out.println(" Alumno "+(i+1)+ ": " + grupos[i][j]);
			}
		}

	}

	//rellena array de numeros que seran los indices que seran los indices para rellenear el array doble
	public static int[] llenarIndex() {

		int[] indice = new int[30];
		int i = 0;

		while (i < 30) {
			indice[i] = (int) (Math.random() * 30);
			if(esRepetido(indice[i], indice, i)==false)
				i++;
		}
		return indice;
	}

	public static boolean esRepetido(int numero, int[] array, int index) {

		boolean repe = false;
		for (int i = 0; i < index; i++) {
			if (numero == array[i])
				repe = true;
		}
		return repe;
	}


}
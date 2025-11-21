package grupo3personas;

import java.util.Scanner;

public class Grupo3Personas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Hecho por Juan Gómez, Helena Berzosa, Naia Fernandez y Jorge Campos

		// Variables y arrays

		String[] personas = { "Benjamin Agüera", "Helena Berzosa", "Javi Callero", "Jorge Campos", "Manuel Castillo",
				"Mohamed", "Samuel Espejo", "Naia Fernández", "Juan Andrés", "Raul Gómez", "Juan Gómez",
				"Lucas González", "David Liñán", "Alejandro López", "Ramon Marin", "José Miguel", "Raúl Mena",
				"Franco Mingrone", "Anahí Molina", "Javier Montiel", "David Morales", "Hugo Pérez", "Daniel Ramírez",
				"Álvaro Rodríguez", "David Rollán", "Francisco Ruiz", "Antonio Ruiz", "Pablo Sánchez", "Amel Selselet",
				"Christian Torres" };
		int[] numeroPersonas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				25, 26, 27, 28, 29, 30 };
		int[] comprobar = new int[30];
		int[] comprobarProyectos = new int[15];
		int valor;
		int proyecto;
		int numAlumnos;
		int total = numeroPersonas.length;
		String[] proyectos = { "Concesionario de coches", "Hundir la flota", "Bingo", "Gestión de stock", "Blackjack",
				"Gestión de alumnos", "Siete y media", "Gestión de trabajadores", "Gestión de mis contactos Whatsapp",
				"Gestión de mis enlaces del navegador", "TicTacToe", "Mastermind", "Gestión de libros",
				"Gestión de menú de comidas", "Compra online" };

		// Programa Principal

		// Pediremos cuantos alumnos queremos por grupo. Dependiendo del grupo nos
		// saldrá un grupo restante o no.

		System.out.println("Cuantos almunos quiere que tenga cada grupo?");
		numAlumnos = Integer.parseInt(sc.nextLine());

		int personasSobrantes = total % numAlumnos;
		if (personasSobrantes == 0) {
			for (int i = 0; i < (30 / numAlumnos); i++) {
				System.out.println(" ");
				do {
					proyecto = (int) (Math.random() * 15);
				} while (comprobarProyectos[proyecto] == 1);
				comprobarProyectos[proyecto] = 1;
				System.out.println("Grupo " + (i + 1) + " " + proyectos[proyecto]);
				for (int j = 0; j < numAlumnos; j++) {
					do {
						valor = (int) (Math.random() * 30);
					} while (comprobar[valor] == 1);
					comprobar[valor] = 1;
					System.out.println(numeroPersonas[valor] + "-" + personas[valor]);
				}
			}
		} else {
			for (int i = 0; i < (30 / numAlumnos); i++) {
				System.out.println(" ");
				do {
					proyecto = (int) (Math.random() * 15);
				} while (comprobarProyectos[proyecto] == 1);
				comprobarProyectos[proyecto] = 1;
				System.out.println("Grupo " + (i + 1) + " " + proyectos[proyecto]);
				for (int j = 0; j < numAlumnos; j++) {
					do {
						valor = (int) (Math.random() * 30);
					} while (comprobar[valor] == 1);
					comprobar[valor] = 1;
					System.out.println(numeroPersonas[valor] + "-" + personas[valor]);
				}
			}
			for (int i = 0; i < 1; i++) {
				System.out.println(" ");
				do {
					proyecto = (int) (Math.random() * 15);
				} while (comprobarProyectos[proyecto] == 1);
				comprobarProyectos[proyecto] = 1;
				System.out.println("Grupo sobrante " + " " + (i + 1) + proyectos[proyecto]);
				for (int j = 0; j < personasSobrantes; j++) {
					do {
						valor = (int) (Math.random() * 30);
					} while (comprobar[valor] == 1);
					comprobar[valor] = 1;
					System.out.println(numeroPersonas[valor] + "-" + personas[valor]);
				}
			}

		}

		sc.close();

	}

}
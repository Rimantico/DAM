package clase;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {

	private String dni;
	private String nombre;
	private int edad;
	private int[] notas;

	// Constructor
	public Alumno(String dni, String nombre, int edad, int numeroNotas) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.notas = new int[numeroNotas];
	}

	// Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Introducir nota en el array
	public void introducirNotas(Scanner sc) {
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1));
			int nota = Integer.parseInt(sc.nextLine());
			notas[i] = nota;
		}
	}

	// Mostrar todas las notas
	public void verNotas() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
	}

	// Obtener la nota mayor
	public int notaMayor() {
		int mayor = notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > mayor) {
				mayor = notas[i];
			}
		}
		return mayor;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", notas=" + Arrays.toString(notas)
				+ "]";
	}

}

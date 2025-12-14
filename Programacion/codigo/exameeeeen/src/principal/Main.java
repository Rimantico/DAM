package principal;

import java.util.Scanner;

import clase.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("13123123S", "Juan", 25);
		
		int opcion;

		do {
			System.out.println("Crear a persona 1:");
			System.out.println("1. Introducir DNI");
			System.out.println("2. Introducir Nombre");
			System.out.println("3. Introducir Edad");
			System.out.println("4. Introducir Lugar Nacimiento");
			System.out.println("5. Mostrar datos");
			System.out.println("6. Salir");

			System.out.println("Dime una opción");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {

			case 1:
				System.out.println("Introduce el DNI de la persona");
				persona1.setDni(sc.nextLine());
				break;
			case 2:
				System.out.println("Introduce el nombre");
				persona1.setNombre(sc.nextLine());
				break;
			case 3:
				System.out.println("Introduce la edad");
				persona1.setEdad(Integer.parseInt(sc.nextLine()));
				break;
			case 4:
				System.out.println("Introduce el lugar de nacimiento");
				persona1.setLugarNacimiento(sc.nextLine());
				;
				break;
			case 5:
				persona1.toString();

			}

		} while(opcion!= 6);

		persona2.toString();
		sc.close();
	}

}

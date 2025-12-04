import java.util.Scanner;

public class Ejercicio202_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona persona1 = new Persona();

		
		System.out.println("Dime la edad de la persona");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.println("Dime cuantos hijos tienen");
		int numeroHijos = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el peso de la persona");
		double peso = Double.parseDouble(sc.nextLine());
		
		persona1.edad = edad;
		persona1.numeroHijos = numeroHijos;
		persona1.peso = peso;
		
		
		//Salida
		
		System.out.println("Edad de la persona: " + persona1.edad);
		System.out.println("Numero de hijos: " + persona1.numeroHijos);
		System.out.println("Peso: " + persona1.peso);
		
		
		
		sc.close();
	}

}

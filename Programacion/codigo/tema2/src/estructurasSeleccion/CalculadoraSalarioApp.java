package estructurasSeleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {
	
	public static final int HORANORMAL = 16;
	public static final int HORAEXTRA = 20;
	public static final int HORASEMANA = 40;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalHoras;
		int totalHorasExtra;
		int salario;
		
		System.out.println("PROGRAMA CALCULADOR DE SALARIOS");
		System.out.print("Introduce las horas  trabajadas esta semana: ");
		totalHoras = Integer.parseInt(sc.nextLine());
		
		if (totalHoras >40) {
			totalHorasExtra = totalHoras - HORASEMANA;
			salario = (totalHorasExtra * HORAEXTRA) + (HORANORMAL * HORASEMANA);
			System.out.println("El salario por trabajar 40 horas normales y " + totalHorasExtra + " horas extra es de " + salario);
		}else {
			salario= HORANORMAL *totalHoras;
			System.out.println("Has trabajado " + totalHoras + " lo que equivale a unn salario de " + salario);
		}
			
		sc.close();
	}

}

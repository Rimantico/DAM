package calculoDeNomina;

import java.util.Scanner;

public class CalculoDenNomina {

	public static final double SENIORDEV = 1245.36;
	public static final double JUNIORDEV = 918.54;
	public static final double IADEV = 1170.62;
	public static final double QATESTER = 842.55;
	public static final double IRPF = 0.05;
	
	public static final double HORAEXTRASENIORDEV = 25.43;
	public static final double HORAEXTRAJUNIORDEV = 16.81;
	public static final double HORAEXTRAIADEV = 19.78;
	public static final double HORAEXTRAQATESTER = 14.49;
	
	
	public static void main(String[] args) {
		
		/* En este programa calcularemos las distintas nominas de distintos puestos de trabajo en una misma empresa.
		 * Encontramos cuatro puestos con distintos salarios bases y distintos modificadores que haran que los precios varien
		 */
		
		Scanner sc = new Scanner(System.in);

		
		double horasExtraSenior;
		double horasExtraJunior;
		double horasExtraIaDev;
		double horasExtraQaTester;
		
		double mitadSalarioSenior = SENIORDEV / 2;
		double mitadSalarioJunior = JUNIORDEV /2;
		double mitadSalarioIaDev = IADEV / 2;
		double mitadSalarioQaTest = QATESTER /2;
		
		double nominaSenior;
		double nominaJunior;
		double nominaIaDev;
		double nominaQaTest;
		
		int dineroAntiguedad1 = 25;
		int dineroAntiguedad2 = 18;
		int dineroAntiguedad3 = 20;
		int dineroAntiguedad4 = 16;
		
		System.out.println("EXAMEN TEMA 1 Juan Gómez Ruiz. CÁLCULO DE SALARIO");
		
		System.out.println("Cálculo del Senior Developer");
		System.out.print("Introduzca las horas extras realizadas: ");
		int horas1 = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzca la antigüedad: ");
		int antiguedad1 = Integer.parseInt(sc.nextLine());
		System.out.print("Objetivos (en porcentaje): ");
		double porcentaje1 = Double.parseDouble(sc.nextLine());
		
		// Calculos del Senior Developer
		
		horasExtraSenior = HORAEXTRASENIORDEV * horas1;
		porcentaje1 = (porcentaje1 /100) * mitadSalarioSenior;
		dineroAntiguedad1 = (antiguedad1 / 3)* dineroAntiguedad1;
		nominaSenior = (SENIORDEV + horasExtraSenior + porcentaje1 + dineroAntiguedad1);
		
		System.out.println("Calculo del Junior Developer");
		System.out.print("Introduzca las horas extras realizadas: ");
		int horas2 = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzca la antigüedad: ");
		int viejo2 = Integer.parseInt(sc.nextLine());
		System.out.print("Objetivos (en porcentaje): ");
		double porcentaje2 = Double.parseDouble(sc.nextLine());
		
		
		// Calculos del Junior Developer
		
		horasExtraJunior = HORAEXTRAJUNIORDEV * horas2;
		porcentaje2 = (porcentaje2 /100) * mitadSalarioJunior;
		dineroAntiguedad2 = (viejo2 / 3)* dineroAntiguedad2;
		nominaJunior = (JUNIORDEV + horasExtraJunior + porcentaje2 + dineroAntiguedad2);
		
		System.out.println("Cálculo IA Developer");
		System.out.print("Introduzca las horas extras realizadas: ");
		int horas3 = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzca la antigüedad: ");
		int viejo3 = Integer.parseInt(sc.nextLine());
		System.out.print("Objetivos (en porcentaje): ");
		double porcentaje3 = Double.parseDouble(sc.nextLine());
		
		// Calculos del IA Developer
		
		horasExtraIaDev = HORAEXTRAIADEV * horas3;
		porcentaje3 = (porcentaje3 /100) * mitadSalarioIaDev;
		dineroAntiguedad3 = (viejo3 / 3)* dineroAntiguedad3;
		nominaIaDev = (IADEV + horasExtraIaDev + porcentaje3 + dineroAntiguedad3);
		
		
		System.out.println("Cálculo del QA Tester");
		System.out.print("Introduzca las horas extras realizadas: ");
		int horas4 = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzca la antigüedad: ");
		int viejo4 = Integer.parseInt(sc.nextLine());
		System.out.print("Objetivos (en porcentaje): ");
		double porcentaje4 = Double.parseDouble(sc.nextLine());
		
		// Calculos del QA Tester
		
		horasExtraQaTester = HORAEXTRAQATESTER * horas4;
		porcentaje4 = (porcentaje4 /100) * mitadSalarioQaTest;
		dineroAntiguedad4 = (viejo4 / 3)* dineroAntiguedad4;
		nominaQaTest = (QATESTER + horasExtraQaTester + porcentaje4 + dineroAntiguedad4);
		
		//Calculo IRPF
		
		nominaSenior = nominaSenior-(nominaSenior * IRPF);
		nominaJunior = nominaJunior-(nominaJunior * IRPF);
		nominaIaDev = nominaIaDev-(nominaIaDev * IRPF);
		nominaQaTest = nominaQaTest-(nominaQaTest * IRPF);
	
		
		// Resultados

		System.out.println("El Senior Developer cobra: " + nominaSenior);
		System.out.println("El Junior Developer cobra: " + nominaJunior);
		System.out.println("El IA Developer cobra: " + nominaIaDev);
		System.out.println("El QA Tester cobra: " + nominaQaTest);
		

		sc.close();
	}

}

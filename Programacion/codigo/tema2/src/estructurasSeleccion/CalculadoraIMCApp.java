package estructurasSeleccion;

import java.util.Scanner;

public class CalculadoraIMCApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double kilos;
		double altura;
		double imc;
		
		System.out.println("PROGRAMA DE CÁLCULO DE ÍNDICE DE MASA CORPORAL");
		System.out.print("Introduzca su peso (en kg): ");
		kilos = Double.parseDouble(sc.nextLine());
		System.out.print("Introduzca su altura (en metros): ");
		altura = Double.parseDouble(sc.nextLine());
		
		imc = kilos/(altura*altura);
		
		if(imc < 16) {
			System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Infrapeso en hospital por infrapeso");
		}else
			if(imc > 16 && imc < 17) {
				System.out.println("Su IMC es de " + imc + ",con un diagnóstico de Infrapeso ");
			}else
				if(imc > 17 && imc < 18) {
					System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Bajo peso");
				}else
					if(imc > 18 && imc < 25) {
						System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Peso normal(saludable)");
					}else
						if(imc > 25 && imc < 30){
							System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Sobrepeso (obsesidad de grado I)");
						}else
							if(imc > 30 && imc < 35) {
								System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Sobrepeso crónico (obesidad de grado II)");
							}else
								if(imc >= 35 && imc <= 40) {
									System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Obesidad premórbida (obesidad de grado III)");
								}else
									if(imc > 40 ) {
										System.out.println("Su IMC es de " + imc + ", con un diagnóstico de Obesidad mórbida (obesidad de grado IV)");
									}
		sc.close();
	}

}

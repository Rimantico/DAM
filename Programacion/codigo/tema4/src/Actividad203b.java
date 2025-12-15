import java.util.Scanner;

public class Actividad203b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer número");
		double real1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el segundo número");
		double imag1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el primer número");
		double real2 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el segundo número");
		double imag2 = Double.parseDouble(sc.nextLine());

		Complejo num1 = new Complejo(real1, imag1);
		Complejo num2 = new Complejo(real2, imag2);

		// Operaciones con los números

		Complejo sum = num1.sumar(num2);
		Complejo res = num1.restar(num2);
		Complejo mult = num1.multiplicar(num2);
		Complejo div = num1.dividir(num2);

		// Resulta

		System.out.println("El resultado de la suma es");
		System.out.println(sum.getParteReal()+sum.getParteImaginaria());
		System.out.println("El resultado de la resta es");
		System.out.println(res.getParteReal()+res.getParteImaginaria());
		System.out.println("El resultado de la multiplicación es");
		System.out.println(mult.getParteReal()+mult.getParteImaginaria());
		System.out.println("El resultado de la división es");
		System.out.println(div.getParteReal()+div.getParteImaginaria());

		sc.close();
	}

}

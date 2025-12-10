import java.util.Scanner;

public class Actividad203b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		double numero1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el segundo número");
		double numero2 = Double.parseDouble(sc.nextLine());
		
		Complejo num1 = new Complejo(numero1 , numero2);
		Complejo num2 = new Complejo(numero2 , numero1);
		
		//Operaciones con los números
		
		System.out.println("El resultado de la suma es");
		System.out.println(num1.sumar(num2));
		System.out.println("El resultado de la resta es");
		System.out.println(num1.restar(num2));
		System.out.println("El resultado de la multiplicación es");
		System.out.println(num1.multiplicar(num2));
		System.out.println("El resultado de la división es");
		System.out.println(num1.dividir(num2));
			
		
		sc.close();
	}

}

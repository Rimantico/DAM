import java.util.Scanner;

public class NavajaSuizaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la primera cadena");
		String cadena1 = sc.nextLine();
		System.out.println("Dime la segunda cadena");
		String cadena2 = sc.nextLine();

		// Longitud de las cadenas

		System.out.println("La longitud de la cadena 1 es de");
		System.out.println(cadena1.length());

		System.out.println("La longitud de la cadena 2 es de ");
		System.out.println(cadena2.length());

		// Concatenación

		System.out.println(cadena1.concat(cadena2));

		// ¿Son iguales?

		System.out.println("Son iguales las cadenas");
		System.out.println(cadena1.equals(cadena2));

		// ¿Son iguales v2?

		System.out.println("¿Son iguales v2?");
		if (cadena1.equals(cadena2)) {
			System.out.println("1");
		} else
			System.out.println("0");

		// Contiene la primera cadena a la segunda

		System.out.println("¿Contiene la primera cadena a la segunda?");
		System.out.println(cadena1.contains(cadena2));

		// Comienzan las primera cadena por la segunda

		System.out.println("¿Contiene la primera cadena por la segunda?");
		System.out.println(cadena1.startsWith(cadena2));

		// Termina la primera cadena por la segunda

		System.out.println("¿Termina la primera cadena por la segunda?");
		System.out.println(cadena1.endsWith(cadena2));

		// Primer caracter y ultimo de la primera cadena

		System.out.println("Dime el primer caracter de la primera cadena");
		System.out.println(cadena1.charAt(0));
		System.out.println("Dime el utlimo caracter de la primera cadena");
		System.out.println(cadena1.substring(cadena1.length() - 1));

		// Quita el primer caracter de la cadena
		
		System.out.println("Toda la primera cadena menos el primer caracter");
		System.out.println(cadena1.substring(1));
		
		//Primera cadena con todas las letras en minuscula y en mayuscula
		
		System.out.println("Todas las letras en minusculas y en mayusculas");
		System.out.println(cadena1.toUpperCase());
		System.out.println(cadena1.toLowerCase());

		sc.close();
	}

}

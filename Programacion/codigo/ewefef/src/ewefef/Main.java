package ewefef;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


import clases.Coche;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos coches quieres introducir?");
		int cochesIntroducir = Integer.parseInt(sc.nextLine());
		
		List<Coche> listaCoches = new ArrayList<>();
		
		for(int i = 1 ; i<= cochesIntroducir ; i++) {
			System.out.println("Dime la matricula: ");
			String matricula = sc.nextLine();
			System.out.println("Dime la marca: ");
			String marca = sc.nextLine();
			System.out.println("Dime el numero de serie");
			String numeroSerie = sc.nextLine();
			System.out.println("Dime el conductor");
			String conductor = sc.nextLine();
			System.out.println("Dime el año en que se compro");
			int anoComprado = Integer.parseInt(sc.nextLine());
			
			Coche coche = new Coche(matricula , marca, numeroSerie, conductor,anoComprado);
			
			listaCoches.add(coche);
			
		}

		sc.close();
		
		System.out.println("Coches Introducidos");
		for(Coche c : listaCoches)
			System.out.println(c);
	}

}


public class Ejercicio202_1 {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();

		// Persona 1 atributos

		persona1.edad = 25;
		persona1.numeroHijos = 0;
		persona1.peso = 75.4;

		// Persona 2 atributos

		persona2.edad = 65;
		persona2.numeroHijos = 3;
		persona2.peso = 65;

		// Resultados por pantalla

		System.out.println("---- Persona 1 ----");
		System.out.println(persona1.edad);
		System.out.println(persona1.numeroHijos);
		System.out.println(persona1.peso);

		System.out.println("---- Persona 2 ----");
		System.out.println(persona2.edad);
		System.out.println(persona2.numeroHijos);
		System.out.println(persona2.peso);

	}

}

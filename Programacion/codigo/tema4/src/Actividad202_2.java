
public class Actividad202_2 {

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

		System.out.println("¿Apuntan al mismo objeto?");
		System.out.println(persona1 == persona2);

		/*
		 * En este caso no apuntan al mismo objeto porque por ejemplo la persona 2 no es
		 * igual a persona 1 por lo tanto los dos no apuntan al mismo objeto y por lo
		 * tanto sale false. En el caso de que si apuntara saldría true
		 */

	}

}

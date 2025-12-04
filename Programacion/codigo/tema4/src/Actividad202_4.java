
public class Actividad202_4 {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = persona1;

		persona1.edad = 33;
		persona1.numeroHijos = 1;
		persona1.peso = 80.43;

		persona2.peso = 79.65;

		// Informacion
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
		 * En este caso nos dara true porque persona2 esta apuntando a persona1 y por lo
		 * tanto nos dará true
		 */
	}

}

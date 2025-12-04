
public class Actividad202_3 {

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

		/*
		 * El peso de la persona 1 se ha cambiado por el peso que le he asignado a la
		 * persona 2. Creo que esto se debe a que como persona 2 hace referencia a la
		 * primera al asignarle el nuevo valor se ha cambiado en los dos objetos
		 */

	}

}

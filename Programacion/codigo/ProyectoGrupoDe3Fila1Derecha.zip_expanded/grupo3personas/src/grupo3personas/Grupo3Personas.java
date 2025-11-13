package grupo3personas;

public class Grupo3Personas {

	public static void main(String[] args) {
		
		//Variables
		
		String[] personas = {"Benjamin Agüera","Helena Berzosa","Javi Callero","Jorge Campos","Manuel Castillo","Mohamed","Samuel Espejo","Naia Fernández","Juan Andrés","Raul Gómez","Juan Gómez","Lucas González","David Liñán","Alejandro López","Ramon Marin","José Miguel","Raúl Mena","Franco Mingrone","Anahí Molina","Javier Montiel","David Morales","Hugo Pérez","Daniel Ramírez","Álvaro Rodríguez","David Rollán","Francisco Ruiz","Antonio Ruiz","Pablo Sánchez","Amel Selselet","Christian Torres"};
		int[] numeroPersonas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int[] comprobar = new int[30];
		int valor ;
		
		//Programa Principal
		
		System.out.println("Grupo de  3 personas Hecho por: Juan Gómez  , Helena Berzosa, Jorge Campos y Naia Fernandez  ");
		for(int i = 0 ; i<10 ; i++) {
			System.out.println("Grupo " + (i+1));
			for(int j = 0 ; j< 3; j++ ) {
	                do {
	                    valor = (int)(Math.random() * 30);
	                } while (comprobar[valor] == 1);
	                comprobar[valor] = 1; 
				System.out.println(numeroPersonas[valor] + "-" + personas[valor]);
			}
		}
	}
}
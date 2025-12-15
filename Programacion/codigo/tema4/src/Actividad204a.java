import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;

public class Actividad204a {

	public static void main(String[] args) {

		// Objetos de Gran Hermano

		GranHermano Juan = new GranHermano(18);
		GranHermano Salva = new GranHermano(21);
		GranHermano Julio = new GranHermano(14);
		
		//Numero de objeto
		
		System.out.println("Numero de objetos creados");
		System.out.println(GranHermano.getNumeroObjetosCreados());


	}

}

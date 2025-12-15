package examen;

import restaurante.Restaurante;

public class Main {

	public static void main(String[] args) {
		// Hecho con el primer constructor
		Restaurante restaurante1 = new Restaurante("Juan", "En la esquina", "Pedrera", 20, 5.45, 7);
		// Hecho con el segundo constructor
		Restaurante restaurante2 = new Restaurante("Antonio", "En la otra esquina", 20);
		// Hecho con el tercer constructor
		Restaurante restaurante3 = new Restaurante("Fran", "Enfrente", "Gilena", 50, 10, 7);

		// Restaurante 1
		System.out.println("1º Restaurante");
		restaurante1.visualizaRestaurante();
		restaurante1.reservar(45);
		restaurante1.reservar(15);
		restaurante1.cancelarReserva(20);

		// Asi comprobaré que al quitar todas las reservas del restaurante siempre sea
		// igual a la cantidad inicial del restaurante

		System.out.println(restaurante1.getCapacidadActual());
		restaurante1.totalRestaurantes();

		// Restaurante 2
		System.out.println("2º Restaruante");
		restaurante2.visualizaRestaurante();
		restaurante2.reservar(10);
		restaurante2.cancelarReserva(5);
		restaurante2.totalRestaurantes();
		// Restaurante 3
		System.out.println("3º Restaurante");
		restaurante3.visualizaRestaurante();
		restaurante3.reservar(10);
		restaurante3.cancelarReserva(5);
		restaurante3.totalRestaurantes();
	}

}

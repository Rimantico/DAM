package restaurante;

public class Restaurante {

	// Atributos de la clase

	public static int totalRestaurantes = 0;

	// Atributos

	private String nombre;
	private String direccion;
	private String localidad;
	private int capacidad;
	private int capacidadActual = capacidad;
	private double precioMedio;
	private double puntuacion;

	// Constructores

	public Restaurante(String nombre, String direccion, String localidad, int capacidad, double precioMedio,
			double puntuacion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.capacidad = capacidad;
		this.precioMedio = precioMedio;
		this.puntuacion = puntuacion;
		totalRestaurantes++;
	}

	public Restaurante(String nombre, String direccion, int capacidad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		totalRestaurantes++;

	}

	// Getter y Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecioMedio() {
		return precioMedio;
	}

	public void setPrecioMedio(double precioMedio) {
		this.precioMedio = precioMedio;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	// Métodos creados

	// Metodo para mostrar todos los campos de los restaurantes
	public void visualizaRestaurante() {
		System.out.println("Nombre del restaurante: " + nombre);
		System.out.println("Dirección del restaurante: " + direccion);
		System.out.println("Localidad del restaurante: " + localidad);
		System.out.println("Capacidad del restaurante: " + capacidad);
		System.out.println("Precio medio del menú: " + precioMedio);
		System.out.println("Puntuación del cliente: " + puntuacion);

	}

	// Sirve para reservar sitio en los restaurantes que creemos

	public void reservar(int numeroReserva) {
		if (numeroReserva > capacidad || numeroReserva <= 0) {
			System.out.println("Introduzca un numero válido para la reserva");
		} else {
			capacidadActual = capacidad - numeroReserva;
			System.out.println("Reserva realizada correctamente");
		}
	}

	// Aparte de asegurarme de que no cancele un número negativo o 0, tambien me
	// ocupo de que si mete un numero válido, es decir positivo, no sea mayor al
	// número de plazas que hay en dicho restaurante

	public void cancelarReserva(int numeroReserva) {
		if (numeroReserva <= 0) {
			System.out.println("Introduzca un número válido");
		}
		if (numeroReserva > capacidad) {
			System.out.println("No puedes cancelar plazas que no existen en le restaurante");
		} else {
			capacidadActual = numeroReserva + capacidadActual;
			if (capacidadActual > capacidad)
				for (int i = capacidadActual; i >= capacidad; i--)
					capacidadActual = i;
			System.out.println("Reserva cancelada correctamente");
		}

	}

	// Mostrar el total de objetos de la clase
	public void totalRestaurantes() {
		System.out.println("Tenemos un total de " + totalRestaurantes);
	}
}

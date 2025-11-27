package clases;

public class Coche {

	// Atributos
	private String matricula;
	private String marca;
	private String numeroSerie;
	private String conductor;
	private int anoComprado;

	// Constructor
	public Coche(String matricula, String marca, String numeroSerie, String conductor, int anoComprado) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.numeroSerie = numeroSerie;
		this.conductor = conductor;
		this.anoComprado = anoComprado;
	}
	// Getters y Setters

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public int getAnoComprado() {
		return anoComprado;
	}

	public void setAnoComprado(int anoComprado) {
		this.anoComprado = anoComprado;
	}
	@Override
	public String toString() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Numero de Serie: " + numeroSerie);
		System.out.println("Conductor: " + conductor);
		System.out.println("Año Comprado: " + anoComprado);
		return super.toString();
	}

}

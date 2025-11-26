package clases;

public class Peliculas {
	
	private String genero;
	private String actores;
	private String personajePrincipal;
	private String Director;
	private String trama;
	private int anoSalida;

	//Constructors
	
	public Peliculas(String genero, String actores, String personajePrincipal, String director, String trama,
			int anoSalida) {
		super();
		this.genero = genero;
		this.actores = actores;
		this.personajePrincipal = personajePrincipal;
		Director = director;
		this.trama = trama;
		this.anoSalida = anoSalida;
	}
	//Getters y Setters

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public String getPersonajePrincipal() {
		return personajePrincipal;
	}

	public void setPersonajePrincipal(String personajePrincipal) {
		this.personajePrincipal = personajePrincipal;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public int getAnoSalida() {
		return anoSalida;
	}

	public void setAnoSalida(int anoSalida) {
		this.anoSalida = anoSalida;
	}
	
	

}

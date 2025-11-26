package clases;

public class JuegoOrdenador {
	private String genero;
	private String protagonista;
	private String modelado;
	private String colores;
	private String musica;
	private String plataformaDeSalida;
	private int anoSalida;

	// Constructor

	public JuegoOrdenador(String genero, String protagonista, String modelado, String colores, String musica,
			String plataformaDeSalida, int anoSalida) {
		super();
		this.genero = genero;
		this.protagonista = protagonista;
		this.modelado = modelado;
		this.colores = colores;
		this.musica = musica;
		this.plataformaDeSalida = plataformaDeSalida;
		this.anoSalida = anoSalida;
	}
	//Getters y Setters

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProtagonista() {
		return protagonista;
	}

	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}

	public String getModelado() {
		return modelado;
	}

	public void setModelado(String modelado) {
		this.modelado = modelado;
	}

	public String getColores() {
		return colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getPlataformaDeSalida() {
		return plataformaDeSalida;
	}

	public void setPlataformaDeSalida(String plataformaDeSalida) {
		this.plataformaDeSalida = plataformaDeSalida;
	}

	public int getAnoSalida() {
		return anoSalida;
	}

	public void setAnoSalida(int anoSalida) {
		this.anoSalida = anoSalida;
	}
	
	

}

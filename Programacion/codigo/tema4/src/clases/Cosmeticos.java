package clases;

public class Cosmeticos {

	private String higiene;
	private String limpiador;
	private String pelo;
	private String funcion;
	private String nivelUso;
	private String zonaAplicacion;
	private String composicion;
	private String presentacion;

	// Constructores

	public Cosmeticos(String higiene, String limpiador, String pelo, String funcion, String nivelUso,
			String zonaAplicacion, String composicion, String presentacion) {
		super();
		this.higiene = higiene;
		this.limpiador = limpiador;
		this.pelo = pelo;
		this.funcion = funcion;
		this.nivelUso = nivelUso;
		this.zonaAplicacion = zonaAplicacion;
		this.composicion = composicion;
		this.presentacion = presentacion;
	}

	// Getters y Setters

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}

	public String getLimpiador() {
		return limpiador;
	}

	public void setLimpiador(String limpiador) {
		this.limpiador = limpiador;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String getNivelUso() {
		return nivelUso;
	}

	public void setNivelUso(String nivelUso) {
		this.nivelUso = nivelUso;
	}

	public String getZonaAplicacion() {
		return zonaAplicacion;
	}

	public void setZonaAplicacion(String zonaAplicacion) {
		this.zonaAplicacion = zonaAplicacion;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

}

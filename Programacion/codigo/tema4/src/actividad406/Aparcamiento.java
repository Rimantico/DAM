package actividad406;

public class Aparcamiento {
	public static int numeroAparcamientos = 100;
	
	
	private String matricula;
	private String dniConductor;
	
	public Aparcamiento(String matricula , String dniConductor) {
		this.matricula = matricula;
		this.dniConductor = dniConductor;
		numeroAparcamientos--;
	}
	/**
	 * @return the numeroAparcamientos
	 */
	public static int getNumeroAparcamientos() {
		return numeroAparcamientos;
	}
	/**
	 * @param numeroAparcamientos the numeroAparcamientos to set
	 */
	public static void setNumeroAparcamientos(int numeroAparcamientos) {
		Aparcamiento.numeroAparcamientos = numeroAparcamientos;
	}
	public void salidaVehiculo(){
		numeroAparcamientos++;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the dniConductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}
	/**
	 * @param dniConductor the dniConductor to set
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	
}

package actividad406;

public class Cliente {
	
	public static int numeroCliente = 0;
	
	// Atributos
	private String nombre;
	private String razonSocial;
	private String cif;
	private int tlfn;
	private String correo;
	private String personaContacto;
	
	public Cliente(String nombre , String razonSocial, String cif , int tlfn) {
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.cif = cif;
		this.tlfn = tlfn;
		numeroCliente++;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return the tlfn
	 */
	public int getTlfn() {
		return tlfn;
	}

	/**
	 * @param tlfn the tlfn to set
	 */
	public void setTlfn(int tlfn) {
		this.tlfn = tlfn;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the personaContacto
	 */
	public String getPersonaContacto() {
		return personaContacto;
	}

	/**
	 * @param personaContacto the personaContacto to set
	 */
	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	@Override
	public String toString() {
		System.out.println("Numero de Clientes" + numeroCliente);
		System.out.println("Nombre: " + nombre);
		System.out.println("Razon social: " + razonSocial);
		System.out.println("CIF: " + cif);
		System.out.println("Teléfono: " + tlfn);
		System.out.println("Correo: " + correo);
		System.out.println("PersonaContacto: " + personaContacto);
		return super.toString();
	}
	
}

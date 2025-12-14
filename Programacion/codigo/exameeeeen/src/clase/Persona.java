package clase;

public class Persona {
	
	public static  int numeroPersonas = 0;
	
	private String dni;
	private String nombre;
	private int edad;
	private String lugarNacimiento;
	private int[] notas;
	
	/**
	 * Constructor
	 * @param dni
	 * @param nombre
	 * @param edad
	 * @param lugarNacimiento
	 */
	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		numeroPersonas = incrementar(numeroPersonas);
	}
	public Persona() {
		
	}
	
	/**
	 * Aumentar Numero de personas
	 * @param numero
	 * @return
	 */

	public int incrementar(int numero){
		numero++;
		return numero;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the lugarNacimiento
	 */
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	/**
	 * @param lugarNacimiento the lugarNacimiento to set
	 */
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	
	@Override
	public String toString() {
		System.out.println("El  DNI es " + dni);
		System.out.println("El nombre es " + nombre);
		System.out.println("La edad es " + edad);
		System.out.println("El lugar de nacimiento es " + lugarNacimiento);
		return super.toString();
	}
	
	
	
	

}

package sobrecargaConstructores;

public class Persona {
	private int idPersona;
	private String nombre;
	private int edad;
	private static int contadorPersona;

	private Persona() {
		this.idPersona = ++contadorPersona;
	}

	public Persona(String nombre, int edad) {
		this(); //llamar a un constructor privado en la misma clase
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}

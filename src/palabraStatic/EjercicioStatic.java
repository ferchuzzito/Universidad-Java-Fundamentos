package palabraStatic;

public class EjercicioStatic {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan");
		System.out.println(persona1);
		Persona persona2 = new Persona("Karla");
		System.out.println(persona2);
		System.out.println("Contador Personas: " + Persona.getContadorPersonas());
	}

}

class Persona {
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;

	public Persona(String nombre) {
		this.setIdPersona(contadorPersonas++);
		this.setNombre(nombre);
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return this.idPersona;
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
		return this.nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the contadorPersonas
	 */
	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public String toString() {
		return "idPersona: " + idPersona + " nombre: " + nombre;
	}
}

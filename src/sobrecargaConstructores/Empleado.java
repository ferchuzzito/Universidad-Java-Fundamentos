package sobrecargaConstructores;

public class Empleado extends Persona {
	private double sueldo;

	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad); //llamar a un constructor heredado
		this.sueldo = sueldo;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() +"Empleado [sueldo=" + sueldo + "]";
	}
}

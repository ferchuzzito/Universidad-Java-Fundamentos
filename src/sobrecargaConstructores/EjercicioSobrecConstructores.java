package sobrecargaConstructores;

public class EjercicioSobrecConstructores {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Lilia", 22);
		System.out.println(persona1);
		Empleado empleado1 = new Empleado("Pedro", 33, 18000);
		System.out.println(empleado1);
	}

}

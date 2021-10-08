package encapsulamiento;

public class EjercicioEncapsulamiento {

	public static void main(String[] args) {
		Persona persona1 = new Persona("juan","perez",true);
		System.out.println(persona1.getNombre());
		System.out.println(persona1);
		persona1.setNombre("Carlos");
		System.out.println(persona1.getNombre());
		System.out.println(persona1);
	}
}

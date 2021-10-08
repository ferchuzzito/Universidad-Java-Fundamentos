package palabraNull;

public class EjercicioPalabraNull {

	public static void main(String[] args) {
		Persona persona1 = new Persona("juan");
		System.out.println("persona 1: " + persona1.obtenernombre());
		Persona persona2 = persona1;
		System.out.println("persona 2: " + persona2.obtenernombre());
		persona1 = null;
		System.out.println("persona 1: " + persona1);
	}

}
class Persona{
	String nombre;
Persona(String nombre){
this.nombre = nombre;
}
public String obtenernombre() {
	return this.nombre;
}
}

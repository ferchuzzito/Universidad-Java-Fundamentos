package ClasesyObjetos;

public class EjercicioPersona {

	public static void main(String[] args) {
	//creacion de un objeto
		Persona persona1 = new Persona();
	//llamando a un metodo del objeto creado
		System.out.println("valores del objeto persona: ");
		persona1.desplegarNombre();
	//modificar valores del objeto
		persona1.nombre = "Elena";
		persona1.apellidoPaterno = "perez";
		persona1.apellidoMaterno = "orlando";
		//llamando al metodo del objeto creado
		System.out.println("valores modificados del objeto persona: ");
		persona1.desplegarNombre();
	}

}

package palabraFinal;

public class EjercicioPalabraFinal {

	public static void main(String[] args) {
		// modificar un atributo final no es posible
		// ClaseFinal.VAR_PRIMITIVO = 10;
		// modificar la referencia de un atributo final de tipo object no es posible
		// ClaseFinal.VAR_PRIMITIVO = new Persona();
		//
		ClaseFinal.VAR_PERSONA.setNombre("juan");
		System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
		ClaseFinal.VAR_PERSONA.setNombre("carlos");
		System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
	}

}

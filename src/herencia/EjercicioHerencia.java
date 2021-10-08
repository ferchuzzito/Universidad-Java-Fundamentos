package herencia;

import java.util.Date;

public class EjercicioHerencia {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("juan", 25000);
		empleado1.setEdad(28);
		empleado1.setGenero('M');
		empleado1.setDireccion("Lomas #13");
		System.out.println("empleado: " + empleado1);
		Cliente cliente1 = new Cliente(new Date(), true);
		cliente1.setNombre("karla");
		cliente1.setEdad(25);
		cliente1.setGenero('F');
		cliente1.setDireccion("pinos #14");
		System.out.println("cliente: " + cliente1);
	}

}

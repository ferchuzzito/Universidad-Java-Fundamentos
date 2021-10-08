package Variables;

import java.util.Scanner;

public class EjercicioLibro {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce el titulo del libro:");
		var titulo = scanner.nextLine();
		System.out.println("introduce el nombre del autor:");
		var autor = scanner.nextLine();
		System.out.println(titulo + " fue escrito por " + autor);
	}

}

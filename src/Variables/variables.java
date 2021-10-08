package Variables;

import java.util.Scanner;

public class variables {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Manejo de Cadenas(strings)
		String saludo = "Hola Mundo"; //declaracion de una variable de tipo string
		var despedida = "Adios."; //declaracion de una variable tipo string(solo en j11)
		System.out.println(saludo);
		System.out.println(despedida);
		
		//concatenacion de variables
		var usuario = "Juan";
		var saludar = "Hola";
		//usando el simbolo + se concatenan las variables
		System.out.println(saludar +" "+ usuario);
		System.out.println(saludar + " mi nombre es " + usuario);
		//introducir datos desde teclado con la clase scanner de java
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cual es tu nombre? ");
		var usuario1 = scanner.nextLine();
		System.out.println(saludar +" "+ usuario1);
	}

}

package arreglos;

public class EjemploArreglos {

	public static void main(String[] args) {
		// 1.- declaracion de un arreglo
		int edades[];
		// 2.- instanciar el arreglo
		edades = new int[3];
		// 3.- inicializamos los valores del arreglo
		edades[0] = 30;
		edades[1] = 15;
		edades[2] = 20;
		// 4.- leemos cada valor del arreglo
		System.out.println("arreglo indice 0: " + edades[0]);
		System.out.println("arreglo indice 1: " + edades[1]);
		System.out.println("arreglo indice 2: " + edades[2]);
		
		// 1.- declarar un arreglo de tipo object
		Persona personas[];
		// 2.- instanciar el arreglo de tipo object
		personas = new Persona[4];
		// 3.- inicializamos los valores del arreglo
		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Alberto");
		personas[2] = new Persona("Karla");
		personas[3] = new Persona("Jazmin");
		// 4.- imprimir valores
		System.out.println("Arreglo Personas Indice 0 " + personas[0]);
		System.out.println("Arreglo Personas Indice 1 " + personas[1]);
		System.out.println("Arreglo Personas Indice 2 " + personas[2]);
		System.out.println("Arreglo Personas Indice 3 " + personas[3]);
		
		// arreglo simplificado
		String nombres[] = {"Juan", "Sara", "Alberto", "Karla"};
		for(int i=0; i < nombres.length; i++) {
			System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
		}
	}

}

package matrices;

public class EjercicioMatrices {

	public static void main(String[] args) {
		// declarar una matriz de tipo INT
		int edades[][];
		edades = new int[3][2];
		edades[0][0] = 30;
		edades[0][1] = 15;
		edades[1][0] = 20;
		edades[1][1] = 45;
		edades[2][0] = 5;
		edades[2][1] = 38;
		System.out.println("Matriz Edades Indice 0-0 " + edades[0][0]);
		System.out.println("Matriz Edades Indice 0-1 " + edades[0][1]);
		System.out.println("Matriz Edades Indice 1-0 " + edades[1][0]);
		System.out.println("Matriz Edades Indice 1-1 " + edades[1][1]);
		System.out.println("Matriz Edades Indice 2-0 " + edades[2][0]);
		System.out.println("Matriz Edades Indice 2-1 " + edades[2][1]);
		System.out.println();

		// declarar una matriz de tipo Object
		Persona personas[][] = new Persona[1][2];
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Carlos");
		System.out.println("Matriz Personas Indice 0-0 " + personas[0][0]);
		System.out.println("Matriz Personas Indice 0-1 " + personas[0][1]);
		System.out.println();

		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[i].length; j++) {
				System.out.println("Matriz Personas Indice " + i + "-" + j + ":" + personas[i][j]);
			}

		}
	}

}

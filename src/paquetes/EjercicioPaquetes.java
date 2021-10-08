package paquetes;

import static paquetes.com.gm.utileria.imprimir;

import paquetes.com.gm.utileria;

public class EjercicioPaquetes {

	public static void main(String[] args) {
		// forma 1
		utileria.imprimir("Hola Mundo");
		// forma 2
		paquetes.com.gm.utileria.imprimir("hola Mundo2");
		// forma 3. import static
		imprimir("hola mundo3");
	}

}

package TiposPrimitivos;

import java.util.Scanner;

public class ConversionTipos {

	public static void main(String[] args) {
		var edad = Integer.parseInt("20");
		System.out.println(edad);
		var valorPi = Double.parseDouble("3.14");
		System.out.println(valorPi);
		char c = "hola".charAt(0);
		System.out.println(c);
		
		var scanner = new Scanner(System.in);
		int edad2 = Integer.parseInt(scanner.nextLine());
		System.out.println("Edad: " + edad2);
		char caracter = scanner.nextLine().charAt(0);
		System.out.println("Caracter: " + caracter);
		String ValorPiTexto = String.valueOf(valorPi);
		System.out.println("ValorPi: " + ValorPiTexto);
		scanner.close();
	}

}

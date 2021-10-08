package Operadores;

import java.util.Scanner;

public class EjercicioMayordosNumeros {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numero1 = Integer.parseInt(scanner.nextLine());
        var numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println(numero1 > numero2 ? numero1 : numero2);
        scanner.close();
	}

}

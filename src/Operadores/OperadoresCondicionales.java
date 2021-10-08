package Operadores;

public class OperadoresCondicionales {

	public static void main(String[] args) {
		var a = 11;
		var valorMinimo = 0;
		var valorMaximo = 10;
		//Operador AND, verifica si ambos son verdaderos.
		boolean and = a >= valorMinimo && a <= valorMaximo;
		System.out.println("valor: "+a+ " valorMinimo: "+valorMinimo+ " valorMaximo: "+valorMaximo+" And: " +and);
		//Operador OR, verifica si uno de los valores es verdadedo entonces es verdadero.
		var vacaciones = true;
		var diadescanso = false;
		boolean or = vacaciones || diadescanso;
		System.out.println("valor 1: " +vacaciones+" Valor 2: "+diadescanso+" Or: " +or);
	}

}

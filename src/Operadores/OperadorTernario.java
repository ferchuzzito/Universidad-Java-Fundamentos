package Operadores;

public class OperadorTernario {

	public static void main(String[] args) {
		var numero = 10;
		//el operador ? evalua y dara un resultado : si es verdadero o falso
		var resultado =(numero % 2 == 0) ? "es par" : "no es par";
		System.out.println(numero +" "+ resultado);
	}

}

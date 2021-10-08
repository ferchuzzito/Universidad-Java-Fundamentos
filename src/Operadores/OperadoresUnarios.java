package Operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		var a = 3;
		//invierte el valor de la variable a negativo.
		var b = -a;
		System.out.println("valor: " +a);
		System.out.println("valor cambiado: " +b);
		var c = true;
		//invierte el valor de la variable a false.
		var d = !c;
		System.out.println("valor: " +c);
		System.out.println("valor cambiado: " +d);
		var e = 3;
		var h = 4;
		System.out.println("valor E: " +e);
		System.out.println("valor H: " +h);
		/*
		 * se inserta el valor de la variable a la variable y en la siguiente ocurrencia
		 * se incrementara el valor de la variable y se almacenara.
		*/
		var f = h++;
		System.out.println("valor Incremento H: " +f);
		/*
		 * se preincrementara el valor de la variable
		 * y sera almacnada hasta la siguiente ocurrencia.
		 * 
		*/
		var g = ++e;
		System.out.println("valor Preincremento E: " +g);
		var i = h--;
		System.out.println("valor Decremento H: " +i);
		var j = --e;
		System.out.println("valor Predrecremento E: " +j);
		
	}

}

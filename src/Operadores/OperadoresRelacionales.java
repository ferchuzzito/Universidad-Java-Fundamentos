package Operadores;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		var a = 3;
		var b = 2;
		//operador de igualdad
		var c = a == b;
		System.out.println("a es igual a b: "+c);
		//operador de desigualdad
		var d = a != b;
		System.out.println("a no es igual a b: "+d);
		//igualdad con cadenas String
		var e = "hola";
		var f = "hola";
		var g = e.equals(f);
		System.out.println("e es igual a f: "+g);
		//operador relacional
		var h =(a > b);
		System.out.println("a es mayor que b: "+ h);
		var i =(a < b);
		System.out.println("a es menor que b: "+ i);
		var j =(a >= b);
		System.out.println("a es mayor o igual que b: "+ j);
		var k =(a <= b);
		System.out.println("a es menor o igual que b: "+ k);
		var l =(a != b);
		System.out.println("a no es igual que b: "+ l);
	}

}

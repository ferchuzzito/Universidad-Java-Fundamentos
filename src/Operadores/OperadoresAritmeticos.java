package Operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int a=3, b=2;
		int c = a+b;
		System.out.println(c); //resultado almacenado en una variable
		System.out.println(a+b); //suma directa
		//si lleva una cadena de texto antes al concatenareste se vuelve texto
		//por ello se debe de poner dentro de parentesis
		System.out.println("Resultado: " + a+b);
		System.out.println("Resultado suma: " + (a+b));
		//esto no ocurre de esta forma ya que primero se realiza la operacion
		System.out.println(a+b + " Resultado");
		int d = a - b;
		System.out.println(d);
		System.out.println("Resultado resta: " + (a-b));
		int e = a*b;
		System.out.println(e);
		System.out.println("Resultado MultiPlicacion: " + (a*b));
		int f = a/b;
		System.out.println(f);
		System.out.println("Resultado Division: " + (a/b));
		int g = a%b;
		System.out.println(g);
		System.out.println("Resultado residuo: " + (a%b));
		
	}

}

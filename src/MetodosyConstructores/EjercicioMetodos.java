package MetodosyConstructores;

public class EjercicioMetodos {

	public static void main(String[] args) {
		//variables locales
		int operandoA = 6;
		int operandoB = 6;
		//objeto de la clase aritmetica con variables locales
		Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
		System.out.println("Valor operandoA: "+operandoA);
		System.out.println("Valor operandoB: "+operandoB);
		System.out.println("Resultado Suma: "+ objeto1.sumar());
		System.out.println("Resultado Resta: "+ objeto1.restar());
		System.out.println("Resultado Division: "+ objeto1.dividir());
		System.out.println("Resultado Multiplicacion: "+ objeto1.multiplicar());
		System.out.println("\n");
		//creacion de un objeto de la clase aritmetica
		Aritmetica aritmetica = new Aritmetica();
		//llamada al metodo sumar con constructor
		aritmetica.a = 5;
		aritmetica.b = 3;
		int resultado = aritmetica.sumar();
		System.out.println("resultado del metodo: "+resultado);
		/*llamada al metodo  sumar y recibimos el valor devuelto
		int resultado = aritmetica.sumar(10, 20);
		System.out.println("resultado del metodo: "+resultado);*/
		
		Aritmetica aritmetica2 = new Aritmetica(2,4);
		int resultado2 = aritmetica2.sumar();
		System.out.println("resultado del metodo 2: "+resultado2);
	}

}

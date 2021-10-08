package MetodosyConstructores;

public class Aritmetica {
	//atributos de la clase
	int a;
	int b;
	//Constructor vacio
	Aritmetica(){	
	}
	//Constructor con argumentos
	Aritmetica(int a, int b){
		this.a = a;
		this.b = b;
	}
	//metodo que toma los atributos de la clase
	int sumar() {
		return a + b;
	}
	int restar() {
		return a - b;
	}
	int multiplicar() {
		return a * b;
	}
	int dividir() {
		return a / b;
	}
	/*metodo
	public int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}*/
}

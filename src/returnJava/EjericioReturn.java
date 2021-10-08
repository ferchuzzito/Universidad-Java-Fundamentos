package returnJava;

public class EjericioReturn {

	public static void main(String[] args) {
		var resultado = sumar(3,6);
		System.out.println("Resultado: " + resultado);
	}
	public static int sumar(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("ingrese un valor distinto a 0");
			return 0;
		}
		/*return regresa a la linea donde se inicializa el metodo
		y devuelve un valor de tipo int
		void no regresa ningun valor.*/
		return a + b;
	}
}

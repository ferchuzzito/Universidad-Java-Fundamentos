package pasoPorValoryPorReferencia;

public class EjercicioPasoporValor {

	public static void main(String[] args) {
		var x = 10;
		imprimir (x);
		cambiarValor(x);
		x = 15;
		imprimir(x);
	}
	
	public static void imprimir(int args) {
		System.out.println("args: "+ args);;
	}
	public static void cambiarValor(int i) {
		i=200;
	}

}

package TiposPrimitivos;

public class Char {

	public static void main(String[] args) {
		//Variable de tipo Char
		System.out.println("bits de tipo Char: " + Character.BYTES);
		System.out.println("bytes de tipo Char: " + Character.BYTES);
		System.out.println("valor minimo de tipo Char: " + Character.MIN_VALUE);
		System.out.println("valor minimo de tipo Char: " + Character.MAX_VALUE);
		var c = '\u0021';
		char d = 33;
		var f = '!';
		System.out.println("caracter: "+ c + d + f);
	}

}

package Operadores;

public class PrecedenciaOperadores {

	public static void main(String[] args) {
		var x = 5;
		var y = 10;
		var z = ++x + y--;//x = 6, y=9
		System.out.println("x= "+x+" y= " +y+" z= "+z);
		System.out.println("Ejemplo de precedencia: ");
		var resultado = 4 + 5 * 6 / 3; //4+(5*6)/3 => 4+30/3 => 4+10 => 14
		System.out.println(resultado);
		resultado = (4+5) * (6/3);// 9 * 2 => 18
		System.out.println(resultado);
	}

}

package palabraThis;

public class EjercicioPalabraThis {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Persona persona = new Persona("juan");
	}
}
class Persona{
	String nombre;
	Persona(String nombre){
		this.nombre = nombre; //apunta a un objeto de tipo persona
		//imprimir el objeto persona
		Imprimir imprimir = new Imprimir();
		imprimir.imprimir(this); //this contiene una referencia al objeto persona
	 }
}
class Imprimir{
	public void imprimir(Persona p) {
		System.out.println("Impresion Argumento: " + p); //valor del objeto persona
		System.out.println("Impresion Objeto Actual: " + this); // this apunta a un objeto de tipo imprimir
	}
	
}


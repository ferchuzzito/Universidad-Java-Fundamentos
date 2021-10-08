package diseñoClases.ventas;

import diseñoClases.com.gm.ventas.*;

public class Ventas {

	public static void main(String[] args) {
		Producto producto1 = new Producto("camisa", 50);
		Producto producto2 = new Producto("pantalon", 100);
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();
	}

}

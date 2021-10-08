package labFinal.com.gm.mundopc;

public class Orden {

	// Declaracion del arreglo de computadoras
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
	// Definimos el maximo elementos del arreglo
    private static final int MAX_COMPUTADORAS = 10;

	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		// Se instancia el arreglo de computadoras
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}

	public void agregarComputadora(Computadora computadora	) {
		// Si las computadoras agregadas no superan al máximo de computadoras
		// agregamos la nueva computadora
		if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			// Agregamos la nueva computadora al arreglo
			// e incrementamos el contador de computadoras
			this.computadoras[this.contadorComputadoras++] = computadora;
		} else {
			System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
		}
	}

	public void mostrarOrden() {
		System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
		}
	}
}

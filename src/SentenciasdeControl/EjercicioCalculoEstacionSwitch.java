package SentenciasdeControl;

public class EjercicioCalculoEstacionSwitch {

	public static void main(String[] args) {
		var mes = 1;//mes del año
		String estacion;
		switch(mes) {
		case 1: case 2: case 12:
			estacion = "Invierno";
			break;
		case 3: case 4: case 5:
			estacion = "Primavera";
			break;
		case 6: case 7: case 8:
			estacion = "Verano";
		case 9: case 10: case 11:
			estacion = "Otoño";
			break;
		default: 
			estacion = "Mes Incorrecto";
		}
		System.out.println(estacion);
	}

}

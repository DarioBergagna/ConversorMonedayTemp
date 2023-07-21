
public class Test {

	public static double convertirPesoArgentino(String monedaDestino, double cantidad) {
		double resultado = 0.0;

		switch (monedaDestino) {
		case "Dólar":
			resultado = cantidad / 264.57; // Tipo de cambio aproximado
			break;
		case "Euro":
			resultado = cantidad / 297.28; // Tipo de cambio aproximado
			break;
		case "Libra Esterlina":
			resultado = cantidad / 346.34; // Tipo de cambio aproximado
			break;
		case "Yen Japonés":
			resultado = cantidad / 1.91; // Tipo de cambio aproximado
			break;
		case "Won sur-coreano":
			resultado = cantidad / 0.21; // Tipo de cambio aproximado
			break;
		}

		return resultado;
	}

	public static void main(String[] args) {
		// Ejemplo de uso
		double cantidad = 100; // Cantidad en Pesos Argentinos
		String monedaDestino = "Dólar";

		double resultado = convertirPesoArgentino(monedaDestino, cantidad);

		System.out.println(cantidad + " Pesos Argentinos son equivalentes a " + resultado + " " + monedaDestino);
	}
}

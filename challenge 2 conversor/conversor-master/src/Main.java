import javax.swing.JOptionPane;

//Menu de conversor
public class Main {
	public static void main(String[] args) {
		String[] opcionesPrincipales = { "Conversor de Monedas", "Conversor de Temperatura", "Salir" };

		boolean salir = false;
		while (!salir) {
			String seleccionPrincipal = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Conversor", JOptionPane.PLAIN_MESSAGE, null, opcionesPrincipales, opcionesPrincipales[0]);

			if (seleccionPrincipal != null) {
				switch (seleccionPrincipal) {
				case "Conversor de Monedas":
					convertirMonedas();
					break;
				case "Conversor de Temperatura":
					convertirTemperatura();
					break;
				case "Salir":
					salir = true;
					break;
				}
			} else {
				salir = true;
			}
		}
	}

//    Menu de conversor de moneda
	public static void convertirMonedas() {
		String[] opcionesMonedas = { "Dólar a Peso Argentino","Peso Argentino a Dolar", "Euro a Peso Argentino","Peso Argentino a Euro",
				"Libra Esterlina a Peso Argentino","Peso Argentino a Libra Esterlina", "Yen Japonés a Peso Argentino","Peso Argentino a Yen Japones",
				"Won sul-coreano a Peso Argentino","Peso Argentino a Won sul-coreano", "Volver" };

		boolean volver = false;
		while (!volver) {
			String seleccionMoneda = (String) JOptionPane.showInputDialog(null, "Seleccione la conversión:",
					"Conversor de Monedas", JOptionPane.PLAIN_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);

			if (seleccionMoneda != null) {
				if (seleccionMoneda.equals("Volver")) {
					volver = true;
				} else {
					convertirPesoArgentino(seleccionMoneda);
				}
			} else {
				volver = true;
			}
		}
	}

//    funcion para convertir la moneda 
	public static void convertirPesoArgentino(String monedaDestino) {
		String input = JOptionPane.showInputDialog("Ingrese la cantidad $$ en que desea convertir:");
		if (input != null) {
			try {
				double pesosArgentino = Double.parseDouble(input);
				double dolar = Double.parseDouble(input);
				double euro = Double.parseDouble(input);
				double libraesterlina = Double.parseDouble(input);
				double yenjapones = Double.parseDouble(input);
				double wonsurcoreano = Double.parseDouble(input);
				double resultado = 0.0;

				switch (monedaDestino) {
				case "Dólar a Peso Argentino":
					resultado = dolar *264.57; // Tipo de cambio aproximado
					break;
				case "Peso Argentino a Dolar":
					resultado = pesosArgentino / 264.57; // Tipo de cambio aproximado
					break;
				case "Euro a Peso Argentino":
					resultado = euro * 297.28; // Tipo de cambio aproximado
					break;
				case "Peso Argentino a Euro":
					resultado = pesosArgentino / 297.28; // Tipo de cambio aproximado
					break;
				case "Libra Esterlina a Peso Argentino":
					resultado = libraesterlina * 346.34; // Tipo de cambio aproximado
					break;
				case "Peso Argentino a Libra Esterlina":
					resultado = pesosArgentino / 346.34; // Tipo de cambio aproximado
					break;
				case "Yen Japonés a Peso Argentino":
					resultado = yenjapones * 1.91; // Tipo de cambio aproximado
					break;
				case "Peso Argentino a Yen Japones":
					resultado = pesosArgentino * 1.91; // Tipo de cambio aproximado
					break;
				case "Won surcoreano a Peso Argentino":
					resultado = wonsurcoreano * 0.21; // Tipo de cambio aproximado
					break;
				case "Peso Argentino a Won surcoreano":
					resultado = pesosArgentino * 0.21; // Tipo de cambio aproximado
					break;
				}

				// Redondear a 4 decimales
				resultado = Math.round(resultado * 10000.00) / 10000.00;

				JOptionPane.showMessageDialog(null,
						pesosArgentino + " La conversion es equivalente a " + resultado + " " +  monedaDestino ,
						"Resultado", JOptionPane.INFORMATION_MESSAGE);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Cantidad inválida", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

//	Funcion para convertir temepratura
	public static void convertirTemperatura() {

		String opcion = JOptionPane.showInputDialog("Seleccione el tipo de conversión:\n"
                + "1. Celsius a Fahrenheit\n"
                + "2. Fahrenheit a Celsius\n"
                + "3. Celsius a Kelvin\n"
                + "4. Kelvin a Celsius\n"
                + "5. Fahrenheit a Kelvin\n"
                + "6. Kelvin a Fahrenheit");
        
        if (opcion != null) {
            int seleccion = Integer.parseInt(opcion);
            
            switch (seleccion) {
                case 1:
                    convertirCelsiusAFahrenheit();
                    break;
                case 2:
                    convertirFahrenheitACelsius();
                    break;
                case 3:
                    convertirCelsiusAKelvin();
                    break;
                case 4:
                    convertirKelvinACelsius();
                    break;
                case 5:
                    convertirFahrenheitAKelvin();
                    break;
                case 6:
                    convertirKelvinAFahrenheit();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
    public static void convertirCelsiusAFahrenheit() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
        
        if (input != null) {
            try {
                double celsius = Double.parseDouble(input);
                double fahrenheit = (celsius * 9 / 5) + 32;
                
                JOptionPane.showMessageDialog(null, celsius + " °C son equivalentes a " + fahrenheit + " °F",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirFahrenheitACelsius() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Fahrenheit:");
        
        if (input != null) {
            try {
                double fahrenheit = Double.parseDouble(input);
                double celsius = (fahrenheit - 32) * 5 / 9;
                
                JOptionPane.showMessageDialog(null, fahrenheit + " °F son equivalentes a " + celsius + " °C",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirCelsiusAKelvin() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
        
        if (input != null) {
            try {
                double celsius = Double.parseDouble(input);
                double kelvin = celsius + 273.15;
                
                JOptionPane.showMessageDialog(null, celsius + " °C son equivalentes a " + kelvin + " K",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirKelvinACelsius() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Kelvin:");
        
        if (input != null) {
            try {
                double kelvin = Double.parseDouble(input);
                double celsius = kelvin - 273.15;
                
                JOptionPane.showMessageDialog(null, kelvin + " K son equivalentes a " + celsius + " °C",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirFahrenheitAKelvin() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Fahrenheit:");
        
        if (input != null) {
            try {
                double fahrenheit = Double.parseDouble(input);
                double kelvin = (fahrenheit + 459.67) * 5 / 9;
                
                JOptionPane.showMessageDialog(null, fahrenheit + " °F son equivalentes a " + kelvin + " K",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void convertirKelvinAFahrenheit() {
        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Kelvin:");
        
        if (input != null) {
            try {
                double kelvin = Double.parseDouble(input);
                double fahrenheit = kelvin * 9 / 5 - 459.67;
                
                JOptionPane.showMessageDialog(null, kelvin + " K son equivalentes a " + fahrenheit + " °F",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Temperatura inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

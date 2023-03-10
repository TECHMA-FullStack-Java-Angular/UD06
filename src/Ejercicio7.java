import java.text.Normalizer;
import java.util.Scanner;

/*Crea una aplicación que nos convierta una cantidad de euros introducida por teclado
 *  a otra moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como 
 *  parámetros, la cantidad de euros y la moneda a pasar que sera una cadena, este no 
 *  devolverá ningun valor, mostrará un mensaje indicando el cambio (void).*/

public class Ejercicio7 {

	// Inicializamos variables
	double euros;
	String divisa;
	double monedaFinal;

	// Creamos el metodo general de la App
	public void converterApp() {

		// Inicializamos el scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos el mensaje de bienvenida

		System.out.println("Bienvenido a la App Conversor de divisas!");

		// Solicitamos la cantidad de euros a convertir
		System.out.println("Introduce la cantidad de euros que deseas convertir: ");
		euros = Double.parseDouble(sc.nextLine());

		// Solicitamos la divisa a la que desea convertir y normalizamos a lowercase y
		// sin signos de acentuación
		System.out.println("¿Deseas convertir a dolares, yenes o libras? ");
		divisa = sc.nextLine().toLowerCase();
		divisa = Normalizer.normalize(divisa, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

		// llamamos al metodo especifico
		conversor(euros, divisa);

		// Cerramos el scanner
		sc.close();
	}

	// Creamos el metodo conversor donde pondremos el switch case y llamaremos
	//cada metodo individual
	public void conversor(double euros, String divisa) {
		switch (divisa) {

		case "dolares":
			dolarConversor(euros);
			System.out.println(monedaFinal+" dólares.");
			break;
		case "libras":
			librasConversor(euros);
			System.out.println(monedaFinal+" libras.");
			break;
		case "yenes":
			yenesConversor(euros);
			System.out.println(monedaFinal+" yenes.");
		default:
			System.out.println("La divisa introducida no es correcta.");
		}

	}

	//Creamos un método específico para cada divisa
	
	public double dolarConversor(double euros) {
		monedaFinal= euros*1.28611;
		return monedaFinal;
	}

	public double librasConversor(double euros) {
		monedaFinal= euros*0.86;
		return monedaFinal;
	}

	public double yenesConversor(double euros) {
		monedaFinal= euros*129.852;
		return monedaFinal;
	}
}

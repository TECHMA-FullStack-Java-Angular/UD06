import java.util.Scanner;

/*Crea un aplicacion que nos cuente el número de cifras de un número entero positivo 
 * (hay que controlarlo) pedido por teclado. Crea un metodo que realice esta accion,
 *  pasando el numero por parámetro, devolverá el número de cifras.*/

public class Ejercicio6 {

	// Inicializamos variables
	int num;
	int numControlado;

	public void cifrasApp() {
		// Inicializamos el scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos el mensaje de bienvenida

		System.out.println("Bienvenido a la App Calculo de Cifras de numeros enteros positivos!");
		try {
			do {
				// Solicitamos el rango de numeros deseado
				System.out.println(
						"Introduce el número que deseas calcular el numero de cifras\n(El número introducido debe ser entero positivo): ");

				num = Integer.parseInt(sc.nextLine());
				// Llamamos al metodo especifico pasando en numero introducido como aprámetro e
				// imprimimos el resultado
				
				

			} while (num < 0);
			
			numControlado = num;
			System.out.println("El número " + num + " tiene " + calculoCifra(numControlado) + " cifras.");

		} catch (Exception e) {
			System.out.println("El número introducido no es entero:" + e.getMessage());

		}
		
		// Cerramos el scanner
		sc.close();
	}

	// Creamos el metodo para poner la lógica
	public int calculoCifra(int num) {
		int cifras;
		String numero = Integer.toString(num);
		cifras = numero.length();

		return cifras;
	}

}

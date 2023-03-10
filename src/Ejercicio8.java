import java.util.Scanner;
import java.util.Arrays;

/*Crea un array de 10 posiciones de números con valores pedidos por teclado. 
 * Muestra por consola el indice y el valor al que corresponde. Haz dos métodos,
 *  uno para rellenar valores y otro para mostrar.*/

public class Ejercicio8 {

	// Inicializamos variables
	int num[] = new int[10];

	// Inicializamos el scanner
	Scanner sc = new Scanner(System.in);

	// Creamos el metodo general de la App
	public void arrayApp() {

		// Imprimimos el mensaje de bienvenida

		System.out.println("Bienvenido a la App Crea y visualiza un Array!");

		// Solicitamos los 10 numeros a través de un metodo propio

		rellenarArray();

		// Mostramos Array a través de un metodo propio
		mostrarArray(num);

		// Cerramos el scanner
		sc.close();
	}

	public void rellenarArray() {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduce el numero a insertar en la posición " + i + ":");
			num[i] = Integer.parseInt(sc.nextLine());
		}
	}

	public void mostrarArray(int[] num) {
		
		System.out.println("Has creaado la siguiente Array: "+Arrays.toString(num));
		
	}

}

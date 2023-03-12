import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*Crea un array de numeros de un tamaño pasado por teclado, el array contendrá números
 *  aleatorios primos entre los números deseados, por ultimo nos indicar cual es el 
 *  mayor de todos. Haz un metodo para comprobar que el numero aleatorio es primo, 
 *  puedes hacer todos los metodos que necesites.*/

public class Ejercicio10 {

	// Inicializamos variables
	int numArr[];
	int mayor = 0;

	// Inicializamos el scanner
	Scanner sc = new Scanner(System.in);

	// Creamos el metodo general de la App
	public void arrayPrimoApp() {

		// Imprimimos el mensaje de bienvenida
		System.out.println("Bienvenido a la App Crea array de numero primos!");

		// Solicitamos que introduzca el tamaño deseado del array parseado a int
		System.out.println("Introduzca el tamaño del array a crear: ");
		numArr = new int[Integer.parseInt(sc.nextLine())];

		// llamamos al metodo propio para rellenar el array con numeros aleatorios sin
		// rango
		rellenarArray(numArr);

		// Mostramos Array y la suma de sus componentes a través de un metodo propio
		mostrarArray(numArr);

		// Mostrar mayor numero de la array
		mayorArray(numArr);

		// Cerramos el scanner
		sc.close();
	}

	// Metodo donde ponemos la lógica

	public boolean esPrimo(int num) {

		// Comprobamos que no sean negativos, 0, 1 y 4 que no son numeros primos
		if (num <= 0 || num == 1 || num == 4) {
			return false;
		}
		// Comprobamos que no sea divisible por ningun numeros hasta llegar a su valor-1
		for (int i = 2; i < num; i++) {

			if (num % i == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, es primo
		return true;
	}

	// Metodo para rellenar array con numeros aleatorios de de rango especifico
	public void rellenarArray(int[] num) {

		// Rellenamos el array según el tamaño indicado con numeros aleatorios
		// No ha solicitado que los numeros no se repitan

		// Imprimimos un aviso
		System.out.print("Generando números aleatórios...");
		for (int i = 0; i < num.length; i++) {

			// Generamos un numero aleatorio utilizando util.Random y lo guardamos en una
			// variable
			Random random = new Random();
			int numAl = random.nextInt();

			// Si el numero generado es primo rellenamos el array
			if (esPrimo(numAl)) {
				numArr[i] = numAl;
				System.out.print(".");
			} else {
				i--;
				System.out.print(".");
			}
		}
	}

	// Metodo para mostrar array
	public void mostrarArray(int num[]) {

		// mostrar array
		System.out.println("\nLa Array de numeros primos aleatorios creada es: " + Arrays.toString(num) + ".");

	}

	// Metodo para mostrar el mayor numero de una array
	public void mayorArray(int num[]) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] > mayor) {
				mayor = num[i];
			}

		}
		System.out.println("El mayor numero de la array es el " + mayor + ".");
	}

}

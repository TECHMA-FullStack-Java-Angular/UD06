import java.util.Scanner;
import java.util.Arrays;

/*Crea una aplicación que nos genere una cantidad de números enteros aleatorios que 
 * nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros 
 * entre que números queremos que los genere, podemos pedirlas por teclado antes de 
 * generar los números. Este método devolverá un número aleatorio. Muestra estos 
 * números por pantalla.*/

public class Ejercicio2 {

	// Inicializamos variables

	int num[];
	int min;
	int max;
	int numAl[];

	public void generaApp() {

		// Inicializamos el scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos el mensaje de bienvenida

		System.out.println("Bienvenido a la App Genera Números Aleatórios!");

		// Solicitamos el rango de numeros deseado
		System.out.println("Introduce en que rango (minimo y máximo) estarán compreendidos estos numeros.\nMínimo : ");
		min = Integer.parseInt(sc.nextLine());

		System.out.println("Máximo : ");
		max = Integer.parseInt(sc.nextLine());

		// Solicitamos la cantidad de numeros deseada e inicializamos el array

		System.out.println("Introduce la cantidad de números que deseas generar: ");
		int num[] = new int[Integer.parseInt(sc.nextLine())];

		// Llamamos a un metodo especifico para generar los numeros solicitados
		numAl = generador(min, max, num);

		// Imprimimos los numeros generado como un String
		System.out.println("Los números generados son: " + Arrays.toString(numAl));

		// Cerramos el scanner
		sc.close();

	}

	// Metodo que genera los numeros aleatorios
	public int[] generador(int min, int max, int[] num) {

		// Rellenamos el array según el tamaño indicado con numeros aleatorios
		// No ha solicitado que los numeros no se repitan
		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
		}

		return num;

	}

}

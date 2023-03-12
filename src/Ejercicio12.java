import java.util.Arrays;
import java.util.Scanner;

/*Crea un array de numeros de un tamaño pasado por teclado, el array contendrá números
 *  aleatorios entre 1 y 300 y mostrara aquellos numeros que acaben en un digito que 
 *  nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
 *   estos deben guardarse en un nuevo array.*/

public class Ejercicio12 {

	// Inicializamos variables
	int numArr[];
	int acabaEn;

	// Abrimos el Scanner
	Scanner sc = new Scanner(System.in);

	// Creamos el metodo general de la App
	public void personalizaArrayApp() {

		// Imprimimos el mensaje de bienvenida
		System.out.println("Bienvenido a la App personaliza el array!");

		// Solicitamos que introduzca el tamaño deseado del array parseado a int
		System.out.println("Introduzca el tamaño del array a crear: ");
		numArr = new int[Integer.parseInt(sc.nextLine())];

		try {
		// Solicitamos que introduzca el digito que acabaran los numeros introducidos en
		// el array
		System.out.println("Introduzca el digito que quieres que acaben los numeros introducidos en el array: ");
		int input = Integer.parseInt(sc.nextLine());
			if (input >= 0) {
				acabaEn = input;
				rellenarArray(acabaEn, numArr);
				System.out.println(Arrays.toString(numArr));
			}
		}
		catch (Exception e) {
			System.out.println("El digito introducido no es correcto. Introduzca un valor numerico positivo.");
			
		}
			

		

	}

	// Metodo para rellenar array con numeros aleatorios de de rango especifico
	public void rellenarArray(int num, int[] numArr) {

		// Rellenamos el array según el tamaño indicado con numeros aleatorios
		// No ha solicitado que los numeros no se repitan
		for (int i = 0; i < numArr.length; i++) {
			int iteracion = (int) (Math.floor(Math.random() * 300) + 1);

			// Comprobamos que el numero acabe en el digito indicado
			if (iteracion % 10 == num) {
				numArr[i] = iteracion;

			}else {
				i--;
			}

		}
	}

}

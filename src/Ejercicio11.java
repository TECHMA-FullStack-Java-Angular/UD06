import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Crea dos arrays de números con la dimensión pasada por teclado. Uno de ellos estará 
 * rellenado con numeros aleatorios y el otro apuntara al array anterior, reasigna los
 *  valores del segundo array con valores aleatorios. Despues, crea un metodo que tenga
 *   como parametros, los dos arrays y devuelva uno nuevo con la multiplicación de la 
 *   posicion 0 del array1 con el del array2 y así sucesivamente. Por ultimo, muestra el
 *    contenido de cada array.*/

public class Ejercicio11 {

	// Inicializamos variables
	int array1[];
	int array2[];
	int nuevoArray[];
	

	// Abrimos el Scanner
	Scanner sc = new Scanner(System.in);

	// Creamos el metodo general de la App
	public void reasignaArray() {

		// Imprimimos el mensaje de bienvenida
		System.out.println("Bienvenido a la App reasigna valores de array!");

		// Solicitamos que introduzca el tamaño deseado del array parseado a int
		System.out.println("Introduzca el tamaño del array a crear: ");
		array1 = new int[Integer.parseInt(sc.nextLine())];
		array2 = array1.clone();
		nuevoArray= new int[array1.length];

		rellenarArray(array1);
		rellenarArray(array2);
		

		multiplicarArrays(array1, array2, nuevoArray);

		// mostrar arrays
		System.out.println("El primer Array creado es: " + Arrays.toString(array1) + "\nEl segundo Array creado es "
				+ Arrays.toString(array2) + "\nEl nuevo Array creado es " + Arrays.toString(nuevoArray));

		// Cerramos el scanner
		sc.close();
	}

	// Metodo para rellenar array con numeros aleatorios sin rango especifico
	// No ha solicitado que los numeros no se repitan ni un rango especifico 
	
	public void rellenarArray(int[] num) {
	
		// Generamos un numero aleatorio utilizando util.Random y rellenamos el array
		// con un for
		for (int i = 0; i < num.length; i++) {
			Random random = new Random();
			num[i] = random.nextInt(100);
		}
	}

	//Creamos un metodo para realizar la multiplicacion de los arrays
	public void multiplicarArrays(int[] arr1, int[] arr2, int[]nuevoArray) {
		
		for (int i = 0; i < arr1.length; i++) {
			nuevoArray[i] = arr1[i] * arr2[i];
		}

	}

}

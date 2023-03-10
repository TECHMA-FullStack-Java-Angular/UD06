import java.util.Arrays;
import java.util.Scanner;

/*Crea un array de números dónde le indicamos por teclado el tamaño del array, 
 * rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por 
 * pantalla el valor de cada posición y la suma de todos los valores. Haz un metodo 
 * para rellenar el array(que tenga como parámetros los numeros entre los que tenga 
 * que generar) y otro para mostrar el contenido y la suma del array.*/


public class Ejercicio9 {
	
	// Inicializamos variables
	int num[];
	int suma=0;

				
	// Inicializamos el scanner
				Scanner sc = new Scanner(System.in);

		// Creamos el metodo general de la App
		public void arraySumaApp() {

			// Imprimimos el mensaje de bienvenida
			 
			
			System.out.println("Bienvenido a la App Crea y suma valores en un array!");

			// Solicitamos que introduzca el tamaño del array
			System.out.println("Introduzca el tamaño del array a crear: ");
			num = new int[Integer.parseInt(sc.nextLine())];

			
			rellenarArray(0,9,num);

			// Mostramos Array a través de un metodo propio
			mostrarSumarArray(num, suma);

			// Cerramos el scanner
			
		}
		
		public void rellenarArray(int min, int max, int[] num) {

			// Rellenamos el array según el tamaño indicado con numeros aleatorios
			// No ha solicitado que los numeros no se repitan
			for (int i = 0; i < num.length; i++) {

				num[i] = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
			}
		}
		
		public void mostrarSumarArray(int num[], int suma) {
			System.out.println("La Array creada es: "+Arrays.toString(num));
			
			for (int i = 0; i < num.length; i++) {
				suma += num[i];
			}
			System.out.println("La suma de los valores de la Array es: "+suma);
		}
		
}

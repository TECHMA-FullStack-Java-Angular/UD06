import java.util.Scanner;

/*Crea una aplicación que nos convierta un numero en base decimal a binario. Esto lo 
 * realizara un metodo al que le pasaremos el numero como parámetro, devolverá un String
 *  con el numero convertido a binario. Para convertir un numero decimal a binario, 
 *  debemos dividir entre 2 el numero y el resultado de esa división se divide entre 2 
 *  de nuevo hasta que no se pueda dividir mas, el resto que obtengamos de cada división 
 *  formara el numero binario, de abajo a arriba*/

public class Ejercicio5 {
	
	
	//Creamos el metodo general de la App
		public void binarioConv() {

			// Inicializamos el scanner
			Scanner sc = new Scanner(System.in);

			// Imprimimos el mensaje de bienvenida

			System.out.println("Bienvenido a la App Convierta a Binário!");

			// Solicitamos el rango de numeros deseado
			System.out.println("Introduce el número que deseas convertir a numero binario: ");
			int num = Integer.parseInt(sc.nextLine());
			
			//Llamamos al método especifico
			String binario = aBinario(num);
			
						
			// imprimimos el resultado
			System.out.println("El binario de " + num + " es " + binario+".");

			// Cerramos el scanner
			sc.close();
		}
		
		public String aBinario(int num) {
			String binario = Integer.toBinaryString(num);
			
			return binario;
		}
}

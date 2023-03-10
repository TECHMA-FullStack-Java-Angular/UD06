import java.util.Scanner;

/*Crea una aplicación que nos calcule el factorial de un numero pedido por teclado,
 *  lo realizara mediante un método al que le pasamos el número como parámetro. Para
 *   calcular el factorial, se multiplica los numeros anteriores hasta llegar a uno. 
 *   Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.*/

public class Ejercicio4 {
	
	//Inicializamos variables
	int num;
	
	public void factorialApp() {
	
			// Inicializamos el scanner
			Scanner sc = new Scanner(System.in);

			// Imprimimos el mensaje de bienvenida

			System.out.println("Bienvenido a la App Calcula el Factorial!");

			// Solicitamos el rango de numeros deseado
			System.out.println("Introduce el número que deseas calcular el factorial: ");
			num = Integer.parseInt(sc.nextLine());
			
			//Llamamos al metodo especifico pasando el numero indicado como parámetro
			System.out.println("El factorial de "+num+" es "+ factorial(num));
			
			// Cerramos el scanner
			sc.close();
	}
	
	public int factorial(int num) {
		int resultado=1;
		for (int i=1; i<=num; i++) {
			resultado = (resultado*i);
		}
		return resultado;
	}

}

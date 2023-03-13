import java.util.Scanner;

/*Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos 
 * por parámetro para que nos indique si es o no un número primo, debe devolver true si
 *  es primo sino false. Un numero primo es aquel solo puede dividirse entre 1 y si mismo.*/

public class Ejercicio3 {
	
	
//Metodo general de la App
	public void numPrimo() {

		boolean primo = false;
		int num;

		// Inicializamos el scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos el mensaje de bienvenida

		System.out.println("Bienvenido a la App Numeros primos!");

		// Solicitamos el rango de numeros deseado
		System.out.println("Introduce el número que deseas comprobar: ");
		num = Integer.parseInt(sc.nextLine());
		
		// Cerramos el scanner
		sc.close();

		// Llamada al metodo especifico
		primo = esPrimo(num);
		// Imprimimos el resultado
		System.out.println(primo);

	}
	
	
//Metodo donde ponemos la lógica
	
	public boolean esPrimo(int num) {

		// Comprobamos que no sean 0, 1 y 4 que no son numeros primos
		if (num == 0 || num == 1 || num == 4) {
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

}

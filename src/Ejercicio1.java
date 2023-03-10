/*Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. 
 * Pediremos que figura queremos calcular su área y según lo introducido, pedirá 
 * los valores necesarios para calcular el área. Crea un método por cada figura 
 * para calcular cada área, este devolverá un número real. Muestra el resultado 
 * por pantalla.*/

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio1 {
	
	//Inicializamos variables
	double radio;
	double area;
	double lado;
	double base;
	double altura;	
	
	//Creamos un metodo general para el calculo del Area
	public void calcularArea() {
		
		//Inicializamos el scanner con mensaje de bienvenida y explicación de la app			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la app Calcule el área!");
		System.out.println("Introduce la figura a la que deseas calcular el area:\n "
				+ "(circulo, cuadrado o triangulo) ");
		
		//Recuperamos la figura introducida y normalizamos a lowercase y sin signos de 
		//acentuación
		String figura = sc.nextLine().toLowerCase();
		figura = Normalizer.normalize(figura, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
		
		//Creamos un condicional switch para saltar al metodo indicado segun la figura 
		//introducida
		switch(figura) {
		
		case "circulo":
			System.out.println("Has escogido un circulo. \n'Introduzca el radio del circulo: ");
			radio = Double.parseDouble(sc.nextLine());
			areaCirculo(radio);
			
			break;
		case "cuadrado":
			System.out.println("Has escogido un cuadrado. \nIntroduzca el lado del cuadrado: ");
			lado = Double.parseDouble(sc.nextLine());
			areaCuadrado(lado);
			break;
		case "triangulo":
			System.out.println("Has escogido un triangulo. \nIntroduzca la base del triangulo: ");
			base = Double.parseDouble(sc.nextLine());
			System.out.println("Introduzca la altura del triangulo: ");
			altura = Double.parseDouble(sc.nextLine());
			areaTriangulo(base, altura);
			break;
			default:
				System.out.println("La figura introducida no es reconocida");
		}
		
		//Cerramos el scanner		
		sc.close();
	}
	
	//Creamos los metodos de calculo separados para mejor lectura del codigo
	
	public void areaCirculo(double radio) {
		area= (Math.pow(radio, 2))*Math.PI;
		System.out.println("El area del circulo con radio de "+radio+" es "+area+".");
	}
	
	public void areaTriangulo(double base, double altura) {
		area=(base*altura)/2;
		System.out.println("El area del triangulo con base de "+base+" y altura de "+altura+
				" es "+area+".");
	}
	
	public void areaCuadrado(double lado) {
		area = lado*lado;
		System.out.println("El area del cuadrado con lado de "+lado+" es "+area+".");
	}
}

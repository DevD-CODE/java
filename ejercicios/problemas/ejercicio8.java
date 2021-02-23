// Convertir una cantidad de pesos a dolares y viceversa
import java.util.Scanner;
public class ejercicio8 {
	public static void main(String[] args) {
		Double p,d,r; // Declaramos variables
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner

		System.out.println("Introduce la cantidad en pesos"); // Introduccion de datos
		p = entrada.nextDouble(); // Almacenamiento de datos
		System.out.println("Introduce el valor actual del dolar"); // Introduccion de datos
		d = entrada.nextDouble(); // Almacenamiento de datos
		r = p/d; // Operacion matematica
		System.out.println("Peso a dolar : "+r); // Mostramos resultado

		System.out.println("\n"); // Dolar a peso

		Double p2,d2,r2; // Declaramos variables
		Scanner entrada2=new Scanner(System.in); // Invocamos Scanner

		System.out.println("Introduce el valor actual del dolar"); // Introduccion de datos
		d2 = entrada2.nextDouble(); // Almacenamiento de datos
		System.out.println("Introduce la cantidad en pesos"); // Introduccion de datos
		p2 = entrada2.nextDouble(); // Almacenamiento de datos
		r2 = d2/p2; // Operacion matematica
		System.out.println("Dolar a peso: "+r2); // Mostramos resultado
		}
	}
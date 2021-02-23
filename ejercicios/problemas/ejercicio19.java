// Desarrollar un algoritmo que permita introducir una cantidad y este devuelva si la cantidad son MB o GB. 
import java.util.Scanner;
public class ejercicio19 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		Double dt; // Declaramos variable

		System.out.println("Introduce la cantidad"); // Introduccion de datos
		dt = entrada.nextDouble(); // Almacenamiento de datos

		if(dt<=1023) {
			System.out.println(dt+" Son MB"); // Dato
		}
		if(dt>=1024) {
			System.out.println(dt+" Son GB"); // Dato
		}
	}
}
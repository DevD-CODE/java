// Desarrollar un algoritmo que permita introducir un nombre y este devuelva un saludo
import java.util.Scanner;
public class ejercicio20 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		String name; // Declaramos variable

		System.out.println("Introduce tu nombre"); // Introduccion de datos
		name = entrada.nextLine(); // Almacenamiento de datos

		System.out.println("Hola "+name); // Dato
	}
}
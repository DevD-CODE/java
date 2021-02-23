// Desarrollar un algoritmo que al introducir la edad, devuelva si se es mayor o menor de edad.
import java.util.Scanner;
public class ejercicio17 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		int edad; // Declaramos variable

		System.out.println("Introduce tu edad"); // Introduccion de datos
		edad = entrada.nextInt(); // Almacenamiento de datos

		if(edad>=18) {
			System.out.println("Mayor de edad"); // Dato
		}
		if(edad<=17) {
			System.out.println("Menor de edad"); // Dato
		}
	}
}
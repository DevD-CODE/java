// Restar 2 numeros e indicar si es´positivo o negativo
import java.util.Scanner;
public class ejercicio13 {
	public static void main(String[] args) {
		int num1,num2,r; // Definimos las variables
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner

		System.out.println("Introduce un numero"); // Introduccion de datos
		num1 = entrada.nextInt(); // Almacenamos datos
		System.out.println("Introduce otro numero"); // Introduccion de datos
		num2 = entrada.nextInt(); // Almacenamos datos

		r = num1-num2; // Realizamos resta
		System.out.println("El numero "+r+" es : "); // Mostramos resultado

		if(r<=0) {
			System.out.print("Negativo"); // Mensaje
		}
		else {
			System.out.print("Positivo"); // Mensaje
		}
	}
}
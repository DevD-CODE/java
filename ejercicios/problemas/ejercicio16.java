// Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso.
import java.util.Scanner;
public class ejercicio16 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		int num1,num2; // Declaramos variables

		System.out.println("Introduce un numero"); // Introduccion de datos
		num1 = entrada.nextInt(); // Almacenamiento datos
		System.out.println("Introduce otro numero"); // Introduccion de datos
		num2 = entrada.nextInt(); // Almacenamiento de datos

		if(num1>num2) {
			System.out.println(num1+" Es mayor a "+num2); // Dato
		}
		if(num1<num2) {
			System.out.println(num2+" Es mayor a "+num1); // Dato
		}
		if(num1==num2) {
			System.out.println("Los dos numeros son iguales "+num1+" y "+num2); // Dato
		}
	}
}
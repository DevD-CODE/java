import java.util.Scanner;
// Numero impar
public class ejercicio5 {
	public static void main(String[] args) {
		Double numero; // Definimos variable
		Scanner sc=new Scanner(System.in); // Creamos el elemento para la introduccion de datos

		System.out.println("Introduce un numero"); // Introduccion de datos
		numero = sc.nextDouble(); // Parchamos la introduccion de datos al scanner

		if (numero%2==0) { // Si number es porcentual a 2 o igual a cero continuar
			System.out.print(numero+"--"+"El numero es par"); // Texto
		}
		else { // Accion contraria
			System.out.println(numero+"--"+"El numero no es par"); // Texto
		}
	}
}
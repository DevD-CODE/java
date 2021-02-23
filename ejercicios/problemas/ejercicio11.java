// Calcular el salario de una persona mas un bono de puntualidad del 5%
import java.util.Scanner;
public class ejercicio11 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		Double s,b,rb,r; // Declaramos variables

		System.out.println("Introduce el salario"); // Introduccion de datos
		s = entrada.nextDouble(); // Almacenamiento de datos
		System.out.println("Introduce bono de puntualidad"); // Introduccion de datos
		b = entrada.nextDouble(); // Almacenamiento de datos

		rb = s*b; // Sacamos el valor de rb
		r = s+rb; // Sacamos resultado final

		System.out.println("Salario mas bono de puntualidad es igual a : "+r); // Mostramos resultado
	}
}
import java.util.Scanner;
public class boleanos_ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;

		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		
		Boolean algoritm = edad >= 18;

		if (algoritm) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
}
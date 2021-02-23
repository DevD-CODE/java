import java.util.Scanner;
public class constantes_ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre");
		final String name = entrada.nextLine();

		System.out.println("\nHola "+name);
	}
}
import java.util.Scanner;
public class for_ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner cantidad = new Scanner(System.in);

		String salida;
		int cant;

		System.out.println("Escribe un texto :");
		salida = entrada.nextLine();
		System.out.println("Cuantas veces lo repito :");
		cant = cantidad.nextInt();

		for (int x=0;x<cant;x++) {
			System.out.println(salida);
		}
	}
}
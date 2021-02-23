import java.util.Scanner;
public class matrices_ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] mis_numeros = new int[10];
		System.out.println("Introduce los valores");

			for (int i=0;i<mis_numeros.length;i++) {
				mis_numeros[i] = entrada.nextInt();
			} System.out.println("\n");

				for (int t: mis_numeros) {
					System.out.println(t);
				}
	}
}
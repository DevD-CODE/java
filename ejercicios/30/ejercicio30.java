import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;

		System.out.print("De cuantas posiciones debe ser el arreglo : ");
		n = entrada.nextInt();

		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++) {
			System.out.print("Introduce un numero para la posicion " + (i + 1) + " : ");
			arr[i] = entrada.nextInt();
		} System.out.println();

		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
}
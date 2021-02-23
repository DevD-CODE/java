import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arr[] = new int[10];
		int ultimo;

		for(int i=0;i<arr.length;i++) {
			System.out.print("Introduce un numero en la posicion " + (i+1) + " : ");
			arr[i] = entrada.nextInt();
		}
		ultimo = arr[9];

		for(int i=8;i>=0;i--) {
			arr[i+1] = arr[i];
		} arr[0] = ultimo;

		System.out.println("\nMostrar arreglo desplazado una posicion : ");

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int j;
		int arr[] = new int[10];

		for(j=0;j<arr.length;j++) {
			System.out.println("Introduce el numero " + (j + 1));
			arr[j] = entrada.nextInt();
		} System.out.println();

		for(j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			System.out.println(arr[9-j]);
		}
	}
}
import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int arr3[] = new int[20];

		for(int i=0;i<arr1.length;i++) {
			System.out.print("Introduce un numero para la posicion " + i + " : ");
			arr1[i] = entrada.nextInt();
		} System.out.println("\nValores introducidos\n");

		for(int i=0;i<arr2.length;i++) {
			System.out.print("Introduce un numero para la posicion " + i + " : ");
			arr2[i] = entrada.nextInt();
		}

		for(int i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}

		int x = 10;

		for(int j=0;j<arr2.length;j++) {
				arr3[x] = arr2[j];
				x++;
		} System.out.println("\nValores introducidos\n");

		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}

	}
}
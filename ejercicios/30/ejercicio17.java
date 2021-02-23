import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nums[] = new int[10];

		for(int i=0;i<nums.length;i++) {
			System.out.print("Introduce un numero para la posicion " + (i+1) + " : ");
			nums[i] = entrada.nextInt();
		} System.out.println();

		System.out.println("Los datos dentro de NUMS son : ");

		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
import java.util.Scanner;
public class metodos_ejercicio3 {
	static int suma(int s1, int s2, int s3) {
		return s1+s2+s3;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.println("Introduce 3 numeros : ");

			for (int i=0;i<nums.length;i++) {
				nums[i] = entrada.nextInt();
			}

		int r = suma(nums[0],nums[1],nums[2]);
		System.out.println("\n\nLa suma es : "+r);
	}
}
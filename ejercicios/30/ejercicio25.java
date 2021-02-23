import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nums[][] = new int[3][3];
		int n = 1;
		Boolean pos = n > 0;

		for(int i=0;i<3;i++) {
			for(int j=0;i<3;j++) {
				System.out.print("Introduce un numero : ");
				n = entrada.nextInt();

				if(pos) {
					nums[i][j] = n;
				} else {
					System.out.println("[ERROR] NO SE PUEDE ACCEDER");
				}
			}
		}

		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(nums[i][j] + "\t");
			}
		}
	}
}
import java.util.Scanner;
public class ejercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] var = {0,0};
		System.out.print("Introduce la cantidad de multiplos : ");
		var[0] = entrada.nextInt();
		System.out.print("Introduce el multiplo : ");
		var[1] = entrada.nextInt();
		System.out.println("");

		for (int i=1;i<=var[0];i++) {
			System.out.print(var[1]);
			System.out.print(" x ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.print(var[1]*i);
			System.out.println("");
		}
	}
}
import java.util.Scanner;
public class ejercicio21 {
	static void suma() {
			Scanner entrada = new Scanner(System.in);
			int[] sum = {0,0,0};

			System.out.println("Introduce un numero");
			sum[0] = entrada.nextInt();
			System.out.println("Introduce otro numero");
			sum[1] = entrada.nextInt();

			sum[2] = sum[0]+sum[1];

			System.out.println("El resultado de la suma de "+sum[0]+" y "+sum[1]+" es "+sum[2]+"\n");
		}

	public static void main(String[] args) {
			Scanner sl = new Scanner(System.in);
			String[] select = {"S", "S"};

			do {
				suma();
				System.out.println("¿Deseas realizar otra suma? (S/N)");
				select[0] = sl.nextLine();
			} while (select[0].equals(select[1]));

			if (select[0] != select[1]) {
			System.out.println("Hasta pronto");
		}
	}
}
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int suma = 0;

		do {
			System.out.print("Introduce un numero : ");
			num = entrada.nextInt();
			suma = suma + num;
		} while (num != 0); System.out.println("Valor final introducido : " + suma);
	}
}
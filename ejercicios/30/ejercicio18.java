import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce el primer numero : ");
		num1 = entrada.nextInt();
		System.out.print("Introduce el segundo numero : ");
		num2 = entrada.nextInt();
		int r = suma(num1, num2);
		System.out.println("El resultado de la suma es : " + r);
	}

	public static int suma(int n1, int n2) {
		int r = n1 + n2;

		return r;
	}
}
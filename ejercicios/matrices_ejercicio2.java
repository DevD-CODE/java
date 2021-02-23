import java.util.Scanner;
public class matrices_ejercicio2 {
	public static void main(String[] args) {
		int[] numeros = {27, 19, 27, 58, 34, 65};
		System.out.println("Sumando con arrays\n");

		try {
		Scanner entrada = new Scanner(System.in);
		int salida;
		System.out.println("Selecciona un valor del array (0-5)");
		salida = entrada.nextInt();

		Scanner entrada2 = new Scanner(System.in);
		int salida2;
		System.out.println("Selecciona otro valor del array (0-5)");
		salida2 = entrada2.nextInt();

		int n1 = numeros[salida];
		int n2 = numeros[salida2];

		int r = n1+n2;

		System.out.println("El resultado de la suma es "+r);
		} catch (Exception e) {
		System.out.println("DATOS INCORRECTOS O INCOMPATIBLES");
		}
	}
}
import java.util.Scanner;
public class matrices_ejercicio1 {
	public static void main(String[] args) {
		int[] numeros = {28, 13, 18, 20, 30, 34, 31, 98, 64, 45};
		int salida;

		try {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Selecciona un numero del array");
		salida = entrada.nextInt();
		System.out.println("Haz seleccionado "+numeros[salida]);
		} catch (Exception e) {
			System.out.println("ERROR : VALOR NO ENCONTRADO");
		}
	}
}
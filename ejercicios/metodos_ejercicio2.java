import java.util.Scanner;
public class metodos_ejercicio2 {

	static int retorno(int num, int num2) {
		return num*num2;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		int salida1,salida2;

		System.out.println("Escribe un numero");
		salida1 = entrada.nextInt();
		System.out.println("Escribe otro numero");
		salida2 = entrada2.nextInt();

		int t = retorno(salida1,salida2);
		System.out.println("El producto de esos dos numeros es "+t);
	}
}
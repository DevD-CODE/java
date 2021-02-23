import java.util.Scanner;
class GO extends Thread {
	public void run() {
		Scanner entrada = new Scanner(System.in);
		int[] suma = {0,0,0};

		System.out.println("Introduce un numero");
		suma[0] = entrada.nextInt();
		System.out.println("Introduce otro numero");
		suma[1] = entrada.nextInt();

		suma[2] = suma[0]+suma[1];

		System.out.println("La suma de "+suma[0]+" y "+suma[1]+" es igual a "+suma[2]);
	}
}

public class hilos_ejercicio1 {
	public static void main(String[] args) {
		new GO().start();
	}
}
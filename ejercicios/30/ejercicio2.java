import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		int mayor = numeros[0];
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese los 5 numeros");

		for(int i=0;i<numeros.length;i++) {
			numeros[i] = entrada.nextInt();

			if(numeros[i]>mayor) {
				mayor =  numeros[i];
			}
		} System.out.println("El numero mayor es : " + mayor);
	}
}
import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[5];
		int posicion = 0;

		for(int i=0;i<numeros.length;i++) {
			posicion++;
			System.out.print("Introduce un numero en la posicion " + posicion + " : ");
			numeros[i] = entrada.nextInt();
		} System.out.println("\nLos numeros en orden inverso son : ");

		int j = 4;
		while(j >= 0) {
			System.out.println(numeros[j]);
			j--;
		}
	}
}
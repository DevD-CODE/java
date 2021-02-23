import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A[] = new int[12];
		int B[] = new int[12];
		int C[] = new int[24];

		System.out.println("Ingresar datos en el arreglo A : ");

		for(int i=0;i<12;i++) {
			System.out.println("Introduce un numero en la posicion " + (i+1));
			A[i] = entrada.nextInt();
		}

		System.out.println("Ingresar datos en el arreglo B : ");

		for(int i=0;i<12;i++) {
			System.out.println("Introduce un numero en la posicion " + (i+1));
			B[i] = entrada.nextInt();
		}

		int i=0;
		int j = 0;
		while(i<12) {
			for(int k=0;k<3;k++) {
				C[j] = A[i+k];
				j++;
			}

			for(int k=0;k<3;k++) {
				C[j] = B[i+k];
				j++;
			}
			i+=3;
		}
		System.out.println("Arreglo C :");

		for(j=0;j<24;j++) {
			System.out.println(C[j]);
		}
	}
}
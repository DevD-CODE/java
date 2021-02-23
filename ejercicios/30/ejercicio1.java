import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		int ventas[] = new int[30];
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese las 30 ventas : ");
		for(int i=0;i<ventas.length;i++) {
			System.out.print("Venta " + (i+1) + " : ");
			ventas[i] = entrada.nextInt();
		} System.out.println("\n\nFinalizado\n");

		int k = 0;
		int total = 0;
		while(k<30) {
			if(ventas[k]>=2000) {
				System.out.println("$" + ventas[k]);
				total++;
			}
			k++;
		}
		System.out.println("El total de ventas mayores a 2000 es : " + total);
	}
}
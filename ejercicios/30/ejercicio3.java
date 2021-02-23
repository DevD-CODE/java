import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		int cantPiezas = 0;
		double totalPago = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la cantidad de panes comprados");
		cantPiezas = entrada.nextInt();

		if (cantPiezas>=50 && cantPiezas<100) {
			totalPago = cantPiezas * 4.5;
		} else if(cantPiezas>=100) {
			totalPago = cantPiezas * 4;
		} else {
			totalPago = cantPiezas * 5;
		} System.out.println("El cliente compro " + cantPiezas + " piezas de pan, y el total a pagar es " + totalPago);
	}
}
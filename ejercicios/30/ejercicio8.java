import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String codigo = "";
		int kilos = 0;
		float precio = 0;
		float importeFactura = 0;
		float facturacionTotal = 0;
		int contador = 0;
		int totalKilos = 0;

		for(int i=1;i<=5;i++) {
			System.out.println("Factura numero " + i);
			System.out.println("Codigo de productos : ");
			codigo = entrada.nextLine();
			System.out.println("Cantidad de kilos : ");
			kilos = entrada.nextInt();
			System.out.println("Precio : ");
			precio = entrada.nextFloat();
			importeFactura = kilos * precio;
			facturacionTotal = importeFactura + facturacionTotal;
		} if(importeFactura >= 1000) {
			contador++;
		} totalKilos = kilos + totalKilos;

		System.out.println("Detalles de la venta : ");
		System.out.println("Facturacion total : $" + facturacionTotal);
		System.out.println("Total de kilos vendidos: " + totalKilos);
	}
}
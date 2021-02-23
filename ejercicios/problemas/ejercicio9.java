// Calcula el 15% de descuento en la compra de un articulo y obtener el total
import java.util.Scanner;
public class ejercicio9 {
	public static void main(String[] args) {
		Double a,ds,t,r; // Declaramos variables
		Scanner entrada=new Scanner(System.in); // Invocamos el Scanner

		System.out.println("Introduce precio del articulo"); // Introduccion de datos
		a = entrada.nextDouble(); // Almacenamiento de datos

		System.out.println("Introduce el descuento"); // Introduccion de datos
		ds = entrada.nextDouble(); // Almacenamiento de datos

		t = a*ds; // Operacion matematica con el total
		r = a-t; // Resultado final

		System.out.println("El costo del articulo mas el descuento es: "+r); // Mostramos resultado
	}
}
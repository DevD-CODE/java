import java.util.Scanner;
// Calcular el area de un triangulo
public class ejercicio3 {
	public static void main(String[] args) {
		Double base,altura,r; // Definimos variables
		Scanner sc=new Scanner(System.in); // Creamos el elemento para la introduccion de datos

		System.out.println("Introduce la base"); // Introduccion de datos
		base = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce la altura"); // Introduccion de datos
		altura = sc.nextDouble(); // Parchamos la introduccion de datos al scanner

		r = (base*altura); // Realizamos la operacion

		System.out.print("El area del triangulo es: "+r); // Mostramos resultado final
	}
}
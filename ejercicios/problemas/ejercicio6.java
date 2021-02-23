import java.util.Scanner;
import java.io.*;
public class ejercicio6 {
	public static void main(String[] args) {
		Double a,va,vb; // Definimos variable
		Scanner sc=new Scanner(System.in); // Creamos el elemento para la introduccion de datos

		System.out.println("Introduce el valor de A"); // Introduccion de datos
		va = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce el valor de B"); // Introduccion de datos
		vb = sc.nextDouble(); // Parchamos la introduccion de datos al scanner

		a = va;
		va = vb;
		vb = a;

		System.out.println("Valor  A es "+va); // Resultado

		if (va>=vb) {
			System.out.println("Valor B es "+vb); // Resultado
		}
	}
}
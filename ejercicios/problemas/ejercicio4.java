import java.util.Scanner;
// Calcular salario neto de un trabajador
public class ejercicio4 {
	public static void main(String[] args) {
		Double ht,pht,dias,salario; // Definimos variables
		Scanner sc=new Scanner(System.in); // Creamos el elemento para la introduccion de datos

		System.out.println("Introduce las horas trabajadas"); // Introduccion de datos
		ht = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce precio por horas trabajadas"); // Introduccion de datos
		pht = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce numero de dias trabajados"); // Introduccion de datos
		dias = sc.nextDouble(); // Parchamos la introduccion de datos al scanner

		salario = (ht*pht*dias)*0.80; // Realizamos la operacion

		System.out.println("Salario neto: "+salario); // Mostramos resultado final
	}
}
import java.util.Scanner; // Importamos el archivo (Scanner) de java
// Sumas en java
public class ejercicio1 {
	public static void main(String[] args) {
		Double num1,num2,total; // Definimos las variables
		Scanner sc=new Scanner(System.in); // Creamos el elemento para la introduccion de datos

		System.out.println("Introduce un numero"); // Introduccion de datos
		num1 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce otro numero"); // Introduccion de datos
		num2 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner

		total = (num1*num2); // Realizamos la operacion

		System.out.println("El producto de los 2 numeros es: "+total); // Mostramos resultado final
	}
}
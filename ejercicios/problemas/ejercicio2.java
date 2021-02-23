import java.util.Scanner;
// Calcular promedio y rango aprobatorio con java
public class ejercicio2 {
	public static void main(String[] args) {
		Double cal1,cal2,cal3,cal4,cal5,promedio; // Definimos variales
		Scanner sc=new Scanner(System.in); // Creamos el elemento para la introduccion de datos

		System.out.println("Introduce calificacion 1"); // Introduccion de datos
		cal1 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce calificacion 2"); // Introduccion de datos
		cal2 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce calificacion 3"); // Introduccion de datos
		cal3 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce calificacion 4"); // Introduccion de datos
		cal4 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner
		System.out.println("Introduce calificacion 5"); // Introduccion de datos
		cal5 = sc.nextDouble(); // Parchamos la introduccion de datos al scanner

		promedio = (cal1+cal2+cal3+cal4+cal5)/5; // Realizamos la operacion

		System.out.println("El promedio es "+promedio); // Mostramos resultado final

		if (promedio>=6) { // Mientras promedio sea igual o mayor a 6 continuar
			System.out.println("Calificacion aprobatoria"); // Texto
		}
		else { // Accion contraria
			System.out.println("Calificacion reprobatoria"); // Texto
		}
	}
}
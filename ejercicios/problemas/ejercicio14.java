// Que muestre si el promedio general es excelente, bueno, regular, malo o reprobatorio
import java.util.Scanner;
public class ejercicio14 {
	public static void main(String[] args) {
		Double calf; // Declaramos variable
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner

		System.out.println("Introduce tu calificacion"); // Introduccion de datos
		calf = entrada.nextDouble(); // Almacenamos datos
		System.out.println("\nTu calificacion es : "+calf+"\n"); // Mostramos calificacion

		if(calf>=9) {
			System.out.println("Excelente"); // Mensaje
		}
		if(calf==8) {
			System.out.println("Buena"); // Mensaje
		}
		if(calf==7) {
			System.out.println("Regular"); // Mensaje
		}
		if(calf==6) {
			System.out.println("Mala"); // Mensaje
		}
		if(calf<6) {
			System.out.println("Reprobatoria"); // Mensaje
		}
	}
}
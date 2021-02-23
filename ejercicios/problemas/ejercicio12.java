// Decidir si la calificacion merece beca o no
import java.util.Scanner;
public class ejercicio12 {
	public static void main(String[] args) {
		Double calf; // Definimos variable
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner

		System.out.println("Introduce tu calificacion : "); // Introduccion de datos
		calf = entrada.nextDouble(); // Almacenamiento de datos

		if(calf>=9) {
			System.out.println("Eres candidato a beca"); // Mensaje
		}
		else {
			System.out.println("Esfuerzate mas"); // Mensaje
		}
	}
}
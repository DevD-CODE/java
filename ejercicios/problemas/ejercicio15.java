// Crear una calculadora IMC y que indique si su IMC es bajo, normal o alto.
import java.util.Scanner;
public class ejercicio15 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		Double kg,cm,r; // Declaramos variables

		System.out.println("Introduce tu peso en (KG)"); // Introduccion de datos
		kg = entrada.nextDouble(); // Almacenamiento de datos
		System.out.println("Introduce tu estatura (CM)"); // Introduccion de datos
		cm = entrada.nextDouble(); // Almacenamiento de datos

		cm = cm*cm; // Elevamos a ^2 cm
		r = kg/cm; // Realizamos la formula matematica

		System.out.println("Su IMC es : "+r); // Mostramos IMC

		if(r<=19) {
			System.out.println("Su IMC es bajo"); // Dato
		}  
		if((r>=20 & r<26)) {
			System.out.println("Su IMC es normal"); // Dato
		}
		if(r>=26) {
			System.out.println("Su IMC es alto"); // Dato
		}
	}
}
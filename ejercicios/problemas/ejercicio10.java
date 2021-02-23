// En un grupo de 34 alumnos, 15 sacaron de calificacion final 9,
// 4 sacaron 10, 7 sacaron 8 y 8 sacaron 6.
// Calcula el promedio total del grupo
public class ejercicio10 {
	public static void main(String[] args) {
		int calif; // Declaramos variable

		System.out.println("Las calificaciones son :\n"); // Texto simple
		System.out.println("15 alumnos sacaron 9"); // Texto simple
		System.out.println("4 alumnos sacaron 10"); // Texto simple
		System.out.println("7 alumnos sacaron 8"); // Texto simple
		System.out.println("8 alumnos sacaron 6"); // Texto simple

		calif = 9+9+9+9+9+9+9+9+9+9+9+9+9+9+9; // Operacion matematica
		calif = calif+10+10+10+10; // Operacion matematica
		calif = calif+8+8+8+8+8+8+8; // Operacion matematica
		calif = calif+6+6+6+6+6+6+6+6; // Operacion matematica
		calif = calif/34; // Operacion matematica

		System.out.println("El promedio general del grupo de 34 alumnos es : "+calif); // Mostramos resultado
	}
}
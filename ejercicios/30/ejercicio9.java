import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] calificaciones = new int[6];
		int cantidadAprobados = 0;
		int cantidadReprobados = 0;

		for(int i=0;i<calificaciones.length;i++) {
			System.out.print("Introduce una calificacion para la posicion " + i + " : ");
			calificaciones[i] = entrada.nextInt();

			boolean aprobado = calificaciones[i] >= 6;
			boolean reprobado = calificaciones[i] <= 5;

			if(aprobado) {
				cantidadAprobados = cantidadAprobados + 1;
			} else if(reprobado) {
				cantidadReprobados = cantidadReprobados + 1;
			}
		} System.out.println("Cantidad de alumnos aprobados : " + cantidadAprobados + "\nCantidad de alumnos reprobados : " + cantidadReprobados);
	}
}
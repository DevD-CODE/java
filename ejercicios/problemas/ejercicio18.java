// Desarrollar un algoritmo de inicio de sesión, que al Introducir el usuario y contraseña correcta,
// muestre "Sesión Iniciada" y al no ser esto correcto mostrar "ERROR : DATOS INCORRECTOS". 
import java.util.Scanner;
public class ejercicio18 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); // Invocamos Scanner
		String user,pass; // Declaramos variables
		String userid = "admin";
		String passid = "admin";

		System.out.println("Introduce usuario :"); // Introduccion de datos
		user = entrada.nextLine(); // Almacenamiento de datos
		System.out.println("Introduce contraseña :"); // Introduccion de datos
		pass = entrada.nextLine(); // Almacenamiento de datos

		if((user.equals(userid) && pass.equals(passid))) {
			System.out.println("Sesion Iniciada"); // Dato
		}
		else {
			System.out.println("ERROR : DATOS INCORRECTOS"); // Dato
		}
	}
}
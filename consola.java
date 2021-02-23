import java.io.Console;

public class consola {
	public static void main(String[] args) {
		Console console = System.console();

		System.out.print("Introduzca su nombre : ");
		String name = console.readLine();

		System.out.println("Su nombre es : " + name);
	}
}
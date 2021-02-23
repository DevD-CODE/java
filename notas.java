import java.io.File;
import java.util.Scanner;
import java.util.Formatter;
public class notas {
	public static void main(String[] args) {
		notasinput();
	}

	static void notasinput() {
		Scanner entrada = new Scanner(System.in);

		String salida;
		System.out.println("......................................................................\n");
		System.out.println("::::::::::::::::::::::: Bloc de notas con Java :::::::::::::::::::::::\n");
		System.out.println("Escribe tu nota :\n");
		salida = entrada.nextLine();

		try {
		Formatter nota = new Formatter("C:/Users/Usuario/nota.txt");

		nota.format(salida);
		nota.close();
		System.out.println("\n\nNota escrita\n");
		System.out.println("......................................................................");
	} catch (Exception e) {
		System.out.println("ERROR");
		}
	}
}
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class html_read {

	static void init() throws IOException {
		Scanner entrada = new Scanner(System.in);
		String caracteres;
		String direccion;

		System.out.println("Introduce una direccion web");
		direccion = entrada.nextLine(); System.out.println("OK\n\n");

		URL http = new URL(direccion);
		BufferedReader lector = new BufferedReader(new InputStreamReader(http.openStream()));
		File archivo = new File("export.txt");
		BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

			while((caracteres = lector.readLine()) !=null) {
				escritor.write(caracteres);
			}

			lector.close();
			escritor.close();
			System.out.println("ACCION EXITOSA");
			System.out.println("\nDevD 2020");
	}

	public static void main(String[] args) {
		try {
			init();
		} catch (Exception e) {
			System.err.println("ERROR FATAL");
		}
	}
}
import java.net.*;
import java.io.*;
class conexion extends Thread {
	public void run() {
		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		BufferedReader entrada;
		PrintStream salida;

		try {
			servidor = new ServerSocket(puerto);
			init = new Socket();
			init = servidor.accept();
			System.out.println("Se espera un nombre");

			entrada = new BufferedReader(new InputStreamReader(init.getInputStream()));
			salida = new PrintStream(init.getOutputStream());

			salida.print("Nombre : ");
			String name = entrada.readLine();
			System.out.println(name);

			init.close();
		} catch (Exception e) {
			System.out.println("ERROR FATAL");
		}
	}
}

public class ejercicio23 {
	public static void main(String[] args) {
		new conexion().start();
	}
}
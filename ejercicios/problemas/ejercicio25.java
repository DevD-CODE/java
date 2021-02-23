import java.net.*;
import java.io.*;
import java.util.Scanner;
class conexion extends Thread {
	public void run() {
		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		BufferedReader entrada;
		PrintStream salida;
		String msg = "mensaje";
		String msg2 = "mensaje2";
		Scanner entrada_mensaje = new Scanner(System.in);

		try {
			servidor = new ServerSocket(puerto);
			init = new Socket();
			init = servidor.accept();
			entrada = new BufferedReader(new InputStreamReader(init.getInputStream()));
			salida = new PrintStream(init.getOutputStream());
			System.out.println("Se espera un mensaje del chat");

			while (true) {
				msg = entrada.readLine();
				System.out.println("Te envio : "+msg);
				msg2 = entrada_mensaje.nextLine();
				salida.println("Te envio : "+msg2);
			}
		} catch (Exception e) {
			System.err.println("ERROR FATAL");
		}
	}
}

public class ejercicio25 {
	public static void main(String[] args) {
		new conexion().start();
	}
}
import java.io.*;
import java.net.*;
import java.util.Scanner;

class init extends Thread {
	public void run() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un HOST/IP");

		final String HOST = entrada.nextLine();
		final String WHOIS = "whois.internic.net";
		final int PUERTO = 43;

			try {
				Socket socket = new Socket(WHOIS, PUERTO);
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true);
				pw.println(HOST);

				InputStream is = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String caracteres;

					while((caracteres = br.readLine()) != null) {
						System.out.println(caracteres);
					}

			} catch(Exception e) {
				System.err.println("ERROR FATAL " + e.getMessage());
			}
	}
}

public class whois {
	public static void main(String[] args) {
		new init().start();
	}
}
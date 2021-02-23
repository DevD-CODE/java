import com.sun.net.httpserver.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;

class conexion extends Thread {
	private static String name;
	public void run() {
		Scanner entrada = new Scanner(System.in);
		final int PUERTO = 2222;

		System.out.println("Introduce tu nombre");
		name = entrada.nextLine();

		try {
			HttpServer httpd = HttpServer.create(new InetSocketAddress(PUERTO), 0);
			HttpContext ctx = httpd.createContext("/");
			ctx.setHandler(conexion::Gestion);
			httpd.start();
	} catch (IOException e) {};
	}
	private static void Gestion(HttpExchange exc) throws IOException {
		final int RESPONSE = 200;
		final String CONTENT = "Hola "+name;

		exc.sendResponseHeaders(RESPONSE, CONTENT.getBytes().length);

		OutputStream os = exc.getResponseBody();
		os.write(CONTENT.getBytes());
		os.close();
	}
}

public class HTTPServer_ejercicio1 {
	public static void main(String[] args) {
		new conexion().start();
	}
}
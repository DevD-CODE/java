import com.sun.net.httpserver.*;
import java.net.*;
import java.io.*;

public class HTTPServer {
	public static void main(String[] args) throws IOException {
		final int PUERTO = 2222;
		HttpServer httpd = HttpServer.create(new InetSocketAddress(PUERTO), 0);
		HttpContext ctx = httpd.createContext("/");
		ctx.setHandler(HTTPServer::Gestion);
		httpd.start();
	}
	private static void Gestion(HttpExchange exc) throws IOException {
		final int RESPONSE = 200;
		final String CONTENT = "SOLICITUD GET REALIZADA CORRECTAMENTE\n200 OK";

		exc.sendResponseHeaders(RESPONSE, CONTENT.getBytes().length);

		OutputStream os = exc.getResponseBody();
		os.write(CONTENT.getBytes());
		os.close();
	}
}
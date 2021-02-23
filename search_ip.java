import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;

public class search_ip {
	public static void main(String[] args) {
		try {
			String host = "devd.site";
			String dns = "8.8.8.8";

			// Obtencion de la direccion IP
			System.out.printf("La direccion de %s es %s\n", host, InetAddress.getByName(host).getHostAddress());

			System.out.println();

			// Encontrar el nombre del host
			System.out.printf("El nombre del host para la ip %s es %s\n", dns, InetAddress.getByName(dns).getHostName());

			System.out.println();

			// Direccion del host local
			final InetAddress localhost = InetAddress.getLocalHost();
			System.out.printf("La direccion del localhost es %s\n", localhost);

			System.out.println();

			// Obtener datos de un host
			host = "www.wikipedia.org";
			Socket socket = new Socket(host, 80);
			InetAddress ipWikipedia = socket.getInetAddress();
			System.out.printf("La IP de %s es %s\n", host, ipWikipedia);

		} catch (IOException e) {
			System.err.println("ERROR FATAL --> " + e.getMessage());
		}
	}
}
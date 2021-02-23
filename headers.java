import java.net.URL;

public class headers {
	public static void main(String[] args) {
		final String DIRECCION = "http://bit.ly:80/2SiCmCJ";

		try {
			URL url = new URL(DIRECCION);
			System.out.println("Protocolo : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Puerto : " + url.getPort());
			System.out.println("Ruta : " + url.getPath());	
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
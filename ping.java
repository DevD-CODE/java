import java.net.InetAddress;
import java.io.IOException;

public class ping {
	public static void main(String[] args) {
		final String HOST = "google.com";

			try {
				InetAddress ping = InetAddress.getByName(HOST);
				boolean logic = ping.isReachable(10000);
				System.out.println("Esta al alcance : " + logic);
			} catch (IOException e) {
				System.err.println("ERROR FATAL " + e.getMessage());
			}
	}
}
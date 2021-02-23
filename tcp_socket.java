import java.net.Socket;

public class tcp_socket {
	public static void main(String[] args) {
		final String HOST = "localhost";
		final int PORT = 8383;

		try (Socket socket = new Socket(HOST, PORT)) {
			System.out.println("Conexion Exitosa");
		} catch (Exception e) {
			System.err.println("Conexion Fallida " + e.getMessage());
		}
	}
}
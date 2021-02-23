import java.net.*;
import java.io.*;
public class sockets {
	public static void main(String[] args) {
		ServerSocket server; // Creamos el servidor
		Socket socket; // Creamos la conexion socket
		int puerto = 2222; // Creamos el puerto
		DataOutputStream salida; // Creamos la salida
		BufferedReader entrada; // Creamos la entrada

		try {
			server = new ServerSocket(puerto); // Creamos el servidor sobre el puerto
			socket = new Socket(); // Creamos la conexion socket
			socket = server.accept(); // Damos inicio a la conexion
			System.out.println("Se espera un nombre\n"); // Dato a recabar

			entrada = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Obtenemos la entrada
			String name = entrada.readLine(); // Almacenamos la entrada
			System.out.println("Hola "+name); // Mostramos la entrada

			salida = new DataOutputStream(socket.getOutputStream()); // Creamos la salida
			salida.writeUTF("RECIBIDO"); // Escribimos salida
			socket.close(); // Terminamos la conexion
		} catch (Exception e) {
			System.out.println("ERROR FATAL");
		}
	}
}
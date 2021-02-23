import java.net.*;
import java.io.*;
public class sockets_2 {
	public static void main(String[] args) {
		Socket cliente; // Creamos el cliente
		String ip = "127.0.0.1"; // Creamos el IP
		int puerto = 2222; // Creamos el puerto
		BufferedReader entrada, teclado; // Creamos entradas
		PrintStream salida; // Creamos salidas

		try {
			cliente = new Socket(ip, puerto); // Creamos el Socket sobre cliente
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream())); // Creamos entrada
			teclado = new BufferedReader(new InputStreamReader(System.in)); // Creamos teclado
			String tec = teclado.readLine(); // Añadimos teclado a una variable String
			salida = new PrintStream(cliente.getOutputStream()); // Creamos salida
			salida.println(tec); // Mostramos salida
			String msg = entrada.readLine(); // Añadimos entrada a una variable String
			System.out.println(msg); // Mostramos entrada

			cliente.close(); // Se cierra la conexion
		} catch (Exception e) {
			System.out.println("ERROR FATAL");
		}
	}
}
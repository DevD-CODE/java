import java.net.*;
import java.io.*;
public class sockets_ejercicio2 {
	public static void main(String[] args) {
		String edad;
		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		DataOutputStream cliente;
		BufferedReader peticion;

		try {
			servidor = new ServerSocket(puerto);
			init = new Socket();
			init = servidor.accept();
			System.out.println("Se espera una edad");

			peticion = new BufferedReader(new InputStreamReader(init.getInputStream()));
			edad = peticion.readLine();
			System.out.println("Recibida edad "+edad);

			cliente = new DataOutputStream(init.getOutputStream());
			int decision = Integer.parseInt(edad);
			if (decision>=18) {
				cliente.writeUTF("Eres mayor de edad");
			} else {
				cliente.writeUTF("Eres menor de edad");
			}
		} catch (Exception e) {};
	}
}
import java.net.*;
import java.io.*;
public class sockets_ejercicio3 {
	public static void main(String[] args) {
		String[] datos = {"admin", "admin", "", "", ""};

		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		DataOutputStream cliente, error;
		BufferedReader sesion1, sesion2, peticion;

		try {
			servidor = new ServerSocket(puerto);
			init = new Socket();
			init = servidor.accept();
			System.out.println("Inicia Sesion");

			sesion1 = new BufferedReader(new InputStreamReader(init.getInputStream()));
			datos[2] = sesion1.readLine();
			sesion2 = new BufferedReader(new InputStreamReader(init.getInputStream()));
			datos[3] = sesion2.readLine();
			System.out.println("Se recibieron los datos de la sesion");

			if (datos[2].equals(datos[0]) && datos[3].equals(datos[1])) {
				cliente = new DataOutputStream(init.getOutputStream());
				cliente.writeUTF("SESION INICIADA\n");
				cliente.writeUTF("Introduce tu nombre : ");

				peticion = new BufferedReader(new InputStreamReader(init.getInputStream()));
				datos[4] = peticion.readLine();
				System.out.println("Bienvenido "+datos[4]);
				init.close();
			} else {
				error = new DataOutputStream(init.getOutputStream());
				error.writeUTF("ERROR : DATOS INCORRECTOS");
				init.close();
			}
		} catch (Exception e) {};
	}
}
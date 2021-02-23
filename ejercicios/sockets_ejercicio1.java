import java.net.*;
import java.io.*;
public class sockets_ejercicio1 {
	public static void main(String[] args) {
		String[] sumas = {"0", "0"};

		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		DataOutputStream cliente;
		BufferedReader peticion, peticion2;

		try {
		servidor = new ServerSocket(puerto);
		init = new Socket();
		init = servidor.accept();
		System.out.println("Se esperan 2 numeros");

		peticion = new BufferedReader(new InputStreamReader(init.getInputStream()));
		sumas[0] = peticion.readLine();
		System.out.println("Introducido "+sumas[0]);

		peticion2 = new BufferedReader(new InputStreamReader(init.getInputStream()));
		sumas[1] = peticion2.readLine();
		System.out.println("Introducido "+sumas[1]);

		cliente = new DataOutputStream(init.getOutputStream());
		cliente.writeUTF("DATOS RECIBIDOS");
		int[] suma = {Integer.parseInt(sumas[0]), Integer.parseInt(sumas[1])};
		int r = suma[0]+suma[1];
		cliente.writeUTF("\nEl resultado de "+sumas[0]+" y "+sumas[1]+" es : "+r);
		init.close();
		} catch (Exception e) {};
	}
}
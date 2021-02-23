import java.net.*;
import java.io.*;
public class sockets_ejercicio4 {
	public static void main(String[] args) {
		String[] formulario = {"", "", "", ""};

		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		DataOutputStream iniciado;
		BufferedReader iniciar, nombre, telefono, direccion, correo;

		try {
			servidor = new ServerSocket(puerto);
			init = new Socket();
			init = servidor.accept();
			System.out.println("Se espera una tecla");

			iniciar = new BufferedReader(new InputStreamReader(init.getInputStream()));
			String go = iniciar.readLine();
			iniciado = new DataOutputStream(init.getOutputStream());
			System.out.println("Proceso iniciado\n\n");

			iniciado.writeUTF("Proceso iniciado\n");
			iniciado.writeUTF("\n");
			
			iniciado.writeUTF("Nombre : ");
			nombre = new BufferedReader(new InputStreamReader(init.getInputStream()));
			formulario[0] = nombre.readLine();

			iniciado.writeUTF("\nTelefono : ");
			telefono = new BufferedReader(new InputStreamReader(init.getInputStream()));
			formulario[1] = telefono.readLine();

			iniciado.writeUTF("\nDireccion : ");
			direccion = new BufferedReader(new InputStreamReader(init.getInputStream()));
			formulario[2] = direccion.readLine();

			iniciado.writeUTF("\nCorreo : ");
			correo = new BufferedReader(new InputStreamReader(init.getInputStream()));
			formulario[3] = correo.readLine();

			iniciado.writeUTF("\n\nDatos enviados");
			init.close();
		} catch (Exception e) {};
		System.out.println("Datos recibidos :");
		System.out.println("Nombre : "+formulario[0]);
		System.out.println("Telefono : "+formulario[1]);
		System.out.println("Direccion : "+formulario[2]);
		System.out.println("Correo : "+formulario[3]);
	}
}
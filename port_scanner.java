import java.net.*;
import java.util.Scanner;

class comenzar extends Thread {
	public void run() {
		String direccion;
		int[] puertos = {80, 443, 8080, 22, 21};
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un host/ip para escanear : ");
		direccion = entrada.nextLine();

		for (int i=0;i<puertos.length;i++) {
			try {
				Socket init = new Socket();
				init.connect(new InetSocketAddress(direccion, puertos[i]), 3000);
					if (init.isConnected()) {
						System.out.println(" ");
						System.out.println("DIRECCION : "+direccion+"\nPUERTO ABIERTO : "+puertos[i]);
					}
			} catch (Exception e) {
				System.out.println(" ");
				System.err.println("DIRECCION : "+direccion+"\nPUERTO NO ABIERTO : "+puertos[i]);
			}
		}
	}
}

public class port_scanner {
	public static void main(String[] args) {
		new comenzar().start();
	}
}

class Loader extends Thread {
	public void run() { // Creamos instancia "run" donde sera ejecutado lo siguiente al
	                    // ser llamado "start"
		System.out.println("Hola"); // Dato
	}
}

public class hilos {
	public static void main(String[] args) {
		new Loader().start(); // Invocacion
	}
}
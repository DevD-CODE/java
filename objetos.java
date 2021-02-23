public class objetos {
	public static void main(String[] args) {
		System.out.println("Bienvenido a la cafeteria"); // Dato
		System.out.println("Tenemos :"); // Dato
		System.out.println("\n");

		cafe temp = new cafe(); // Invocamos la clase cafe
		                        // Creamos un objeto dentro de esa clase
		temp.hot();             // Mostramos ese objeto
		System.out.println("\n");

		galletas tot = new galletas(); // Invocamos la clase galletas
		                               // Creamos un objeto dentro de esa clase
		tot.cant();                    // Mostramos ese objeto
	}
}

class cafe {
	static void hot() {
		System.out.println("El cafe esta caliente"); // Dato
	}
	public static void main(String[] args) {
		System.out.println("Aun hay cafe"); // Dato
	}
}

class galletas {
	static void cant() {
		System.out.println("Hay 30 paquetes de galletas"); // Dato
	}
	public static void main(String[] args) {
		System.out.println("Aun hay galletas"); // Dato
	}
}
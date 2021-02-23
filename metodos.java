public class metodos {

// (Metodos)
	static void holamundo() {
		System.out.println("Hola mundo"); // Dato
		System.out.println("Este es un metodo, se mostrara al ser invocado"); // Dato
	}

// (Salidas con metodos)
	static void salida(String entrada) {
		System.out.println("Hola " +entrada); // Dato
	}

// (Retorno)
	static int retorno(int num1, int num2) {
		return num1+num2; // Suma
	}



	public static void main(String[] args) {
// Metodos
		holamundo(); // Si esta linea no es creada, el dato no se mostrara
		System.out.println("\n");

// Salidas con metodos
		salida("Daniel"); // Invocamos metodo
		System.out.println("\n");

// Retorno
		int x = retorno(10,10); // Almacenamos valores de "retorno" en "x"
		System.out.println(x); // Mostramos "x"
		System.out.println("\n");
	}
}
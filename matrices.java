public class matrices {
	public static void main(String[] args) {
// Creando matrices
		String[] mistextos = {"TEXTO1","TEXTO2","TEXTO3"}; // Creamos un matriz de tipo string
		                                                   // Añadimos 3 valores dentro de "mistextos"
		System.out.println(mistextos[1]); // Mostramos un valor del matriz "mistextos"
		                                  // Los matrices comienzan desde 0
		System.out.println("\n");

// Longitud del matriz
		System.out.println(mistextos.length); // Esto nos da la cantidad de matrices que hay en una variable
		System.out.println("\n");

// Sumando todos los matrices
		int[] misnumeros = {10,2,3,5}; // Creamos una matriz de tipo int
		                              // Añadimos 4 valores dentro de "misnumeros"
		int sum = 0; // Variable de almacenamiento
		for (int x=0; x<misnumeros.length; x++) {
			sum += misnumeros[x]; // Se suman los matrices
		}
		System.out.println(sum); // Dato
		System.out.println("\n");

// Bucle for mejorado (each)
		for (int t: misnumeros) {
			System.out.println(t); // Muestra los valores del matriz "misnumeros"
		}
		System.out.println("\n");

// Matrices multidimencionales
		String[][] mimulti = { {"TEXTO1", "TEXTO2"},{"TEXTO1.1", "TEXTO2.1"} }; // Creamos un matriz
		                                   // Lo volvemos multidimencional
		                                   // Asignamos valores
		System.out.println(mimulti[1][0]); // Dato
	}
}
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;
// Importando el archivo
class archivo {
	public static void main(String[] args) {
		File a = new File("C:/Users/Usuario/file.txt"); // Importando archivo

		if (a.exists()) {
			System.out.println("Archivo cargado"); // Dato
		}
		else {
			System.out.println("El archivo no existe :( "); // Dato
		}
	}
}

// Leyendo el archivo
class archivo2 {
	public static void main(String[] args) {
		try {
			File b = new File("C:/Users/Usuario/file.txt"); // Importando archivo
			Scanner entrada = new Scanner(b); // Creamos Scanner
			while (entrada.hasNext()) {
				System.out.println(entrada.next()); // Mostramos dato
			} entrada.close(); // Se cierra Scanner
		} catch (Exception e)
		{
			System.out.println("ERROR"); // Excepcion
		}
	}
}

// Guardando el archivo
class archivo3 {
	public static void main(String[] args) {
		try {
		Formatter txt = new Formatter("C:/Users/Usuario/format.txt"); // Importamos el archivo

		txt.format("Este es un ejemplo de escritura con java"); // Añadimos texto
		txt.close(); // Cerramos edicion
	} catch (Exception e) {
		System.out.println("ERROR"); // Excepcion
	}
	}
}
import java.io.File;
public class archivos_ejercicio1 {
	public static void main(String[] args) {
		File clase = new File("C:/Users/Usuario/for_ejercicio1.java");

		try {
			if (clase.exists()) {
				System.out.println("Archivo cargado");
				for_ejercicio1 claserun = new for_ejercicio1();
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}
}
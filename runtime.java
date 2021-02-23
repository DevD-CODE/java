public class runtime {
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("C:/Users/Usuario/Desktop/Psiphon.exe"); // Creamos metodo Runtime
			                                                                   // con su clase .getRuntime().exec()
			                                                                   // Marcamos directorio con ejecutable
			System.out.println("Abriendo ejecutable..."); // Dato
		} catch (Exception e) {
			System.err.println("ERROR, NO SE PUEDE CARGAR EL EJECUTABLE"); // Error
		}
	}
}

// Extra

class extra {
	public static void main(String[] args) {
		String url = new String();
		url = "www.google.es";
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +"http://"+url);
	}
}
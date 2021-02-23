public class conversion_2 {
	public static void main(String[] args) {
		String texto = "4"; // Variable String
		int numero = 2; // Variable Integer

		int texto_numero = Integer.parseInt(texto); // Parchamos "texto" como un entero
		String numero_texto = Integer.toString(numero); // Parchamos "numero" como un texto

		System.out.println(texto_numero+" antes era : "+texto); // Mostramos
		System.out.println(numero_texto+" antes era : "+numero); // Mostramos
	}
}
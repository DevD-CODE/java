public class excepciones {
	public static void main(String[] args) {
		try {
			String test[] = new String[2]; // Matriz variable
			System.out.println(test[5]); // Dato
		} catch (Exception e) {
			System.out.println("ERROR"); // Dato
		}
		try {
			int num1 = 0; // Variable
			int num2 = 0; // Variable
			int r; // Variable de resultado
			r = num1*num2;
			System.out.println(r); // Dato
		} catch (Exception e) {
			System.out.println("ERROR"); // Dato
		}
	}
}
public class clases_objetos {
	public static void main(String[] args) {
		test.horn(); // Static
	}
}
// Static
class test {
	public static void horn() {
		System.out.println("BEEP-BEEP");
	}
}
// Final
class fin {
	public static final String text = "hola mundo";
	public static void main(String[] args) {
		System.out.println(text);
	}
}
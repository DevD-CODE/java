import java.util.HashMap;
public class hashmap {
	public static void main(String[] args) {
		HashMap <String, Integer> dinero = new HashMap<String, Integer>(); // Creamos variable en HashMap

		dinero.put("Jose", 500); // Dato
		dinero.put("Amy", 1800); // Dato
		dinero.put("Armando", 100); // Dato

		System.out.println(dinero.get("Amy")); // Mostrar dato
	}
}
import java.util.Iterator;
import java.util.LinkedList;
public class iterator {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); // Creamos variable en LinkedList

		list.add("Pan"); // Array
		list.add("Ajo"); // Array
		list.add("Atun"); // Array
		list.add("Jabon"); // Array

		Iterator<String> dato =  list.iterator(); // Creamos iterador
		String salida = dato.next(); // Asignamos iterador a "salida"

		System.out.println(salida); // Mostramos datos
	}
}
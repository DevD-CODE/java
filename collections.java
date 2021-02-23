import java.util.ArrayList;
import java.util.Collections;
public class collections {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>(); // Creamos variable en ArrayList

		nums.add(5); // Dato
		nums.add(8); // Dato
		nums.add(4); // Dato
		nums.add(2); // Dato
		nums.add(7); // Dato
		nums.add(1); // Dato
		nums.add(3); // Dato
		nums.add(6); // Dato
		nums.add(9); // Dato
		nums.add(0); // Dato

		Collections.sort(nums); // Ordenamos "nums"
		System.out.println(nums); // Mostramos datos
	}
}
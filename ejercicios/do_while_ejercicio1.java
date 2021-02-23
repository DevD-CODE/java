import java.util.Scanner;
public class do_while_ejercicio1 {
	public static void main(String[] args) {
		String select = "S";
		Scanner entrada = new Scanner(System.in);
		int r = 0;
		int[] nums = new int[2];
		do {
			for (int i=0;i<nums.length;i++) {
				System.out.println("Introduce un numero");
				nums[i] = entrada.nextInt();
				select = entrada.nextLine();
			} r = nums[0]+nums[1];
					System.out.println("\nResultado : "+r);
					System.out.println("\n¿Deseas realizar otra suma? (S/N)");
					select = entrada.nextLine();
		} while (select.equals("S"));
	}
}
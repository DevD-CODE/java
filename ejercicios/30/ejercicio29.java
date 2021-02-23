import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		Boolean multiplo3 = false;



		for(int i=0;i<4;i++) {
			System.out.print("Introduce un numero : ");
			num = entrada.nextInt();
			System.out.println();

			if(num %3 == 0) {
				multiplo3 = true;
			} if(multiplo3 == true) {
				System.out.println("Si es multiplo de 3\n");
			} else {
				System.out.println("No es multiplo de 3\n");
			} multiplo3 = false;
		} 
	}
}
import java.util.Scanner;
public class metodos_ejercicio1 {

static void entrada() {
	Scanner sc = new Scanner(System.in);
	String name;
	System.out.println("Escribe tu nombre");
	name = sc.nextLine();
	System.out.println("Hola "+name);
}

	public static void main(String[] args) {
		entrada();
	}
}
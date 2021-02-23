import java.util.Scanner;

class datos {
	protected int edad;

	public void datos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad :");
		edad = entrada.nextInt();
	}
}

class algoritmo extends datos {
	public algoritmo() {
		datos();

		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
}

class programa {
	public static void main(String[] args) {
		algoritmo miprograma = new algoritmo();
	}
}
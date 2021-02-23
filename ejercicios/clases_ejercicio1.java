import java.util.Scanner;
public class clases_ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Index :");
		System.out.println("\nnombre\nnumero\nlista");
	}
}

class nombre {
	public static void main(String[] args) {
		Scanner nombre = new Scanner(System.in);

		String name;
		System.out.println("Escribe tu nombre");
		name = nombre.nextLine();

		System.out.println("Hola "+name);
	}
}

class numero {
	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Introduce un numero");
		numero1 = num1.nextInt();
		System.out.println("Introduce otro numero");
		numero2 = num2.nextInt();

		int r = numero1*numero2;

		System.out.println("El producto de "+numero1+" Y "+numero2+" Es igual a "+r);
	}
}

class lista {
	public static void main(String[] args) {
		Scanner search = new Scanner(System.in);

		int[] numeros = {92, 31, 32, 65, 65, 87, 82, 46, 20, 74};
		int sr;

		try {
			System.out.println("Selecciona el numero dentro del array : ");
			sr = search.nextInt();

			System.out.println("Haz seleccionado "+numeros[sr]);
		} catch (Exception e) {
			System.out.println("ERROR : VALOR NO ENCONTRADO O TIPO INCORRECTO");
		}
	}
}
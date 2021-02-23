import java.io.Console;

public class ejercicio19 {
	public static void main(String[] args) {
		Console cs = System.console();
		double peso, altura, imc;

		System.out.print("Introduce tu peso : ");
		peso = Double.parseDouble(cs.readLine());
		System.out.print("Introduce tu altura : ");
		altura = Double.parseDouble(cs.readLine());

		imc = init(peso, altura);

		System.out.println("Tu IMC es " + imc);
	}

	public static double init(double peso, double altura) {
		altura = altura * altura;
		double imc = peso / altura;

		return imc;
	}
}
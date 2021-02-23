import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[10];
		int cant = 0;
		int suma = 0;
		int promedio = 0;
		String def = "none";

		for(int i=0;i<numeros.length;i++) {
			System.out.print("Introduce un numero para la posicion " + i + " : ");
			numeros[i] = entrada.nextInt();

			boolean negativo = numeros[i] <= 0;
			boolean positivo = numeros[i] >= 1;

			if(negativo) {
				def = "NEGATIVO";
				System.out.println("El numero " + numeros[i] + " es " + def);
			} else if (positivo) {
				def = "POSITIVO";
				cant = cant + 1;
				suma = suma + numeros[i];
				System.out.println("El numero " + numeros[i] + " es " + def);
			}
		} 
		promedio = suma / cant;
		System.out.println("La cantidad de numeros positivos es : " + cant + " y el promedio es " + promedio);
	}
}
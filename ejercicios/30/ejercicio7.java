import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[10];
		int promedioNegativo = 0;
		int promedioPositivo = 0;
		int conteoNegativo = 0;
		int conteoPositivo = 0;
		int sumaNegativa = 0;
		int sumaPositiva = 0;
		int cantidadCeros = 0;

		for(int i=0;i<numeros.length;i++) {
			System.out.print("Introduce un numero entero para la posicion " + i + " : ");
			numeros[i] = entrada.nextInt();

			boolean negativo = numeros[i] < 0;
			boolean positivo = numeros[i] >= 1;
			boolean cerosIngresados = numeros[i] == 0;

			if(negativo) {
				conteoNegativo = conteoNegativo + 1;
				sumaNegativa = sumaNegativa + numeros[i];
			} else if(positivo) {
				conteoPositivo = conteoPositivo + 1;
				sumaPositiva = sumaPositiva + numeros[i];
			} if(cerosIngresados) {
				cantidadCeros = cantidadCeros + 1;
			}
		}

		boolean numerosNegativos = conteoNegativo < 0 && sumaNegativa < 0;
		boolean numerosPositivos = conteoPositivo >= 1 && sumaPositiva >= 1;

		if (numerosNegativos) {
			promedioNegativo = sumaNegativa / conteoNegativo;
		} else if (numerosPositivos) {
			promedioPositivo = sumaPositiva / conteoPositivo;
		}
		
		System.out.println();
		System.out.println("La cantidad de numeros negativos fue : " + conteoNegativo + " y el promedio fue : " + promedioNegativo);
		System.out.println("La cantidad de numeros positivos fue : " + conteoPositivo + " y el promedio fue : " + promedioPositivo);

		boolean ceros = cantidadCeros > 0;
		if(ceros) {
			System.out.println("La cantidad de ceros ingresados fue : " + cantidadCeros);
		}
	}
}
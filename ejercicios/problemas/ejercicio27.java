/*
1. Un caracol ha caído en un agujero de 10 metros de profundidad,
en su intento de salir del agujero,
el caracol sube 5 metros cada día pero se resbala 2 metros cada noche,
calcular en cuantos días el caracol logrará salir del agujero.
*/

public class ejercicio27 {
	public static void main(String[] args) {

		// Inicializando las variables a utilizar

		final int AGUJERO = 10;
		int dias_transcurridos = 0;

		// Logica : bucle for

			for (int i=0;i<=AGUJERO;i++) {
				i = i + 5; // DIA
				i = i - 2; // NOCHE
				dias_transcurridos = dias_transcurridos + 1; // DIA NUMERO X
				System.out.println("Es el dia " + dias_transcurridos + " y el caracol avanzo " + i + " metros");
			}
	}
}
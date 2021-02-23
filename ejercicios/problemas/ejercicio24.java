import java.net.*;
import java.io.*;
class conexion extends Thread {
	public void run() {
		ServerSocket servidor;
		Socket init;
		int puerto = 2222;
		BufferedReader entrada;
		PrintStream consola;
		String[] calificaciones = {"0","0","0"};
		String[] datos = {"nombre","grado","grupo"};

		try {
			servidor = new ServerSocket(puerto);
			init = new Socket();
			init = servidor.accept();
			entrada = new BufferedReader(new InputStreamReader(init.getInputStream()));
			consola = new PrintStream(init.getOutputStream());

				// Conexion : DATOS
					consola.println("Introduzca sus datos :");
					consola.print("Nombre : ");
					datos[0] = entrada.readLine();
					consola.print("\n");
					consola.print("Grado : ");
					datos[1] = entrada.readLine();
					consola.print("\n");
					consola.print("Grupo : ");
					datos[2] = entrada.readLine();
					consola.println("\nCONECTADO");
			System.out.println("CONECTADO "+datos[0]+" del grado "+datos[1]+" grupo "+datos[2]);

					// Conexion : CALIFICACIONES
						consola.println("Introduzca sus calificaciones :");
						consola.print("Programacion : ");
						calificaciones[0] = entrada.readLine();
						consola.print("\n");
						consola.print("Fisica : ");
						calificaciones[1] = entrada.readLine();
						consola.print("\n");
						consola.print("Matematicas : ");
						calificaciones[2] = entrada.readLine();
							consola.println("\nGUARDADO");
			System.out.println("CALIFICACIONES GUARDADAS");

					// Conversion 
						int[] promediacion = {Integer.parseInt(calificaciones[0]), 
						Integer.parseInt(calificaciones[1]), Integer.parseInt(calificaciones[2])};

						// Conexion : PROMEDIO
							int promedio;
							promedio = promediacion[0]+promediacion[1]+promediacion[2];
							promedio = promedio/3;

							// Conexion : EVALUACION
								String result = "none";
								if (promedio <= 5) {
									result = "Reprobatoria";
								}
									if (promedio >= 6 && promedio <= 8) {
										result = "Aceptable";
									}
										if (promedio >= 9) {
											result = "Excelente";
										}

								// Conexion : RESULTADOS
									consola.println("Datos :");
									consola.print("Nombre : "+datos[0]+"\n");
									consola.print("Grado : "+datos[1]+" Grupo : "+datos[2]+"\n");
									consola.println("Calificacion final : "+promedio);
									consola.println("Evaluacion : "+result);
									consola.println("\nPresione una tecla para salir");
									entrada.readLine();

				System.out.println("Calificacion final : "+promedio);
				System.out.println("Evaluacion : "+result);
		init.close();
		} catch (Exception e) {
			System.err.println("ERROR FATAL");
		}
	}
}

public class ejercicio24 {
	public static void main(String[] args) {
		new conexion().start();
	}
}
import javax.swing.JOptionPane;

public class ejercicio10 {
	public static void main(String[] args) {
		int numeroSueldos = 0;
		int sueldo = 0;
		int sueldoMaximo = 0;
		int numero = 0;
		String identificador = "none";
		String identificadorMaximo = "none";

		numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de suelos : "));

		for(int i=0;i<numeroSueldos;i++) {
			numero = numero + 1;
			identificador = JOptionPane.showInputDialog("Introduce el nombre o identificador del sueldo " + numero + " : ");
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("[" + identificador + "]" + " Introduce la cantidad del sueldo numero " + numero + " : "));

			if(sueldo > sueldoMaximo) {
				sueldoMaximo = sueldo;
				identificadorMaximo = identificador;
			}
		} System.out.println("El identificador del sueldo maximo fue : " + identificadorMaximo + " y el sueldo fue : $" + sueldoMaximo);
	}
}
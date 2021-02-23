import javax.swing.JOptionPane;

public class ejercicio11 {
	public static void main(String[] args) {
		int[] calificaciones = new int[5];
		String[] identificadores = new String[5];
		int numeroReprobados = 0;
		int numero = 0;

		for(int i=0;i<identificadores.length;i++) {
			numero++;
			identificadores[i] = JOptionPane.showInputDialog("Introduce el identificador numero " + numero);
		} numero = 0;

		for(int i=0;i<calificaciones.length;i++) {
			numero++;
			calificaciones[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion numero " + numero + " para " + identificadores[i]));

			if(calificaciones[i] < 6) {
				numeroReprobados++;
			}
		}
		for(int i=0;i<calificaciones.length;i++) {
			if(calificaciones[i] < 6) {
				JOptionPane.showMessageDialog(null, "El identificador [" + identificadores[i] + "] saco [" + calificaciones[i] + "] y esta reprobado",
				 "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
			} else if(calificaciones[i] >= 6) {
				JOptionPane.showMessageDialog(null, "El identificador [" + identificadores[i] + "] saco [" + calificaciones[i] + "] y esta aprobado",
				 "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
			}
		} JOptionPane.showMessageDialog(null, "La cantidad de reprobados es " + numeroReprobados, "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
	}
}
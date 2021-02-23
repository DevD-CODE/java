import java.time.*;

public class time {
	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
		System.out.println("Hora actual : " + hora);

		LocalDate fecha = LocalDate.now();
		System.out.println("Fecha actual : " + fecha);

		LocalDateTime tiempo = LocalDateTime.now();
		System.out.println("Fecha y Hora actual : " + tiempo);
	}
}
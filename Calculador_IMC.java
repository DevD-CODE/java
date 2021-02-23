import java.util.Scanner;
import java.io.File;
import java.util.Formatter;

class calc {
	protected double kg,cm,r;

	public void calc() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("......................................................................\n");
		System.out.println(":::::::::::::::::::::::::: Calculador IMC ::::::::::::::::::::::::::::\n");
		try {
		System.out.println("Introduce tu peso (Ej: 60)");
		kg = entrada.nextDouble();
		System.out.println("Introduce tu altura (Ej: 1.70)");
		cm = entrada2.nextDouble();
		System.out.println("\n");

		cm = cm*cm;
		r = kg/cm;
	} catch (Exception e) {
		System.out.println("ERROR");
	}
	}
}

class save extends calc {
	public save() {

		Scanner select = new Scanner(System.in);
		int sl;
		System.out.println("¿Deseas guardar estos datos? (1=SI, 0=NO)");
		sl = select.nextInt();

		if (sl == 1) {
			try {
		Scanner datos = new Scanner(System.in);
		String misdatos;
		System.out.println("Seleccione y pegue los datos obtenidos :");
		misdatos = datos.nextLine();

		Formatter savethis = new Formatter("imc.txt");
		savethis.format(misdatos);
		savethis.close();
		System.out.println("\n\n(COMPLETADO)\n\n");
		} catch (Exception e) {
			System.out.println("\n\n(ERROR)\n\n");
		}
		}
		System.out.println("Utilice el comando (java info), para mas informacion");
		System.out.println("......................................................................\n");
	}
}

class date extends calc {
	public date() {
		calc();

		System.out.println("IMC : "+r);
		if (r<19) {
			System.out.println("Tu IMC es bajo, usted necesita subir de peso");
			System.out.println("Una alimentacion rica en nutrientes ayudaria");
		} if ((r>20 && r<25)) {
			System.out.println("Tu IMC es normal, usted no necesita perder peso");
			System.out.println("Recuerda mantener una alimentacion sana");
		} if (r>=25) {
			System.out.println("Tu IMC es alto, usted necesita perder peso");
			System.out.println("Para perder peso necesitas consumir menos de lo que gastas");
		} System.out.println("\n");
		save miprograma = new save();
	}
}

class start {
	public static void main(String[] args) {
		date miprograma2 = new date();
	}
}

class info {
	public static void main(String[] args) {
		System.out.println("......................................................................\n");
		System.out.println("Calculador IMC creado por DevD (Daniel Martinez Rivera)\nWhatsApp: 6251155686\n\n");
		System.out.println("El IMC no diferencia entre musculo y grasa, alimentate sanamente");
		System.out.println("......................................................................\n");
	}
}
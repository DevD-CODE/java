public class matrices_ejercicio3 {
	public static void main(String[] args) {
		int[][] mis_enteros = { {1,2,3,4,5}, {6,7,8,9,10} };
		String[][] mis_textos = { {"T1", "T2", "T3", "T4", "T5"}, {"T6", "T7", "T8", "T9", "T10"} };
		double[][] mis_puntos = { {1.1, 1.2, 1.3, 1.4, 1.5}, {1.6, 1.7, 1.8, 1.9, 1.10} };

		for (int t: mis_enteros[1]) {
			System.out.println(t);
		} System.out.println("\n");

			for (String t: mis_textos[0]) {
				System.out.println(t);
			} System.out.println("\n");

				for (double t: mis_puntos[1]) {
					System.out.println(t);
				} System.out.println("\n");

		System.out.println(mis_enteros[1][2]);
		System.out.println(mis_textos[0][4]);
		System.out.println(mis_puntos[1][3]);
	}
}
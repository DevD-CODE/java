public class ejercicio20 {
	public static void main(String[] args) {
		int max;
		int t[] = new int[6];

		System.out.println("Llenando el arreglo...");

		for(int i=0;i<t.length;i++) {
			t[i] = (int) (Math.random() * 100 + 1);
			System.out.println(t[i]);
		}
		max = NumeroMayor.NumeroMaximo(t);

		System.out.println("El numero mayor es : " + max);
	}
}


class NumeroMayor {
	static int NumeroMaximo(int t[]) {
		int max;
		max = t[0];

		for(int i=0;i<t.length;i++) {
			if(t[i] > max) {
				max = t[i];

				return max;
			}
		}
		return max;
	}
}
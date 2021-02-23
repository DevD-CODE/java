public class ejercicio26 {
	public static void main(String[] args) {
		int n[] = new int[10];
		int max;
		int i = 0;

		while(i < n.length) {
			n[i] = (int) (Math.random() * 100 + 1);
			i++;
		} i = 0;

		while(i < n.length) {
			System.out.println(n[i]);
			i++;
		} System.out.println();

		max = init(n);
		System.out.println("El numero maximo es : " + max);
	}

	public static int init(int n[]) {
		int max = 1;
		int i = 0;

		while (i < n.length) {
			if(n[i] > max) {
				max = n[i];
			}
			i++;
		}
		return max;
	}
}
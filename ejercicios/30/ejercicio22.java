public class ejercicio22 {
	public static void main(String[] args) {
		int n[] = new int[10];

		System.out.println("RELLENANDO ARRAY CON NUMEROS ALEATORIOS...");

		for(int i=0;i<n.length;i++) {
			n[i] = (int) (Math.random()*100+1);
		} System.out.println();

		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		} System.out.println();

		int min = init(n);

		System.out.println("EL VALOR MAS BAJO ES : " + min);
	}

	public static int init(int n[]) {
		int min = 100;

		for(int i=0;i<n.length;i++) {
			Boolean minNum = n[i] < min;
			if(minNum) {
				min = n[i];
			}
		}
		return min;
	}
}
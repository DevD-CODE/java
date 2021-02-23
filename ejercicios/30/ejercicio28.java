public class ejercicio28 {
	public static void main(String[] args) {
		int matriz[][] = new int[4][5];

		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				if(i==0 || i==3) {
					matriz[i][j] = 1;
				} if(j==0 || j==4) {
					matriz[i][j] = 1;
				}
			}
		} System.out.println("Matriz de 4 X 5 : ");

		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matriz[i][j] + " ");
			}
		} System.out.println();
	}
}
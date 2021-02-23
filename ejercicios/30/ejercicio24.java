public class ejercicio24 {
	public static void main(String[] args) {
		int nums[][] = new int[3][3];
		int s = 0;

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				s = s + 5;
				nums[i][j] = s;
			}
		}

		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(nums[i][j] + "\t");
			}
		} System.out.println();
	}
}
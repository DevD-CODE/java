public class ejercicio23 {
	public static void main(String[] args) {
		int nums[][] = new int[3][3];

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nums[i][j] = (int) (Math.random()*100+1);
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
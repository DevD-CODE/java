public class ejercicio21 {
	public static void main(String[] args) {
		int nums[] = new int[20];

		for(int i=0;i<nums.length;i++) {
			nums[i] = (int) (Math.random()*10);
		}

		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
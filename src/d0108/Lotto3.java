package d0108;

import java.util.Random;

public class Lotto3 {
	public static void main(String[] args) {
		int[] nums = new int[3];
		Random r = new Random();
		
		
		nums[0] = r.nextInt(100);
		nums[1] = r.nextInt(100);
		nums[2] = r.nextInt(100);
		
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
	}
}

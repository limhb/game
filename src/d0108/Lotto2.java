package d0108;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		//총 7개를 맞춰야하는 게임
		//난수 1-50
		
		Random r = new Random();
		int[] nums = new int[7];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=r.nextInt(50)+1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}

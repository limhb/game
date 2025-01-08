package d0108;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random r = new Random(); 
		
		int[] nums = new int[6];
		//Array1을 참고하여 1~45까지의 난수를 nums의 각 방에 대입하고 출력하는 for문 작성
		//length는 변수
		for(int i=0;i<nums.length;i++) { //입력부
			nums[i] = r.nextInt(45)+1;
		}
		
		for(int i =0 ; i<nums.length;i++) { //출력부
			System.out.println(nums[i]);			
		}
	}
}

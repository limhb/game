package d1013;

public class Duple { //중복
	
	public static void main(String[] args) {
		/*int i = 10;
		
		do {
			System.out.println(i++);
		}while(i<10);
		
		while(i<10) {//참이면 반복
			System.out.println(i++);
		}*/
		
		int[] nums = new int[]{1,2}; 
		//int[] nums = {1,2}; 초기화할때만 가능
		//nums = new int[] {2,3}; 초기화, 값변경 가능
		
//		for(int i = 0; i<2; i++) {
//			if(nums[i] == 1) {
//				System.out.println("1은 "+i+"번째 배열에 있습니다.");
//			}
//		}
		
		//선생님 답
		for(int i = 0 ; i<nums.length;i++) {
			if(nums[i]==1) {
				System.out.println(i+"번째 방에 1이 있습니다.");
				break;
			}
			System.out.println(i);
		}
		
	}

}

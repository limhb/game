package d0120;

public class Array6 {
	
	public static void main(String[] args) {
		int[] nums = new int[6];
		//1~45까지의 난수를 6개 생성해서
		//nums의 각각대입을 하는데 짝수일 때는 0
		
		for(int i=0;i<nums.length;i++) {
			
			int rNum = (int)(Math.random()*45)+1; //0~44
//			nums[i] = rNum + 1;	
//			if (nums[i]%2==0) {
//				nums[i]=0;
//			}
			
			//선생님 답
			if(rNum%2 ==1) {
				nums[i] = rNum; //대입안했을 때 초기값은 0이므로
			}
		}
		
		for (int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}

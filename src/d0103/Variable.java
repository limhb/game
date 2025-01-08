package d0103;

public class Variable {

	public static void main(String[] args) {
		int i = 1; //리터럴 변수
		//배열 
		//nums의 데이터 타입은 int배열
		int[] nums = new int[5]; //int배열의 초기화 이고 각 배열은 초기화가 되어있지않음
		//System.out.println(nums[0]); //java가 해주는 초기화
		
		/*nums[0] = 1; //int타입
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		System.out.println(nums[0]); 
		System.out.println(nums[1]); 
		System.out.println(nums[2]); 
		System.out.println(nums[3]); 
		System.out.println(nums[4]); */
		
		for(int j=0;j<5;j++) {
			nums[j] = j+1;
		}
		
		for(int j=0;j<5;j++) {
			System.out.println(nums[j]);
		}

	}
}

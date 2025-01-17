package d0117;

public class Array {
	
	
	public static void main(String[] args) {
		int[] nums  = new int[2]; //방개수를 늘려보자
		nums[0]=20;
		nums[1]=22;
		
		int[] tmps = nums; //{20,22}
		nums = new int[nums.length + 1]; // {0,0,0}
		//nums =tmps; //방이 준다아아 
		nums[0] = tmps[0];
		nums[1] = tmps[1];
		for(int i = 0 ; i<tmps.length;i++) { 
			nums[i]=temp[i];
		}
	
		
		
		
	}
		

}

package d0115;

public class Static {
	static int i; 
	
	static int test() {//nonstatic
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		test();
		
		
	}

}

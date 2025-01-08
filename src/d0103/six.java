package d0103;

public class six {
	public static void main(String[] args) {
		for(int i =1; i<=100;i++) {
			if(i%10==6 || i/10==6) {
				System.out.print("짝");
			}else {
				System.out.print(i);
			}
			
			if(i%10==0) {
				System.out.println();
			}
		}
		
	}
}

package d0103;

public class three {
	public static void main(String[] args) {
		for(int i =1; i<=100;i++) {
			if(i%10==3 || i/10==3) {
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

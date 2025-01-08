package d0103;

public class nine {
	public static void main(String[] args) {
		for(int i =1; i<=100;i++) {
			if(i%10==9 || i/10==9) {
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

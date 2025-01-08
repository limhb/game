
public class Three {
	public static void main(String[] args) {
		//3이라는 숫자가 있을 때 마다 '짝'이 나왔으면 좋겠다
		for(int i=1;i<=100;i++) {
			if(i%10==3 || i/10==3) {
				System.out.print("짝");
			}else {
				System.out.print(i);
			}
			if(i%10 == 0) {
				System.out.println();
			}
			
		}	
	}
}

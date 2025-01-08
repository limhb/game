package d0103;

public class Odd {
	public static void main(String[] args) { //1부터 100까지 출력을 하되 홀수만
		for(int i=1;i<=100;i++) {
			if(i%10 == 0) {
				System.out.println();
			}
			if(i%2==1 && i%10 == 9) {
				System.out.print(i);
				
			}else if(i%2==1){
				System.out.print(i+",");
			}
		}
		
	}

}

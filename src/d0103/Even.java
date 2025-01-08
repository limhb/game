package d0103;

public class Even {
	public static void main(String[] args) { //1부터 100까지 출력을 하되 짝수만
		for(int i = 1; i<=100;i++){

			if(i%2 == 0 && i%10 == 0 || i%2 ==0 && i/10 == 0) {
				System.out.print(i);
			}else if(i%2==0 ) {
				System.out.print(i+",");
			}
			//i%10 == 0 출력 이후 띄어쓰기
			if(i%10 == 0) {
				System.out.println();
			}
		}
		for(int i=1;i<=100;i +=2) {
			System.out.println(i);
		}
	}

}

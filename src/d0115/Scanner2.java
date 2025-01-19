package d0115;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1-9까지 원하는 숫자를 적어주세요 : ");
		String numStr = s.nextLine();
		
		//1-100까지 출력
		//입력받은 숫자가 들어가면 짝
		
		int num = Integer.parseInt(numStr);
		for(int i=1;i<=100;i++) {
			if(i%10==num || i/10 == num) {
				System.out.print("짝");
			}else {
				System.out.print(i);
			}
		}
	}
}

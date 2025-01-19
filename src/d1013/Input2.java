package d1013;

import java.util.Random;
import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int targetNum = r.nextInt(100)+1;
		
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("원하는 숫자를 적으세요");
			String numStr = s.nextLine();
			int num = Integer.parseInt(numStr);
			System.out.println("니가 쓴 숫자 : " + numStr);
			
			if (num < targetNum) {
				System.out.println("UP");
			}else if (num > targetNum) {
				System.out.println("DOWN");
				
			}else {
				System.out.println("정답");
				break;
			}
		}

	}

}

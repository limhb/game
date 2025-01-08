package d0108;

import java.util.Random; //ctrl+shift+O

public class RandomTest {
	
	public static void main(String[] args) {
		Random r = new Random(); //Random은 대문자 , method가 아님
		int num = r.nextInt(100)+1; //nextInt(100)은 Method/ 0~99까지의 난수를 생성
		System.out.println(num);
	}
}

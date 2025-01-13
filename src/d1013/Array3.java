package d1013;

import java.util.Random;

public class Array3 {
	public static void main(String[] args) {
		String[] strs = new String[3];
		//1부터 5까지의 난수를 strs에 대입
		
		Random r = new Random();
		for(int i=0;i<3;i++) {
			strs[i] = r.nextInt(5)+1+""; //""+r.nextInt(5)+1은 21같은거된다
		}
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}

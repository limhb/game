package d1230;

public class Operator2 {

	public static void main(String[] args){
		int num = 1;
		num = num + 1;
		num += 1;
		num++;
		++num;
		System.out.println(num++); //후순위 연산
		System.out.println(num);
		
		num--;
		--num;
		num -= 1;
		num = num - 1;
		System.out.println(num);		
	}
}

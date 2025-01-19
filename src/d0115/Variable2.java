package d0115;

import java.util.Random;
import java.util.Scanner;

//멤버변수를 사용하려면 반드시 메모리를 사용해야한다.
	//자바의 멤버변수는 전역변수와는 다른 것, 자바는 전역변수를 지원하지 않는다.
	
//	public은 같은 프로젝트 내이면 다른 패키지라도 호출 가능하게 하는 접근 제한자
//	static의 경우 클래스 변수를 만들어 별도의 인스턴스 없이 바로 호출 가능하게 하는 키워드
	
class Variable2 {
	int i;
	String str;
	public static void main(String[] args) {
		String str = new String("asdf"); //new 메모리 생성
		Scanner s =new Scanner(System.in);
		Random r = new Random();
		
		Variable2 v = new Variable2();
		//객체 : 존재하든 존재하지 않든 정의할 수 있는 무언가
		System.out.println(v.i);
		System.out.println(v.str);//초기화하지않음 

	}
	
	
}
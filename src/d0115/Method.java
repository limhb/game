package d0115;

public class Method {
	
	int test() { //선언-메소드명-()
		return 0; //return할때 영역과 같은 데이터타입을 리턴
	}
	
	String test1() {
		return " ";
	}
	//데이터타입 - 기본형 , 참조형
	//메소드 - 데이터 타입을 리턴하는 것, 아무것도 리턴하지 않는 것 (void)
	public static void main(String[] args) { //void는 변수앞에 쓸 수 없다(변수 선언X)
		//return true;등이 안됨
		
		Method m = new Method();
		int i = m.test();
		String str = m.test1();
		System.out.println(i);
		System.out.println(str);
	}

}

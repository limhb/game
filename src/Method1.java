package d0117;

import com.sun.jdi.Method;

public class Method1 {
	//데이터 타입을 리턴하는 것, 무언가를 리턴하지 않는 것
	
	static void test() {
		
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(i==1) {
					//break; //i가 출력됨(1,2,3...10)
					return;
				}
			}
			System.out.println(i);
		}
		
		Method1.test(); //Method를 사용할 때 같은 class 내부라도 class명을 써주는 것이 정석이다.
		int i = Integer.parseInt("1");//italic 은 static 
	}

}

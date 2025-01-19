package d0117;

public class Static2 {
	//시작점과 로딩은 다르다.
	int age = 1; //non static은 생성할때마다 다시 읽는다.
	static int height; //자바가 0으로 초기화
	//java에서 static변수는 italic으로 표시된다.
	
	void test(int n) {
		//return이 하는 일 : 해당 method에서 나가겠다. 
		//return 값을 내뱉거나 종료시키거나
		System.out.println("테스트 시작");
		//return; 따라서 여기에 있으면 오류가 남
		if (n==1) {
			return; //1을 넣엇을 경우 이곳에서 종료되었으므로 다음 코드가 출력되지않음
		}
		System.out.println("테스트 종료");
	}
	
	public static void main(String[] args) {
		System.out.println(height); //메모리생성전에도 사용 가능(static이니까)
		Static2 s  = new Static2();
		s.height =11;
		//System.out.println(height); //11이 나온다.
		System.out.println(s.age);
		s.age = 9;
		System.out.println(s.age); //그러나 non-static의 경우 값이 다르게 나옴
		//즉 static의 경우 코드 어디에서 읽어도 값이 같다.(순서대로)
		
		System.out.println(s.height); //height와 s height는 같음 java는 다시 로딩하지 않음
		s.test(1);
	}
}

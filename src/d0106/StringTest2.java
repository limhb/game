package d0106;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕"; //java에서 new로 만들지 않고 str1 저장 공간을 다시 씀
		System.out.println(str1==str2); //true
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		System.out.println(str1==str3); //false
		System.out.println("== : " + str3==str4); //false
		// ==은 값이 있는 주소값을 비교하는 것이다.
		System.out.println("equals : " + str3.equals(str4));
		//값을 비교 하고 싶을 땐 .equals라는 method를 쓴다.
		
		
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		System.out.println(i1==i2);
	}
}

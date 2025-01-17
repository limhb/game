package d0117;

public class Static3 {
	static int age = 10;
	public static void main(String[] args) {
		Static3 s1 = new Static3();
		System.out.println(s1.age);
		s1.age = 20;
		Static3 s2 = new Static3();
		System.out.println(s2.age); //age는 같은 메모리를 쓰므로
	}

}

package d1230;

public class Loop1 {
	public static void main(String[] args){
		for(int i= 1;i<=10;i++) {
			System.out.println(i+"번 반복");
		}
		int i=1;
		for (;i<=10;i++) {
			System.out.println("난 무한 반복!!");
			System.out.println("안 써도돼요");
		}
		System.out.println(i);
	}
}

package d0106;

public class StringTest5 {
	public static void main(String[] args) {
		String str1 = "안녕하십니까?하";
		//System.out.println(str1.length());
		
		for (int i=0; i<str1.length(); i++) {
			//System.out.println(str1.substring(i,i+1).equals("하"));
			
			if(str1.substring(i,i+1).equals("하")) {
				System.out.println(i+1+"번째 단어는 하 입니다.");
			}
		}
		//선생님 답
		for(int i =0; i<str1.length();i++) {
			String str = str1.substring(i,i+1);
			if("하".equals(str)) {
				System.out.println(i);
			}
		}
		System.out.println(str1.indexOf("하"));
		System.out.println(str1.lastIndexOf("하")); // 처음 찾으면 출력후 종료
	}
}


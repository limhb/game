package d0103;

public class DataType2 {
	public static void main(String[] args) {
		int i=1;
		byte b = (byte)i; //다운 캐스팅 = 형변환 해야함
		i = b; //업캐스팅 = 형변환 불필요
		
		String str = i+""; //
		System.out.println(str);
		
		i = i=Integer.parseInt(str);
		System.out.println(i);
		
		
	}
}

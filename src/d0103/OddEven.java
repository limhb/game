package d0103;

public class OddEven {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.print(i);
			/*if(i%10 != 0) { // i!=10 && i!=20...
			System.out.print(",");
			}*/
			if(i%10==0) {
				System.out.println();
			}else{
				System.out.println(",");
			}
		}
	}

}

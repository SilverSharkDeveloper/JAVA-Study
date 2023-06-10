package operTest;

public class Oper6 {
	public static void main(String[] args) {
		//1~10까지중 8까지만 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			if(i==7) {break;}
		}
	}
}

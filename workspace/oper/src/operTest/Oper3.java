package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		//사용자에게 키를 입력받고 정수라면 정수로 출력 실수라면 실수로 출력 예 183 -> 183출력 183.5 -> 183.5출력 183.0 -> 183출력
	
		
		Scanner sc = new Scanner(System.in);
		double key= 0.0;
		key = sc.nextDouble();
		String result = null;
		boolean isInteger = key - (int)key == 0;
		int length = (key - (int)key+ "").length() -2;
	
		result = isInteger ? "%.0f" : "%." +length+ "f";
		
		System.out.printf(result,key);
		

		
		
		
	}
}

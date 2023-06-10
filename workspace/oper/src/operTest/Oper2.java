package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0 ,num2 =0;
		String result = null;
	
		String msg = "두 정수를 입력하세요";
		System.out.println(msg);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1>num2 ? num1+ "가 큰 값입니다" : num1 == num2 ? "두 수가 같습니다" : num2 + "가 큰 값입니다";
		
		System.out.println(result);
		
}
}

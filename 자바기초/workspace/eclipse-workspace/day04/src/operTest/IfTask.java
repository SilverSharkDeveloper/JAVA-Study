package operTest;

import java.util.Scanner;

public class IfTask {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num1 = 0, num2 = 0;
	String result = null;
	
	System.out.print("첫번째 정수 :");
	num1 = sc.nextInt();
	System.out.print("두번째 정수 :");
	num2 = sc.nextInt();

	if (num1>num2) {
		result = "큰 수는 : " + num1;
		
	}else if (num1<num2) {

		result = "큰 수는 : " + num2;
	}else {
		result = "두수는 같습니다";
	}
	System.out.println(result);
}
}

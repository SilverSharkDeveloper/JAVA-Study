package operTest;

import java.util.Scanner;

public class OperTask1_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = 0, num2 = 0;
	System.out.print("첫번째 정수 :");
	num1 = sc.nextInt();
	System.out.print("두번째 정수 :");
	num2 = sc.nextInt();
	System.out.println(( num1>num2? "큰수는" + num1 + "입니다." :
			num1 == num2 ? "두수는 같습니다." : "큰수는 " + num2 + "입니다.") );
	
	
}
}

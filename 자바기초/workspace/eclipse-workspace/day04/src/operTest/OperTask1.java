package operTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
		/*
		 * 정수 2개를 입력받아 큰수 출력하기
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.print("첫번째 정수 :");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 :");
		num2 = sc.nextInt();
		System.out.println("큰수는" +( num1>num2? num1 : num2) + "입니다.");
		
		
				
	}
	
}

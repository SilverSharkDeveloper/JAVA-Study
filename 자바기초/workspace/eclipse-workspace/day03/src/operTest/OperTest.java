package operTest;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
//		System.out.println(10/3);	
//		System.out.println(10%3);
	Scanner sc =new Scanner(System.in);
	int num = 0; int money = 0;
			System.out.print("두 자릴수 정수를 입력하세요 : ");
	num = 	sc.nextInt(); 
			System.out.println("십의 자리는 "+ num/10 + "입니다." );
			System.out.println("일의 자리는 "+ num%10 + "입니다." );
	
	
			
	System.out.print("금액 입력 :");
	money = sc.nextInt();
	System.out.println(money/300 + "곡을 부를 수 있으며 잔돈은"+ money%300 + "입니다.");
	
	}
}

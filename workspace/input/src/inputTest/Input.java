package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String msg = "3개의 정수를 입력해주세요", ex = "예) 1 3 5";
		int num1= 0, num2 =0, num3 =0, result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		System.out.println(ex);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		result = num1+ num2+ num3;
		
		System.out.println(num1+ "+" + num2 +"+"+ num3+ "= " +result +"입니다.");
		System.out.printf("%d + %d + %d = %d 입니다.",num1,num2,num3,result);
		
		
	}
}

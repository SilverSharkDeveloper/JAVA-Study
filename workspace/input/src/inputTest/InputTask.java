package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두 정수를 입력한 뒤 곱셈 결과를 출력 next()만 사용
		int num1 =0 , num2 =0 , result =0;
		String msg = "두개의 정수 입력: ", example = "예)1 3";
		
		System.out.println(msg);
		num1 = Integer.parseInt(sc.next()) ;
		num2 = Integer.parseInt(sc.next()) ;
		
	
		
		result  =num1 * num2;
		System.out.println(num1 +"x" +num2 + " = " + result+ "입니다.");
		
			
	}
}

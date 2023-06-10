package scannerTest;

import java.util.Scanner;
/*
 * 1.변수를 2개 만들기
 * 2.메세지를 출력
 * 3.입력받는다 변수에 저장
 * 4.메세지를 출력
 * 5입력받는다. 변수에 저장
 * 6두 변수를 더해서 출력한다.
 * */
public class InputTask3 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);							//변수는 되도록 위에 한번에
																										  //alt + 화살표는 위아래로 이동.
		
		int number1 = 0	, number2 = 0;
																					//default값      초기화할때 디폴트값
																				//int : 0 
																				//double: 0.0
																				//char''
																				//String : null
		System.out.print("정수 1 입력 :");
	//	number1 = Integer.parseInt(sc.next());
			number1 = sc.nextInt();
		System.out.print("정수 2 입력 :");
	//	number2 = Integer.parseInt(sc.next());
			number2 = sc.nextInt();
		System.out.println("두 정수의 합은" + (number1 + number2) + "입니다.");
		
		
		
		
	
		
		/*
		 *Scanner sc = new Scanner(System.in);
		
		 *String num1, num2;
		
		 *System.out.print("정수 1 입력 :");
		 *num1 = sc.next();
		 
		 * System.out.print("정수 2 입력 :");
		 * num2 = sc.next()
		
		 *  System.out.println("두 정수의 합은" + ( Integer.parseInt(num1) +Integer.parseInt(num2))+ "입니다.");*/
		
		
	}
}

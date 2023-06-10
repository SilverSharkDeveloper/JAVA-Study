package day03;

public class Casting2 {
		public static void main(String[] args) {
			int num1 = 10,num2 = 20;
					String	number1 = "10" 
							 , number2 = "20";
					System.out.println(num1 + num2);		//연산
					System.out.println(number1 +  number2); 		//연결***
					System.out.println(num1 + number1); 		//연결의 결과는 문자열이다!!					형변환이 아닌가
					System.out.println("제 나이는" +num1 + "살 입니다.");
					System.out.println("두 수의 합은" + (num1 +num2) +"입니다."); 			//연산이 필요한경우 ()로 묶어 먼저처리
					
		}
}

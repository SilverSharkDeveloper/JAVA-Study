package day03;

public class Casting3 {
		public static void main(String[] args) {
			//int, double, char, boolean ->기본 자료형, 원시 자료형, primitive type
			//기본 자료형을 제외한 모든 자료형 ->(클래스 타입)참조 자료형, reference type
			//String, 클래스.... ->참조 자료형
			
			//기본 자료형 -> String (클래스타입) 
			String str1 = 3 + ""; 		//빈 문자열을 이용해 문자열과 정수를 연결시켜 문자열로 만들어준다.
			String str2 = 3.0 + ""; 		//빈 문자열을 이용해 문자열과 정수를 연결시켜 문자열로 만들어준다.
			String str3 = 'a' + ""; 		//빈 문자열을 이용해 문자열과 정수를 연결시켜 문자열로 만들어준다.
			String str4 = true + ""; 		//빈 문자열을 이용해 문자열과 정수를 연결시켜 문자열로 만들어준다.
			String str5 = 3 + ""; 		//빈 문자열을 이용해 문자열과 정수를 연결시켜 문자열로 만들어준다.
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			System.out.println(str4);
			
//			String ->기본자료형
			int number1 = Integer.parseInt(str1);
			int number2 = Integer.parseInt("45");
			
			double number3 = Double.parseDouble("3.14");
			boolean isTrue = Boolean.parseBoolean("true");
			
			System.out.println(number1);
			System.out.println(number2);
			System.out.println(number3);
			System.out.println(isTrue);
			
			
		
			
		}
}

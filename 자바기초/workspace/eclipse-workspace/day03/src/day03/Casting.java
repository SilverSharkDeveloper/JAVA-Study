package day03;

public class Casting {
	public static void main(String[] args) {

		// 정수 -> 정수
		int num1 = (int) 3L; // 강제 형변환
		long num2 = 3; // 자동 형변환
		// 실수->실수
		float num3 = (float) 3.0; // 강제 형변환
		double num4 = 3.14f; // 자동 형변환

		// 정수 - >실수
		float number1 = 3l;
		double number2 = 3;

		// 실수 - > 정수   ---------------소수점 아래 데이터는 상실되고 저장
		int number3 = (int) 3.0;
		long number4 = (long) 3.14f;
		
		
	
		
		System.out.println(number4);
	}
}

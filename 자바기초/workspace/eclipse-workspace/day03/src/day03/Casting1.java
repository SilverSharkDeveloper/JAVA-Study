package day03;

public class Casting1 {
	 public static void main(String[] args) {
	
		 char ch = 65;				//	int -> char 로 형변환이 가능?
		 char ch2 = 'A' + 1;
		System.out.println(1+0.0);
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println('A' + 1);//문자는 정수로 바꿔 출력되므로 연산시 정수 + 정수로 결과값이 나옴
		System.out.println((char)('A' + 1)); //A의 유니코드 정수 + 1 의 66의 값에 해당하는 문자 B가 출력
		System.out.println(ch);
		System.out.println(ch2);
	 }
}

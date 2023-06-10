package day02;

public class PrintTest {
	public static void main(String[] args) {
		String name ="허은상";
		System.out.printf("안녕");           					    //printf()메소드는 형식에 맞는 값을 출력하고 줄바꿈이 안됨.
		System.out.printf("안녕");
		System.out.println();
		System.out.println(name);
		System.out.println("내 이름은 name입니다");
		System.out.printf("내 이름은%s입니다.",name);      //%s 는 쉼표뒤에오는 문자를 삽입.
		System.out.printf("내 수학점수는%d점\t입니다",100);  			//%d는 쉼표뒤에오는 정수를 삽입
		
		
	}
}

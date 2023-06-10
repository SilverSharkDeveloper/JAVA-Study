package publicTest;

import java.util.Scanner;

public class B extends Object{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
	
			//Math 클래스는 생성자가 priavte이라 객체생성 불가 생성자 접근자체가 안됌 퍼블릭 스태틱 메소드에 임포트없이 경로도 적어주지않아도 사용이 가능한 이유???
			//A라는 클래스를 똑같이만들었는데 이친구는 반드시 import해줘야함
		//priavate 생성자를 사용하는 이유?
		//math클래스는 java.lang 패키지안에 object클래스도 마찬가지
		//다른패키지 상속하고 싶을때 클래스 경로 알려주어야 함
		
		//Math클래스에 import 와 경로 알려주지 않아도 접근이 가능한이유!!!!
		
	}
}

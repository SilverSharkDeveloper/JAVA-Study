package exception;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			//try블록에서 오류가 발생한다면 발생한 오류객체를 받을 수 있는 참조변수를 가진 catch문 영역이 실행된다.
			sc.next();
		} catch (NullPointerException e) {
//			e.printStackTrace();
			System.out.println("야 NULL이야");
		}catch(Exception e) {
			//우리가 try에서 어떤 오류가 발생할지 전부 예상하기는 힘들다. 예상치 못한 오류가 발생할 수도 있다.
			//예상치 못한 오류를 잡기위해 Exception타입의 참조변수를 사용한다.
			//모든 예외의 조상은 Exception클래스이다.
			//즉 어떤 예외가 발생하더라도 Exception타입의 참조변수에 저장가능하다(업캐스팅)
			//Exception은 항상 맨 마지막에 예상치 못한 오류를 잡아 캐치문을 하나 추가해 예외를 처리해주기 위해 사용하거나 어떤 오류가 발생하 
			//다른 예외처리보다 먼저 사용할 수 없다. (오류가 잡히면 밑에 catch문은 실행시키지 않는데 Exception은 모든 오류를 다잡기 때문에 밑에 코드는 실행되지 않는 코드가된다.)
			System.out.println("예상치 못한 오류!");
		}
		
		System.out.println("실행 시키고 싶은 명령어");
		
	}
}

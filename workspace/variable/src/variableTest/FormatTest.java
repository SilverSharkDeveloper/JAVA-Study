package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		//서식문자
		//반드시 따옴표 안에 작성한다
		//%
//		%d : decimal 10진수 정수
//		%o : octal 8진수 정수
//		%x : hexadecimal 16진수 정수
//		%f : float 실수
//		%c : character 문자
//		%s : String 문자열
		
		String name = "한동석";
		System.out.printf("이름 : %s\n",name	);
		int age = 20;
		System.out.printf("나이 :%d 살", age);
	}
}

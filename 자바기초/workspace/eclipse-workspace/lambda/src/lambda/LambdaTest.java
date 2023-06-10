package lambda;

public class LambdaTest {
	void printHello() {
		System.out.println("안녕하세요");
	}
	/*
	 * void printHello(){ System.out.println("안녕하세요");}
	 * void () ->{ System.out.println("안녕하세요");} //이름을 없애고 ->를 추가한다.
	 * () ->{ System.out.println("안녕하세요");} //반환타입은 추론이 가능하므로 생략한다.
	 * () ->System.out.println("안녕하세요") //명령문이 1줄이면 중괄호와 세미콜론을 생략
	 * 
	 */
	int add10(int number) {
		return number + 10	;
	}
	/*
	 * int add10(int number){return number + 10;}
	 * int (int number)->{return number + 10;} //이름을 없애고 ->를 추가한다
	 * (int number)->{return number + 10;} //반환 타입은 추론이 가능하므로 생략한다.
	 * (number)->{return number + 10;} //매개변수 타입은 추론이 가능하므로 생략한다.
	 * number->{return number + 10;} //매개변수 1개라면 ()를 생략가능 (선택)
	 * number->number + 10 //중괄호와 세미콜론을 생략가능하다.(선택) ->중괄호와 세미콜론을 생략하면 리턴도 생략해야한다.
	 * 															//바디의 결과가 값이라면 자동으로 return된다.
	 * 															//단, 바디에 식 1개만 있어야한다.
	 * 
	 * 
	 * 
	 * 
	 * 매개변수가 2개 이상일때 () 생략 불가
	 * 명령문이 2개이상일 때 {} ; 생략불가 -> return값이 있다면 생략 불가
	 * 반환할 값이 존재한다면 return 사용하기
	 */
	int addNumber(int num1, int num2) {
		System.out.println(num1 + "+ " + num2 + "=" + (num1+num2));
		return num1+ num2;
	}
//(num1,num2) -> {
//System.out.println(num1 + "+ " + num2 + "=" + (num1+num2));
//	return num1+ num2;
//}
}

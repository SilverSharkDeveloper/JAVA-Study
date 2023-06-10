package day02;

public class EscapeCharacter {
	public static void main(String[] args) {
		//제어문자  따옴표 안에서 사용 (문자열) \로 시작
		
		System.out.print("안녕\n");               								//\n은 줄바꿈
		System.out.print("하세요\n");
		System.out.println("반갑\t습니다.");									//\t는 들여쓰기 
		System.out.println("나는 \"ㅎㅇ\"라고 말했다");					//\"는 쌍따옴표 표현
		System.out.println("제어문자는\\로 시작한다.");							//\\는 \를 표현
		System.out.println("하이 \t하이");
		
	}
}

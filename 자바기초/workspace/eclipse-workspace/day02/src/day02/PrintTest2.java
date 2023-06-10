package day02;

public class PrintTest2 {
	public static void main(String[] args) {
		String name = "허은상";
		System.out.printf("%d\n", 256);															//%d 는 정수표현
		System.out.printf("%s\n",name);														//%s 는 문자열 표현 쉼표 뒤에 ""로 표현
		System.out.printf("내 수학 점수는 %10d점 입니다.\n",100);			//%10d는 정수에 자릿수를 10자리로 만드는것 100은 뒤에 3자리만 차지
		System.out.printf("내 평균 점수는 %10.3f점 입니다\n",88.15555);	//f 소수점 왼쪽의 수는 총 숫자의 갯수, 소수점 오른쪽 수는
																																		//그 숫자만큼의 소수점아래의 수까지 표현  마지막자리는 반올림
		System.out.printf("나의 학점은 %c입니다.\n",'a');								//%c 는 문자 표현 쉼표뒤에 ''로 표현
		System.out.printf("%s\t%d\n","안녕하세여",500);
		System.out.printf("%s","안녕");
		}
}

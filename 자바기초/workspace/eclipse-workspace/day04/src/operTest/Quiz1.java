package operTest;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	String quizMsg = "다음중 음식이 아닌 것은?\n"
			+ "1.피자\n"
			+ "2.케이크\n"
			+ "3.불고기\n"
			+ "4.자바\n"
			+ "선택>>";
	System.out.println(quizMsg);
	 String resultMsg = null;
	 int choice = 0; final int ANSWER=4; 	//final을 쓰면 한번 할당된 변수가 절대 변하지않는다.  //알아보기쉽게 대문자로 변수명을 설정, 띄으쓰고 싶을때 언더바
	choice =  sc.nextInt(); 
//	final String USER_NAME = null; // 카멜표기법 못쓰니 언더바 사용
	
	 resultMsg = choice == ANSWER? "정답!" : "오답!";
	 System.out.println(resultMsg);
	 
			 
			
	
}
}

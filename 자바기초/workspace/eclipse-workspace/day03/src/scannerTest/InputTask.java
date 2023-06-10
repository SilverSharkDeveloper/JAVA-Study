package scannerTest;

import java.util.Scanner;

/*
 * 이름을 입력하세여 : 000
 * 출력 결과
 * 000님 안녕하세여
 */
public class InputTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
	
		String input = sc.next();							//sc.next()는 띄어쓰기전까지만 가져옴
		
		System.out.println(input + "님 안녕하세여");
		
		String input2 = sc.nextLine();    //한줄을 다가져옴
		System.out.println(input2);
	}
}

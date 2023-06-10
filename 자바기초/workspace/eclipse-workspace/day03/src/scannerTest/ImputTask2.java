package scannerTest;

import java.util.Scanner;

public class ImputTask2 {
	public static void main(String[] args) {
		/*
		 * 이름을 입력해주세요 : 000
		 * 000님 안녕하세요
		 * 000님 안녕히가세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 :");			///줄바꿈이 없음
		String input = sc.next();

		System.out.println(input + "님 안녕하세요.");
		System.out.println(input + "님 안녕히가세요.");

	}
}

package day05;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = null;
		String msg = "1부터 4까지 정수 입력 : ";

		System.out.println(msg);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
		case 3:
			result = "홀수";
			break;

		case 2:
		case 4:

			result = "짝수";
			break;

		default:
			result = "1~4까지만 입력해주세요";
		}
		System.out.println(result);

		choice = sc.nextInt();
		if (choice % 2 == 0) {
			result = "짝수";
		} else if (choice % 2 == 1) {
			result = "홀수";
		}

		System.out.println(result);
	}

}

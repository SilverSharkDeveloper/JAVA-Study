package day04;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		/*
		 * 1.변수 만들기 ( int money, count, change)
		 * 2.출력한다. (금앱입력:)
		 * 3.입력받아서 money에 저장
		 * 4.연산한다
		 * 	4-1 money를 30
		 */
	
	Scanner sc = new Scanner(System.in);
	int money = 0, count =0, change = 0;
	System.out.print("금앱을 입력해주세요 :");
	money = sc.nextInt();
	count = money/300; change = money%300;
	System.out.println("부를 수 있는 곡은 :" + count +"잔돈 : "+  change + "원 입니다." );
	
	
	
	}
}

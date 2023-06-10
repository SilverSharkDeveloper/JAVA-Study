package scannerTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
//	자료형		변수명		=	값;
//		String str = "aaaa";	
	System.out.print("입력하세여 : ");   //입력만 받음
		String input = sc.next();
		System.out.println(input);
	}
}

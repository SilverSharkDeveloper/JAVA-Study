package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String message = null;
		System.out.println("메세지:");
		message = sc.nextLine();
		if(message.equals("바보")) {
			try {
				throw new BadWordException("비속어는 사용할 수 없습니다.");
			} catch (BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");
				}
			}
		}
		
}
}
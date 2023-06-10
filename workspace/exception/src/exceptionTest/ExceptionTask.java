package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		//5개의 정수만 입력 받기
		//무한 입력 상태로 구현
		//q 입력시 나가기
		//각 정수는 배열에 담기
		//if문은 딱 한번만 사용하기
		
		Scanner sc =  new Scanner(System.in);
		int [] ar = new int[5];
		String input = "";
		int count = 0;
		
		//NumberFormatException ->숫자타입에 다른값 들어갈때 발생
		
		while(true) {
			try {
				input = sc.next();
				ar[count] = Integer.parseInt(input);
				count++;
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("5개 모두 입력했습니다");
				for (int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}
				break;
				
			}catch (Exception e) {
				if(input.equals("q")) {
					System.out.println("q를 눌러 종료합니다");
					break;
				}
			}
			
		
	}
		
					
		

	}
}

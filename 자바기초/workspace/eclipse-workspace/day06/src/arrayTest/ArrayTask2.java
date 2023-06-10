package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
	//5칸 짜리 사물함의 비밀번호를 각각 배열에 저장한다.
	//사용자에게 이용할 사물함 번호를 묻는다.
	//비밀번호를 입력받아 확인한다.
	//일치/불일치
		
		int [] ar = new int[5];
		String msg = "번 사물함의 비밀번호 설정>>";
		String msg2 = "이용할 사물함 번호 입력";
		String msg3 = "비밀번호 입력";
		String result = null;
		int choice = 0, inputPw =0 ;
		
		for(int i = 0 ; i<ar.length; i++) {
			System.out.print((i+1) +msg);
			ar[i] = sc.nextInt() ;
			
		}
		System.out.println(msg2);
	 choice =sc.nextInt();
	 
	 System.out.println(msg3);
	 inputPw = sc.nextInt();
	 
	 if(ar[choice -1]==inputPw) {
		 result = "일치";
		 
	 }else {
		 result = "불일치";
	 }
	 System.out.println(result);
	}
}

package methodTask;

import java.util.Scanner;

public class LockerTask {
	public static void main(String[] args) {
//      1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다.
//      2. 사용자에게 이용할 사물함 번호를 묻는다.
//      3. 비밀번호를 입력받아 확인한다.
//      4. 일치/불일치 를 출력한다.
		Scanner sc = new Scanner(System.in);
		String choiceMsg = "이용할 사물함 번호 입력 >> ";
		String inputMsg = "비밀번호를 입력하세요 >> ";
		String result = null;
		int choice = 0, inputPw = 0;
		LockerTask lt = new LockerTask();

		int[] arPw = lt.setLockerPw(3, sc);

		

		System.out.print(choiceMsg);
		choice = sc.nextInt();

		if (choice > arPw.length) {
			System.out.println("안돼");
		} else {
			System.out.print(inputMsg);
			inputPw = sc.nextInt();

			result = lt.checkLockerPw(arPw[choice - 1], inputPw);
			System.out.println(result);
		}
	}

	int[] setLockerPw(int length, Scanner sc) {
		int[] arPw = new int[length];
		String mainMsg = "번 사물함의 비밀번호 설정 >> ";
		for (int i = 0; i < arPw.length; i++) {
			System.out.print(i + 1 + mainMsg);
			arPw[i] = sc.nextInt();
		}
		return arPw;
	}

	String checkLockerPw(int lockerPw, int inputPw) {
	   String result = null;
	   if(lockerPw == inputPw) {
		   result = "비밀번호가 일치합니다";
		   
	   }else {
		   result = "비밀번호가 일치하지 않습니다";
	   }
   return result ;
   }
}
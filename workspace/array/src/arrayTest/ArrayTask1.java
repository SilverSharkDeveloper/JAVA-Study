package arrayTest;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
//      각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
	      
//      btn1 : 회원가입 페이지
//      btn2 : 로그인 페이지
//      btn3 : 마이 페이지
//      btn4 : 로그아웃
      
//      회원가입 -> 로그인 -> 마이 페이지
//      위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를 경우, 이전 단계에 대한 메세지를 출력해준다.
//      예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
//          회원가입에 성공했어도, 로그인을 안하고 마이페이지를 선택하면 메세지는 이전 단계에 대한 메세지가 출력되지만
//         다시 회원가입부터 진행해야 한다.
      
//      알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//      예)   회원가입 클릭 시, 회원가입 성공,로그인 클릭시 로그인 성공,로그아웃시 로그아웃 성공
//         마이 페이지 클릭 시, 본인 이름과 나이 출력
		Scanner sc = new Scanner(System.in);
		String strChoice [] = {"회원가입 성공","로그인 성공","마이페이지","로그아웃"};
	    String str1Choice [] = {"회원가입 먼저 해주세요", "로그인 먼저 해주세요", " 마이페이지 먼저 들어가세요","로그아웃 실패"};
		int [] arChoice = new int [4];
		int temp = 0 ;
	
		while(true) {
		
		for (int i = 0; i < arChoice.length; i++) {
			System.out.println("1:회원가입\n2:로그인\n3:마이페이지\n4: 로그아웃");
			arChoice[i]= sc.nextInt();
			if(i==0) {
				temp = arChoice[i];
			}else {
				temp = arChoice[i] - arChoice[i-1];
			}
		switch(i) {
		case 0 : 
			if(temp!=1) {
				System.out.println(str1Choice[arChoice[i]-1]);
			}else {
				System.out.println(strChoice[arChoice[i]-1]);
			}
			break;
		case 1:
			if(temp!=1) {
				System.out.println(str1Choice[arChoice[i]-1]);
			}else {
				System.out.println(strChoice[arChoice[i]-1]);
			}
			break;
		case 2:
			if(temp!=1) {
				System.out.println(str1Choice[arChoice[i]-1]);
			}else {
				System.out.println(strChoice[arChoice[i]-1]);
			}
			break;
		case 3 :
			if(temp!=1) {
				System.out.println(str1Choice[arChoice[i]-1]);
			}else {
				System.out.println(strChoice[arChoice[i]-1]);
			}
			break;
		}
			if(temp!=1) {break;}
		}
		
	}
		
	}
}
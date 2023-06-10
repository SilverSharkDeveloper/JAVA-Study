package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname = null, lastname= null;
	
		
		//ctrl shif o ->자동 임포트 안쓰는거도 지워줌
	
		//초기값 : 아직 어떤 값을 넣을 지 모를 때 넣는 값
		//int  = 0; double =0.0 char = ' ', String = null;
		
		System.out.println("이름 : ");
//		firstname= sc.next();
//		lastname =sc.next();
//		System.out.println(firstname + lastname + "님");
		
		String name = sc.nextLine();
		System.out.println(name);
	}
}

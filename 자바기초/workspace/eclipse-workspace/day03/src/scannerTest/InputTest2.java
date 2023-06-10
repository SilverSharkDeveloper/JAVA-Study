package scannerTest;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "좋아하는 숫자 :" , str2 = "좋아하는 동물 : ";
		String animal = null;
		int number = 0;
		System.out.print(str1);
		number = sc.nextInt();			
													//next, nextint, next double 은 임시저장소에서 엔터는 가져오지 않는다. 
																			//그다음 nextLine 을 쓸경우 남아있는 엔터를 가져와 입력받지 못하므로 중간에 엔터를 소모시켜줘야한다.
		System.out.print(str2);
		animal = sc.nextLine();
		
		System.out.println("내가 좋아하는 숫자는 " + number + "이고, 내가 좋아하는 동물은" + animal + "이다.");
	}
}

package controllStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
	//브론즈
//			for (int i = 0; i < 100; i++) {
//				System.out.println(i+1);
//			}
//			
//			for (int i = 0; i < 100; i++) {
//				System.out.println(100-i);
//			}
//			
//			for (int i = 0; i < 50; i+=2) {
//				System.out.println((i+2)*2);
//			}
//		
			
		//실버
//		int total = 0;
//		for (int i = 0; i < 10; i++) {
//			total += i+1;
//		}
//		System.out.println(total);
//		
		
//		Scanner sc =new Scanner(System.in);
//		int num = sc.nextInt();
//		int numTotal = 0;
//		for (int i = 0; i < num; i++) {
//			numTotal += i+1;
//		}
//		System.out.println(numTotal);
//		
		
		//골드
		for (int i = 0; i < 6; i++) {
			System.out.println((char)(i+65));
		}
		
		
		for (int i = 0; i < 5; i++) {
			if(i>1) {
				System.out.println((char)(i+66));
			}else {
				System.out.println((char)(i+65));
			}
			
		}
		
		
		//다이아
		//012301230123출력
		//aBcDe...Z출력
		
		for (int i = 0; i <12 ; i++) {
			System.out.println(i%4);
		}
	
		
		String alpha = "";
		for (int i = 0; i < 26; i++) {
			if(i%2==0) {
				alpha += (char)(i+97);
			}else {
				alpha +=(char)(i+65);
			}
		}
		System.out.println(alpha);
	}
}

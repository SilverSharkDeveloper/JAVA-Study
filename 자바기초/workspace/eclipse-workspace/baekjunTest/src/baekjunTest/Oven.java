package baekjunTest;

import java.util.Scanner;

public class Oven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ten= 0, one = 0, time = 0 ;
		String msg = "현재시각",	msg1 = "조리시간", msg2 = "완료시간:", result = null;
		
		System.out.println(msg);
		ten= sc.nextInt(); 
		one = sc.nextInt();
		System.out.println(msg1);
		time = sc.nextInt();
		
		if((one + time)<60){
				result = ten + ":" + (one + time);
				
		}else if((((one + time)/60)+ten)>24&&(one + time)>60) {
			result = (((one + time)/60)+ten)-24	+ ":" + (one + time)%60 ;
			
		}else {
			result = (((one + time)/60)+ten)	+ ":" + (one + time)%60 ;
		}
		System.out.println(msg2 + result);
	}
}

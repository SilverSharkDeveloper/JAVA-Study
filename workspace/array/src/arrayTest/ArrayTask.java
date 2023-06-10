package arrayTest;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		//브론즈
		//1~10까지 배열에 담고 출력
		//10~1까지 중 짝수만 배열에 담고 출력
		//1~100까지 배열에 담은 후 홀수만 출력
		int [] arData = null;
	
//		arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]= i+1;
//			System.out.println(arData[i]);
//		}
//		arData = new int[5]; 
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (10-(i*2));
//			System.out.println(arData[i]);
//		}
//		arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			if(arData[i]%2 ==1) {
//				System.out.println(arData[i]);
//			}
//		}
		
		//실버
		//1~100까지 배열에 담은 후 짝수의 합 출력
		//A~F까지 배열에 담고 출력
		//A~F까지 중 C제외하고 배열에 담은 후 출력
//		arData = new int[100];
//		int total = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i]= i+1;
//			if(arData[i]%2 ==0) {
//				total+= arData[i];
//			}
//		}
//			System.out.println(total);
//		
//		char [] arChar = new char[6];
//		for (int i = 0; i < arChar.length; i++) {
//			arChar[i] = (char)(i+65);
//			System.out.println(arChar[i]);
//		}
//		arChar = new char[5];
//		for (int i = 0; i < arChar.length; i++) {
//			if(i>1) {
//				arChar[i] = (char)(i+66);
//			}else {
//				arChar[i] = (char)(i+65);
//			}
//			System.out.println(arChar);
//		}
		
	
		//골드
		//5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		arData = new int[5];
//		String msg = "5개의 정수를 입력해주세요";
//		int min = 0, max = 0;
		Scanner sc =new Scanner(System.in);
//		System.out.println(msg);
//		
//		for (int i = 0; i < arData.length; i++) {
//		System.out.println(i+1 +"번째 정수: ");
//		arData[i] = sc.nextInt();
//		}
//	
//		min = arData[0];
//		max = arData[0];
//		for (int i = 1; i < arData.length; i++) {
//		min =min<arData[i] ? min : arData[i];
//		max =max>arData[i] ? max : arData[i];
//		}
//		
//		System.out.println("최댓값 :" + max+ "\n최솟값 : " + min);
//	
		
		//다이아
		//사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		String msg2 = "몇 칸 짜리 배열을 만드시겠나요?";
		String msg3 = "입력하신 숫자 만큼 정수를 차례대로 입력해 주세요";
		int total = 0;
		double avg =0.0;
		System.out.println(msg2);
		arData = new int [sc.nextInt()];                          //입력받은 수의 길이를 가진 배열 생성
		System.out.println(msg3);
		for (int i = 0; i < arData.length; i++) {                //정수를 입력받고 total에 합 구하기
			arData[i]= sc.nextInt();
			total += arData[i];
		}
		avg =(double)total/arData.length; 							//avg에 total 에 배열에 길이 만큼 나눈 평균값을 double로 형변환해 계산해 담기
		System.out.println("평균 : " + avg);
		
	}
}

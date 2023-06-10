package arrayTest;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		int [] ar = new int[100];
		for(int i = 0 ; i<ar.length; i++) {
			ar[i] = 100 - i;
			System.out.println(ar[i]);
			
		}
		int total = 0;
			int [] ar2 = new int[10] ;
			for(int i = 0 ; i<ar2.length; i++) {
				
				ar2[i] = i+1;
				total += ar2[i];
			
				
			
		}
			System.out.println(total);
			
			int [] ar3 = new int[3]; int result = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < ar3.length; i++) {
			ar3[i] = sc.nextInt()	;
			result += ar3[i];
		}
		
		
		System.out.println(result/3.0);
																									//0123401234출력 	%5하면 구하기더 쉬움
		int[]ar4 = new int[10];
		for(int i = 0; i<ar4.length; i++) {
			if (i<5) {ar4[i] = i ;
			}
			else {ar4[i] = i-5;
			}
			
		System.out.println(ar4[i]);
		}
	
		
	
																													//5개정수받아서 최대값, 최솟값 구하기
		int[] ar5 = new int [5];	
		for(int i = 0 ; i<ar5.length; i++) {
			ar5[i] = sc.nextInt();
		}
		int max = 0, min = 0;
		max=ar5[0];	min=ar5[0];
		for(int i = 1 ; i<ar5.length ; i++) {
			if(max<ar5[i]) {
				max = ar5[i];
				
			}else if (min> ar5[i]) {
				min=ar5[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}

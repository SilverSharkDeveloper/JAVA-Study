package baekjunTest;

import java.util.Scanner;

public class Dice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a , b, c =0;
	String msg = "주사위를 굴려랏";
	int result = 0;
	System.out.println(msg);
	a = sc.nextInt() ;
	b = sc.nextInt() ;
	c = sc.nextInt() ;
	
	if(a==b&&b==c) {
		result = (10000 +	a*1000);
		
	}else if(a==b) {
		result = 1000 + a*100;
	}else if(a==c) {
		result = 1000 + a*100;
	}else if (b==c) {
		result = 1000 + b*100;
	}else if (a>b&&a>c) {
		result = 100*a;
	}else if (b>a&&b>c) {
		result = 100*b;
		
	}else {
		result = 100*c;
	}
	
	System.out.println(result);
}
}

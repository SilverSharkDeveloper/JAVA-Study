package baekjunTest;

import java.util.Scanner;

public class Clock {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ten = 0, one = 0;
	String result = null;
	String msg = "몇시", msg1 = "몇분";
	System.out.println(msg);
	ten = sc.nextInt();
	System.out.println(msg1);
	one = sc.nextInt();

	if (one >= 45) {
		result = ten + "\t" + (one - 45);
	} else if (ten > 0 && one < 45) {
		result = (ten - 1) + "\t" + (one + 15);
	} else {
		result = 23 + "\t" + (one + 15);
	}
	System.out.println(result);
}
}

package baekjunTest;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		for (int i = 0; i < input; ++i) {
			for (int k = 0; k < input - (i + 1); ++k) {
				System.out.print("   ");																	//정확히 별칸만큼 어떻게 띄지
			}
			for (int j = 0; j < i + 1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

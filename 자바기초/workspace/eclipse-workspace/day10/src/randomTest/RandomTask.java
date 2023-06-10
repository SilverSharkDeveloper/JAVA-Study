package randomTest;

import java.util.Random;
import java.util.Scanner;

class Enhance {
	static boolean[] arChance = { true, true, true, false, false, false, false, false, false, false };
	String weapone;
	int cnt;

	public Enhance(String weapone) {
		this.weapone = weapone;
	}

	void start() {
		Random r = new Random();
		int index = r.nextInt(10);

		if (arChance[index]) {
			cnt++;
			System.out.println("강화에 성공 했습니다");

		} else {
			cnt = 0;
			System.out.println("강화에 실패했습니다");
		}
	}

	void prinInfo() {
		System.out.println(weapone + "+" + cnt);
	}

}

public class RandomTask {
	public static void main(String[] args) {
		Enhance e = new Enhance("몽둥이");
		String msg = "1.강화 시작 \n2. 종료\n"
				+ "입력>>";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String input = null;
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.print(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 : e.start();
							e.prinInfo();
				break;
			case 2 :System.out.println("종료하시려면 \"종료\"라고 입력하세요 >>");
			input = sc.next();
			if(input.equals("종료")) {
				isTrue = false;
			}
				break;
			default : 
				System.out.println("잘못 입력했어요");
			}
		
		}
	}
}

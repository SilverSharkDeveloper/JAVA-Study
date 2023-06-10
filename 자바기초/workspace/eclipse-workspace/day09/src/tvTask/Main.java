package tvTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String msg = "1. 전원 버튼\n" + "2. 채널 올리기\n" + "3. 채널 내리기\n" + "입력 >>";
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv("yellow", 60, 20000000);
		int choice = 0;

		while (true) {
			System.out.print(msg);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (tv.power) {
					System.out.println("전원 끄기!");
				} else {
					System.out.println("전원 켜기!");
				}
				tv.powerOnOff();
				break;
			case 2:
				if (tv.power) {
					System.out.println("채널 : " + tv.chUp());
				}
				break;
			case 3:
				if (tv.power && tv.channel > 1) {
					System.out.println("채널 : " + tv.chDwon());
				}

				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}

	}
}

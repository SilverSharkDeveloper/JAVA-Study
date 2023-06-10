package day05;

public class SwitchTest {
	public static void main(String[] args) {
		int number = 5;

		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}

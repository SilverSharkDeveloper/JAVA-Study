package day07;

public class MethodTask2 {
	public static void main(String[] args) {
		MethodTask2 mt2 = new MethodTask2();
		System.out.println(mt2.changeSign(-10));

		System.out.println(mt2.changeNumber(50));

		mt2.printName(10, "허은상");
	}

	int changeSign(int num) {
		return -num;
	}

	int changeNumber(int num1) {
		if (num1 <= 10) {
			return 1;
		} else {
			return 100;
		}

	}

	void printName(int num, String name) {
		for (int i = 0; i < num; ++i) {
			System.out.println(name);
		}
	}
}

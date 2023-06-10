package day07;

public class Test3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		String text = "바보";
		t.printText(text);
		t.sum(3, 5);
		System.out.println(t.method1());
	}

	void printText(String msg) {
		System.out.println(msg);
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	int method1() {
		return 3;
	}
}

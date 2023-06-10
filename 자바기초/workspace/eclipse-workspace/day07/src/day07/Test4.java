package day07;

public class Test4 {
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.printTen();
		t.printInt(10);
		System.out.println(t.returnTen());
	System.out.println(t.addTen(10));
		
	}

	void printTen() {
		System.out.println(10); // 매개변수 x 반환 x
	}

	void printInt(int a) {
		System.out.println(a); // 매개변수 0 반환 x
	}
	int returnTen() {
		return 10 ;				//매개변수 x 반환 0
	}
	int addTen(int a) {
		return a+10;			//매개변수 0 반환 0
	}
}

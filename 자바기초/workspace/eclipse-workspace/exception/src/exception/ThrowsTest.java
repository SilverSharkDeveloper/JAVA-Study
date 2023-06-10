package exception;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static void method() throws InterruptedException{
		for(int i = 0 ; i<10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}

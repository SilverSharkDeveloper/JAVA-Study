package api;

public class Test {
	public static void main(String[] args) {
		TestApi ta = new TestApi();
		
		try {
			ta.div(10, 3);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

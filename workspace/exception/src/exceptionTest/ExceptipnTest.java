package exceptionTest;

public class ExceptipnTest {
	public static void main(String[] args) {
		
		int[] arData = new int[5];
		
		try {
			arData[5] = 10;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("반드시 실행 되어야 하는 문장");
		
		
	}
}

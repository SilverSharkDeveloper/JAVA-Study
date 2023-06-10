package day07;

public class Test2 {
		public static void main(String[] args) {
			Test2 t = new Test2();
			
			System.out.println("메인 메소드의 코드1");
			t.method();
			method();
			System.out.println("메인 메소드의 코드2");
			
		}
		
		
		
	static 	void method() {
			System.out.println("메소드의 코드");
		}
}

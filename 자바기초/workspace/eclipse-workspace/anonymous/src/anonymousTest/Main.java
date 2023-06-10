package anonymousTest;

public class Main {
public static void main(String[] args) {
	ClassA ca = new ClassA();
	ca.printData();
	
	InterA a = new InterA() {
		
		@Override
		public void printData() {
			System.out.println("익명 클랙스 객체");
		}
	};
	
}
}

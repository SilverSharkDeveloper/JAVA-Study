package classTest;

public class Main {
	public static void main(String[] args) {
		User u1 = new User("허은상", "010-8012-8867", 30000,30);
		User u2 = new User("한동석", "010-8032-8827", 20000,20);
		
		Product p1 = new Product("바지", 3000, 10);
		Product p2 = new Product("모자", 1000, 5);
		
		p1.sale(u1);
		System.out.println(u1.count);
		
	
	}
}

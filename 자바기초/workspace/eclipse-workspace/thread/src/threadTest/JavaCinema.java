package threadTest;

public class JavaCinema {
public static void main(String[] args) {
	
	Movie m1 = new Movie();
	
	Thread t1= new Thread(m1, "탑건");
			Thread t2= new Thread(m1, "아바타");
			Thread t3= new Thread(m1, "스파이더맨");
			
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t2.start();
			t3.start();
}
}

package thread;

public class ThreadTest {
		public static void main(String[] args) {
//			Thread1 t1 = new Thread1("1");
//			Thread1 t2 = new Thread1("2");
//			t1.start();
//			t2.start();
			
			Thread2 mineral = new Thread2();
			
			Thread t1 = new Thread(mineral,"?");
			Thread t2 = new Thread(mineral,"!");
			
			t1.start();
			t2.start();
			
			
		}
}

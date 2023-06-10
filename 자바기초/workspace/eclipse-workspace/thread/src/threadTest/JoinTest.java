package threadTest;

public class JoinTest {
	public static void main(String[] args) {
		Runnable r1 = () ->{
			String name = Thread.currentThread().getName();
			for(int i = 0 ; i < 10; i++) {
				System.out.println(name);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + "쓰레드 종료");
		};
		
		Thread t1 = new Thread(r1,"t1");
				Thread t2 = new Thread(r1,"t2");
				t1.start();
				t2.start();
				
				try {
					t1.join(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				for(int i = 0 ; i <10 ; i++) {
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("메인쓰레드 종료");
	}
}

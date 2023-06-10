package threadTest;

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		
		//Runnable 인터페이스를 구현하면 start()가 없다.
		//start()는 Thread에 있다.
		Thread t1 = new Thread(mt1,"A");
		Thread t2 = new Thread(mt2, "B");
		
		t1.start();
		t2.start();
		
		
		//Runnable인터페이스는 함수형 인터페이스이다.
		//람다식을 활용할 수 있다.
		
		Runnable r1 = ()	-> {
			for(int i = 0 ; i <10 ; i ++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread test =new Thread(r1,"C");
		test.start();
		
		Thread t3 = new Thread(()->{
			for(int i = 0 ; i <10 ; i ++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"D"	);
		t3.start();
	}
}

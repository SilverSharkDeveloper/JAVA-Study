package threadTest;

public class ThreadTest {
public static void main(String[] args) {
	MyThread t1 = new MyThread("#");
	MyThread t2 = new MyThread("*");
	
	//멀티쓰레드라고 생각할 수 있지만 단일로 실행된다.
	//단순히 run()에 재정의한 코드를 실행시킨 것이다.
	
//	t1.run();
//	t2.run();
	
	t1.start();
	t2.start();
	
	for(int i = 0 ;i<10 ; i++) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("main쓰레드 종료!");
   }
}

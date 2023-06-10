package synchronization;

class A implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (Thread.interrupted()) {
				System.out.println("인터럽트 발생");
				break;
			}
			System.out.println(i);
		
		}
	}
}

public class InterruptedTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		t1.start();

		t1.interrupt();
	}
}

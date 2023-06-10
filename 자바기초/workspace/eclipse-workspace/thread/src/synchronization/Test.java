package synchronization;

public class Test implements Runnable{
	private int number;

	public Test() {
		super();
		this.number = 100;
		
	 
	}
	@Override
	public void run() {
			for(int i = 0 ; i < 5 ; i++) {
				sub(10);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	public void sub(int number) {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			this.number -= number;
		}
		System.out.println(name + ": -" + number);
		System.out.println("현재 number:"+ this.number);
	}
//	public synchronized void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + ": -" + number);
//		System.out.println("현재 number:"+ this.number);
//	}
}

package threadTest;

public class MyThread {
	
	
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"상영중");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "끝!");
		};
		
		Thread musical = new Thread(r1,"뮤지컬");
		Thread cats = new Thread(r1,"캣츠");
		Thread dogs= new Thread(r1,"도그즈");
		
		musical.start();
		try {
			musical.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cats.start();
		dogs.start();
		
		
	}
}

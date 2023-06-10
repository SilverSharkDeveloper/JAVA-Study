package threadTask;

public class Animal {
	public void makeSound(Runnable runnable) {
		Thread[] threads = null;
		threads = new Thread[3];
		
		
		
		Thread[] animals = {new Thread(runnable,"어흥"),
				new Thread(runnable,"멍멍"),
				new Thread(runnable,"냐옹")
		};
		
//		Thread horang = new Thread(runnable,"호랑이");
//		Thread saza = new Thread(runnable,"사자");
//		Thread mal = new Thread(runnable,"말");
//		
//		threads[0] = horang;
//		threads[1] = saza;
//		threads[2] = mal;
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = animals[i];
			threads[i].start();
			if(i==1) {
				try {
					threads[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

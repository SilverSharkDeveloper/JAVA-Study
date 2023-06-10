package threadTask;

public class Zoo {
	public static void main(String[] args) {
		Runnable cry = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Animal animal = new Animal();
		animal.makeSound(cry);
		
		
		
	}
}

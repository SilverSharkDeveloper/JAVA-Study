package codingTest;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		
		Thread [] threads = new Thread[3];
		Scanner sc = new Scanner(System.in);
	
		int [] order = new int[3];
		for (int i = 0; i < order.length; i++) {
			order[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(getOrder(order[i]),"Thread"+(i+1));
			threads[i].start();
		}
		
		
	}
	static Runnable getOrder(int num) {
		ThreadTask t = new ThreadTask();
		switch(num) {
		case 1 : return () -> t.printFirst(()->System.out.println(Thread.currentThread().getName() + ": First"));
		case 2 :return () -> t.printSecond(()->System.out.println(Thread.currentThread().getName() + ": Second"));
		case 3 :return () -> t.printThird(()->System.out.println(Thread.currentThread().getName() + ": Third"));
		default : return null;
		}
	}
}







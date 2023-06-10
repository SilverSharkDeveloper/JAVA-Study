package threadTest;

import java.util.Scanner;

public class Main {
/*3개의 쓰레드를 생성하고 실행시킨다.
 * run()재정의는 ThreadTask.java에서 한다.
 * 각 쓰레드의 이름을 A,B,C로 사용자에게 입력받는다.
 * 각 쓰레드는 사용자가 입력한 순서대로 실행된다.
 * 
 * 실행시키면 각각의 이름을 출력한다.
 * printA(), printB(), printC() 메소드를 반드시 사용한다.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Thread[] arThread = new Thread[3];
		
		System.out.println("입력>>");
		for(int i = 0 ; i<arThread.length; i++) {
			String temp = sc.next();
			arThread[i] = new Thread(new ThreadTask(),temp);
		}
		for(int i = 0; i<arThread.length; i++)	{
			arThread[i].start();
			try {
				arThread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

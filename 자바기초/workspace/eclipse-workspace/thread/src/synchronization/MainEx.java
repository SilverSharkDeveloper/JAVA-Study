package synchronization;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainEx {
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		Thread t1 = new Thread(te);
		int choice= 0 ;
//		Scanner sc = new Scanner(System.in);
		String[] btn = {"-1","종료"};
		t1.start();
		
		while(true) {
//			choice = sc.nextInt();
			choice = JOptionPane.showOptionDialog(null, "", "숫자놀이", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, btn, null);
			
			if(choice == 0) {
				te.user();
			}else {
				//쓰레드가 멈췄을 때 interrupted exception 발생시킨다.
//				t1.interrupt();
				System.exit(0);
				break;
			}
		}
	}
}

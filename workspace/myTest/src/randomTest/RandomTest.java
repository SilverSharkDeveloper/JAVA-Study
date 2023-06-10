package randomTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(Integer.parseInt((r.nextInt(9)+1) +""+r.nextInt(100000)));
		
		System.out.println(getAccount());
	}
	
	static	int getAccount() {
		Random r = new Random();
		String tempAccount = "" + (r.nextInt(9)+1);
		for (int i = 0; i < 5; i++) {
			tempAccount += r.nextInt(10);
		}
		return Integer.parseInt(tempAccount);
	}
}


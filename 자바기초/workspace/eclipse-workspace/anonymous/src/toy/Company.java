package toy;

import java.util.Random;

public class Company {
	String branch;
	public Company(String branch) {
		this.branch = branch;
	}
	
	public void register(Toy toy) {
		String[] list = toy.speakList();
		Random r = new Random();
		int index = r.nextInt(list.length);
		
		System.out.println(branch + "지점");
		for(int i = 0 ; i < list.length ; i ++) {
			System.out.println(i+1 + "." + list[i]);
		}
		System.out.println("================");
		toy.pushBtn(list[index]);
	}
}

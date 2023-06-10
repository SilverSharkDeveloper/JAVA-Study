package forTest;

public class ForTask2 {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 0; i<100; i++) {
			total += i+1;
		}
		System.out.println(total);
		int total2 = 0;
		for(int i = 0; i<100; i++) {
			if((i+1)%2 ==1) 
				continue;
		total2 += i+1;
		}
		System.out.println(total2);
	}
}

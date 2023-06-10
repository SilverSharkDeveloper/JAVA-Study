package day07;

public class MethodTask1 {
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.printName("허은상");
		
		
		System.out.println(mt.getTotal(50,160));
		
		int[] ar = {1,2,3,4,5,6,1,3,4,5,6};
		System.out.println(mt.getTotal3(ar));
		
		
	}
	
	void printName (String name) {
		for(int i = 0; i<5; ++i) {
			System.out.println((i+1) +"." + name);
		}
	}
	
	int getTotal (int first, int finish) {
		int total = 0;
		for(int i =first ; i<finish ;++i) {
			total+= i+1;
		} return total ;
	}
	
	int getTotal3(int[] arNum) {
		int total = 0;
		for(int i = 0; i<arNum.length; ++i) {
			total += arNum[i];
		}
		return total;
	}
}

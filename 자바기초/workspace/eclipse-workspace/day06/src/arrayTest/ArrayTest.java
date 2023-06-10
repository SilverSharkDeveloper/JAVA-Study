package arrayTest;

public class ArrayTest {
		public static void main(String[] args) {
			int []ar = {1,2,3,4,5};
			System.out.println(ar[0]);
			ar[0] = 10;
			System.out.println(ar[0]);
			
			int[]ar2 = new int[5];															
			System.out.println(ar2[0]);
			
			int[]ar3 = null;		//null = 주소값의 default 
			ar3 = new int[5];
			 
		}
		
}

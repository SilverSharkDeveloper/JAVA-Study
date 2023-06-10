package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		FunctionalInter f1 = new FunctionalInter() {
//			
//			@Override
//			public int sum(int a, int b) {
//				return a+b;
//			}
//		};
		
		
//		System.out.println(f1.sum(1, 3));
		
		
//		FunctionalInter f2 = (a,b) -> a+b;
//		FunctionalInter f3 = (a,b) -> a*b;		
		FunctionalInter f4 = (a,b) -> {
			System.out.println(a+b);
			return new String [] {"S","b"};
		};
		
//		System.out.println(f2.sum(3, 4));
//		System.out.println(f3.sum(3, 4));
		System.out.println(f4.sum(4, 5));
	}
}

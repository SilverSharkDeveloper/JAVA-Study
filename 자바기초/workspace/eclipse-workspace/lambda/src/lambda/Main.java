package lambda;

public class Main {
	public static void main(String[] args) {
		FunctionalInter fi = new FunctionalInter() {
			
			@Override
			public void method() {
				System.out.println("익명 클래스 객체의 메소드다!");
			}
		};
		fi.method();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		FunctionalInter fi2 = ()	-> System.out.println("람다식이다!!!");
		
		fi2.method();
		
		FunctionalInter2 fii2 = number -> number + 10;
		int result = fii2.add10(10);
		System.out.println(result);
		
		FunctionalInter3 fi3 = (n1, n2) -> {
			System.out.println(n1 + "+" + n2 + "=" + (n1+n2)	);
			return n1 + n2;
		};
		int num = fi3.method(3, 8);
		System.out.println(num);
	}
}

package lambda;

public class lambdaTest {
	public static void main(String[] args) {
		//익명클래스를 사용하거나 람다식을 사용하는 것에 있어서 동작원리는 전혀 차이가 없다.
		//그렇기에 더 간결한 람다를 선호
		//두줄에서 세줄정도가 가독성이 좋음
		
		
		LambdaInter a = new LambdaInter() {
			
			@Override
			public boolean checkMultipleOf10(int number) {
				return number %10 ==0;
			}
		};
		
		
		System.out.println(a.checkMultipleOf10(102));
		
		LambdaInter a1 = number -> number%10==0;
		
		
	}
}

package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		
		//boxing
		Integer numInt = new Integer(3);  //생성자로 하는건 추천하지않음 deprecated
		Integer numInt2 = Integer.valueOf(3);
		Double numD = Double.valueOf(3.14);
		//unboxing
		int num	= numInt.intValue();
		//auto boxing
		Integer numInt3 = 3;
			//단 오버로딩된 메소드에서 매개변수로 int 타입과 Integer타입을 받는 두개의 메소드가 있는경우 int변수를 넘겨주면 int타입에 메소드만 사용가능하고 
			//Integer.valueOf()를 사용하면 Integer타입에 메소드를 사용한다.
			//Integer타입을 받는 메소드 한개만 존재하는 경우 그냥 int값을 가진 정수를 넘겨주면 오토박싱이되어 사용 가능하다.
		//auto unboxing
		int num2 = numInt3;
		System.out.println(num2);
		
	}
}

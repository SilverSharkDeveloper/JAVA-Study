package constructorTest;

class A {
	int data;

	public A(int data) {
		this.data = data;					
		System.out.println(this);                                                       //this 는 객체 자신의 주소를 의미한다.
	}
	
}
public class ClassTest {
	public static void main(String[] args) {
		A a = new A(4);
		System.out.println(a);
		
		A a2 = new A(5);
		System.out.println(a2);
	}
}

package aTest;
abstract class ClassA{
	abstract void method1();
	void method2() {
		System.out.println("메소드 2 실행");
	}
}
class ClassB extends ClassA{
	@Override
	void method1() {
		System.out.println("오버라이딩 method1()");
	}
}
public class AbstractTest {
public static void main(String[] args) {
	ClassA a = new ClassB();
	
	ClassB b = new ClassB();
	
	b.method1();
	b.method2();
	a.method1();
	a.method2();
}
}

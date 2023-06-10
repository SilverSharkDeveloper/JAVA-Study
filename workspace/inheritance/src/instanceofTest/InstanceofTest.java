package instanceofTest;
class A{}
class B extends A{}
public class InstanceofTest {
	public static void main(String[] args) {
		A a = new A();
		B b= new B();
		
		System.out.println(b instanceof A);
	}
}

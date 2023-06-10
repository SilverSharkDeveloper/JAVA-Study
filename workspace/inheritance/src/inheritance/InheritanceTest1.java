package inheritance;

class A{
	String name = "A";
	int data ;
public A() {
}
	void printName() {
		System.out.println(name);
		
	}
}

class B extends A{
	public B() {;
	}
}

public class InheritanceTest1 {
	
	
	public static void main(String[] args) {
		B b = new B();
		b.printName();
	}
}

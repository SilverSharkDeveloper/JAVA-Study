package staticTest;

class A{
	int a;
	int b;
	public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

}

public class B{
	public static void main(String[] args) {
	A a= new A(3,4);
	
	System.out.println(a);
	
	
	}
}

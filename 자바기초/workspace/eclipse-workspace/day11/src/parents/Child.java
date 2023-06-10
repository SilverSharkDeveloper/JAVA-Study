package parents;

public class Child extends Parents{
	int data;
	
	



interface I {
	
	public void a (int a) ;
		
	
}
class A implements I {
	public void a (int a) {
		
	}
}

	public Child(int number, int data) {
		super(number);
		this.data = data;
	}




	public Child() {
		System.out.println("child 생성자 호출");
	}
}

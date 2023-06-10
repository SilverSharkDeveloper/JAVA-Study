package constructorTest;
class B{
	int num	;

	public B(int num) {
		this.num = num;
	}
	void printNum(int num) {
		System.out.println("매개변수 num >>"+ num);
		System.out.println("객체가 저장한 num>>"+this.num);
	System.out.println("참조값 >>"+ this);
	}
}
public class ClassTest2 {
public static void main(String[] args) {
	B b = new B(4);
	b.printNum(10);
	System.out.println(b);
}
}

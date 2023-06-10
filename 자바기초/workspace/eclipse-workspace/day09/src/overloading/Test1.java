package overloading;
class A{
	
	void sum(int n1, int n2){
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3){
		System.out.println(n1 + n2 + n3);
	}
	void sum (int n1, String n2) {
		System.out.println(n1 + n2);
	}
	
}
public class Test1 {
public static void main(String[] args) {
	A a = new A();
	a.sum(1, 2);
	a.sum(1, 2,3);
	a.sum(1, "2");
}
}

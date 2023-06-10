package list;
class MyClass<T>{
	T data;
	
	void printData() {
		System.out.println(data);
	}

	public MyClass(T data) {
		super();
		this.data = data;
	}
	
}
public class GenericTest {
	public static void main(String[] args) {
		MyClass<Integer> mc = new MyClass<>(4);
		mc.printData();
		
		MyClass<String> mc2 = new MyClass<>("sg");
		mc2.printData();
	}
}

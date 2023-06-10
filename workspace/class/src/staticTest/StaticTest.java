package staticTest;

class Data{
	int data = 10;
	//모든 객체가 공유해야 할 때 static 필드를 선언한다.
	//클래스별로 딱 한개만 선언된다
	//클래스로 직접 접근해야한다.
	//메모리 자체에 heap메모리가 아닌 다른 메모리에 저장된다.
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	void increase_s(){
		System.out.println(++data_s);
	}
}


public class StaticTest {
	public static void main(String[] args) {
		Data data = new Data();
		data.increase();
		data.increase();
		data.increase();
		data.increase();
		
		data = new Data();
		
		data.increase();
		data.increase();
		data.increase();
		data.increase();
		data.increase();

		data.increase_s();
		data.increase_s();
		data.increase_s();
		data.increase_s();
		data.increase_s();
		data.increase_s();
	
	
	}
}

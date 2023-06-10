package staticTest;
class A{
	int iVar	;
	static int sVar;

	
	
	//인스턴스 메소드는 인스턴스, 스태틱 모든 멤버 사용 가능하다.
	void iMethod1() {
		iVar = 10;
		sVar= 10;
		iMethod2();
		sMethod1();
		
	}
	void iMethod2() {
		
	}
	//스테틱 메소드는 static 멤버만 사용 가능하다.
	static void sMethod1() {
//		iVar = 10; 불가능
		sVar = 10;
//		iMethod1();
		sMethod2();
	}
	static void sMethod2() {
		
	}
}
public class StaticTest2 {
	public static void main(String[] args) {
		//다른 클래스에서 인스턴스 멤버를 사용하는 경우
		A a = new A();
		a.iVar = 10;
		a.iMethod1();
		
		//다른 클래스에서 static 멤버를 사용하는 경우
		a.sVar = 10;
		a.sMethod1();
		
		
		A.sVar = 10;
		A.sMethod1();
		
	}
}

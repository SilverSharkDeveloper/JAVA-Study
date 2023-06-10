package staticTest;
	
public class StaticTest {
public static void main(String[] args) {
	StaticTest st = new StaticTest();
	st.iMethod1();
	st.sMethod1();			//실행 가능하지만 권장하지 않음
	sMethod1();
}

void iMethod1() {
	System.out.println("인스턴스 메소드 1 실행");
	sMethod2();
	iMethod2();
}
void iMethod2() {
	System.out.println("인스턴스 메소드 2 실행");
	
}
static void sMethod1() {
	System.out.println("스태틱 메소드 1 실행");
	sMethod2();
}
static void sMethod2() {
	System.out.println("스태틱 메소드 2 실행");
}
}

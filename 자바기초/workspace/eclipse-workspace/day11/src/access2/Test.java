package access2;

import access.A;

class Child extends A{																										//import 보다 위면 안된다
	void method() {
		var3 = 4;
		System.out.println(var3);
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.var1 = 3 ;
		a.setVar4(10);
		System.out.println(a.getVar4());
		System.out.println(a.var1);
	}
}


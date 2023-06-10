package inheritance;
class Human{
	String name;
public Human() {
}
	public Human(String name) {
		super();
		this.name = name;
	}
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("자기");
	}
	void walk() {
		System.out.println("두 바롤 걷기");
	}
}

class Monkey extends Human{
	
	public Monkey(String name) {
		super();
	}
	
	@Override
	void walk() {
		super.walk();
		System.out.println("내발로 걷기");
	}
	
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey m = new Monkey("d");
		m.walk();
	}
}

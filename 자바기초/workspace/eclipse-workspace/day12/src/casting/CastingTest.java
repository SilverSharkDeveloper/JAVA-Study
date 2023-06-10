package casting;

class Animal {
	
	
	
	public Animal(String name) {
		this.name = name;
	}

	int age;
	String name;

	void crying() {
		System.out.println("나운다");
	}
}

class Dog extends Animal {
public Dog(String name) {
	super(name);
}
	@Override
	void crying() {
		System.out.println("멍멍");
	}

	void walk() {
		System.out.println("산책");

	}

}

class Cat extends Animal {
public Cat(String name) {
	super(name);
}
	@Override
	void crying() {
		System.out.println("냐옹");

	}

}

public class CastingTest {
	public static void main(String[] args) {
		Animal animal = new Dog("바둑이");
		//오버라이딩 한 경우 업캐스팅을 하여도 오버라이딩 된 메소드가 실행된다.
		animal.crying();
		
//		animal.walk
		//메소드가 부모에는 없고 자식에서 추가된 경우(부모에 존재하지 않는 멤버에 접근하는경우)
		//자식클래스에서 추가한 맴버는 부모타입의 참조변수로는 접근할 수 없다.
		//이 경우는 다운 캐스팅을 해야한다.
		((Dog)animal).walk();
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("냐옹이");
		printText(dog);
		printText(cat);
		printText(new Dog("뽀삐"));
		printText(new Cat("나비"));
		
		tryWalk(dog);
		tryWalk(cat);
		
	}
	//3.만약에 부모클래스에 존재하지 않는 맴버에 접근하기 위해서는??
	//down casting을 해줘야한다.
	static void tryWalk(Animal animal) {
	//매개변수로 받아온 객체의 주소가 Cat타입인지 Dog타입인지 확인을 해야한다.
		if(animal instanceof Dog) {
			//Dog타입이 맞다면 Dog로 Down Casting이 된다.
			((Dog)animal).walk();
		
		}else {
			System.out.println("산책가기 싫어");
		}
	}
	//2.같은 부모클래스가 존재한다면 매개변수를 부모 클래스 타입으로 받는다.(업캐스팅)
	//하나의 메소드에서 매개변수를 부모타입으로 만들면 여러 자식타입을 받아 사용이 가능하다.
	static void printText(Animal animal) {
		System.out.println(animal.name);
		animal.crying();
		
	}
	//1. 메소드의 매개변수로 여러 타입의 값을 전달받는 경우
	//일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야한다.
//	static void printText(Dog dog) {
//		System.out.println(dog.name + "이가 운다!");
//		dog.crying();
//	}
//	static void printText(Cat cat) {
//		System.out.println(cat.name + "이가 운다!");
//		cat.crying();
//	}
}

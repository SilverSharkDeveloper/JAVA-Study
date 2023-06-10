package task;
class Student2{
	String name;
	int age;
	int number;
	
	public Student2(String name, int age, int number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
	return number == ((Student2)obj).number && age == ((Student2)obj).age;
	
	}
	
}
public class EqualTask {
	public static void main(String[] args) {
		Student2 철수 = new Student2("철수", 15, 20);
		Student2 영희 = new Student2("영희", 12, 11);
		Student2 웅이 = new Student2("웅이", 17, 20);
		
		System.out.println(철수.equals(웅이));
		System.out.println(철수.equals(영희));
		System.out.println(영희.equals(new Student2("유리", 12, 11)));
		System.out.println(철수.hashCode());
		System.out.println(웅이.hashCode());
	}
}

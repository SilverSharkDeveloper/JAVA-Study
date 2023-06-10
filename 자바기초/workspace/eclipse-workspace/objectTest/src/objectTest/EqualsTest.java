package objectTest;
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {return true;}
		if(obj instanceof Person) {
			String other = ((Person)obj).name;
			return this.name.equals(other);
		}
		return false;
	}
//		if(this == obj) {
//			return true;
//		}
//		if(obj instanceof Person) {
//			String other = ((Person)obj).name;
//			if(this.name.length() == other.length()) {
//				for(int i = 0 ; i<this.name.length(); i++) {
//					if(this.name.charAt(i) != other.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
//		return false;
//	}
}
public class EqualsTest {
	public static void main(String[] args) {
		Person 철수 = new Person("철수", 22);
		Person 영희 = new Person("영희", 22);
		Person 모름 = new Person("철수", 22);
		System.out.println(철수.equals(모름));
		
	
//		String str = new String("aa");
//		String st2 = "aa";
//		String st3 = "aa";
//		System.out.println(st2 == st3	);
//		System.out.println(str == st2);
//		System.out.println(str.equals(st3));
	}
}

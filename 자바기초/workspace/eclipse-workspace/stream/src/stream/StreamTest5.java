package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class User {
	String id;
	String name;
	int age;

	public User(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

public class StreamTest5 {
	public static void main(String[] args) {
		User[]	users = {
				new User("aa", "누나", 25),
				new User("bb", "허은상", 23),
				new User("cc", "동생", 20)
		};
		
		Map<String,Integer> map = Arrays.stream(users)
				.collect(Collectors.toMap(user -> user.name + "님", user ->user.age));
		System.out.println(map);
		
//		map.keySet().stream().forEach(i ->System.out.println(i));
		//메소드 참조
		//매개변수 ->메소드(매개변수)
		//클래스명::메소드명
		map.keySet().stream().forEach(System.out::println);
		//모호한 메소드 참조는 불가능하다.(참조 가능한 메소드가 여러개면 안된다.)
		
	}
}

package set;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		Student st = new Student(1, "홍길동");
		
		System.out.println(st.equals(new Student(1,"바보")));
		
		set.add(st);
		set.add(new Student(1,"홍길동"));
		System.out.println(set.size());
		
		System.out.println(st.hashCode());
	}
}

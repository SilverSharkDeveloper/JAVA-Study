package person;

public class Main {
	public static void main(String[] args) {
		Person ps = new Person();
		ps.age = 10;
		Student st = new Student();
		st.study();
		Employee ep = new Employee();
		ep.employeeNumber = 20;
		ep.sleep();
	}
}

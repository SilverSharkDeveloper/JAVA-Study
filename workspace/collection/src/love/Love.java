package love;

public class Love implements Comparable<Love>{
	private String PhoneNumber;
	private String name;
	private int age;
	
	
	public Love(String phoneNumber, String name, int age) {
		super();
		PhoneNumber = phoneNumber;
		this.name = name;
		this.age = age;
	}

	public Love() {
		// TODO Auto-generated constructor stub
	}

	public String getPk() {
		return PhoneNumber;
	}

	public void setPk(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Love [pk=" + PhoneNumber + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Love o) {
		if(this.age > o.age) {
			return 1;
		}else if(this.age <o.age) {
			return -1;
		}else {
			return 0;
		}
	}
}

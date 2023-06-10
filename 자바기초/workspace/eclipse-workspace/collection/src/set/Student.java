package set;

public class Student {
	int num;
	String name;
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
		public boolean equals(Object obj) {
			if(this == obj) {return true;}
			if(obj instanceof Student) {
				return this.num	== ((Student)obj).num;
			}return false;
		}

	@Override
	public int hashCode() {
		return num;
	}

}

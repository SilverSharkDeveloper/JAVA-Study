package arrayListTask.User;

public class User {
	private String name;
	private String id;
	private	String pw;
	private String phoneNumber;
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", pw=" + pw + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}

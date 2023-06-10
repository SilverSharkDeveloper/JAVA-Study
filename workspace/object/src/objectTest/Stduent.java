package objectTest;

public class Stduent {
	private int number;
	private String name;
	
	public Stduent() {
		// TODO Auto-generated constructor stub
	}

	public Stduent(int number, String name) {
		super();
		this.number = number;
		this.name = name;

	
	}
	

	@Override
	public String toString() {
		return "Stduent [number=" + number + ", name=" + name + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

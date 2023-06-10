package ambiguity;

public interface InterA {
	public default void printName() {
		System.out.println("InterA");
	}
}

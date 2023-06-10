package car;

public class Main {
	public static void main(String[] args) {
		SuperCar sc = new SuperCar("bmw", "black", 1, true);
		sc.enginStart();
		
		Car c = new Car(null, null, 0);
		c.enginStart();
	}
}

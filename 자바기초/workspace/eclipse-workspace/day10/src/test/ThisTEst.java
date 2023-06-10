package test;
class Car {
	String brand ;
	String color;
	int price;
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public Car() {
		this("bmw","blue",3500);
//		this.brand = "kia";
//		this.color = "blue";
//		this.price = 3500;
	}
	public Car(String brand , int price) {
		this(brand,"white", price);
		System.out.println("매개변수 2개짜리 생성자 실행");
	}
}
public class ThisTEst {
	public static void main(String[] args) {
		Car car = new Car("benz", "black", 9000);
		Car car2 = new Car();
		Car car3 = new Car("benz", 5000);
		System.out.println(car2.brand);
		System.out.println(car2.color);
		System.out.println(car3.color);
	}
}

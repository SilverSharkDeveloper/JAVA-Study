package inheritance;

import java.util.Random;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {
		System.out.println("부모의 기본생성자");
	}
	
	
	
	public Car(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}



	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		System.out.println("매개변수 세개짜리 부모의 생성자");
	}
	
	 void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	 void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}

class SuperCar extends Car{
		String mode;
		static String mode2;
		
		public SuperCar() {
		}
		
		
		


	public SuperCar(String mode) {
			super();
			this.mode = mode;
		}





	public SuperCar(String brand, String color, int price, String mode) {
			super();
			this.brand = brand;			
			this.mode = mode;
		}





	@Override
	 void engineStart() {
		super.engineStart();	//열쇠로도 시동 켜짐
		System.out.println("음성으로 시동 켜짐");
	}

	@Override
	void engineStop() {
		System.out.println("음성으로 시동 꺼짐");
	}
	
}


public class InheritanceTask {
	public static void main(String[] args) {
//		SuperCar ferrari = new SuperCar("Sports");
//		System.out.println(ferrari.brand);
//		System.out.println(ferrari.color);
//		ferrari.engineStart();
//		ferrari.engineStop();
		System.out.println(Math.round(0));
		Random r = new Random();
		
	}
}

package castingTest;
	class Car{
		void engineStart() {
			System.out.println("열쇠로 시동 킴");
		}
		
	}
	
	class SuperCar extends Car{

		@Override
		void engineStart() {
			System.out.println("음성으로 시동 킴");
		}
		
		void openloof() {
			System.out.println("뚜껑 열기");
		}
		
	}
public class CastingTest {
	public static void main(String[] args) {
		Car c1 = new SuperCar();
		
		SuperCar c2 = (SuperCar)c1;
		
		System.out.println(c1 instanceof SuperCar);
	}
}

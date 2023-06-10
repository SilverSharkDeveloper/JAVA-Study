package interfaceTest;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = {new Cat() , new Dog(), new Tiger()};
		
		for (int i = 0; i < animals.length; i++) {
			eat(animals[i]);
		}		
	}
	
	static void eat(Animal animal) {
		if(animal instanceof Carvibore) {
			System.out.println("고기먹자");
		}else if (animal instanceof Hervibore) {
			System.out.println("채소먹자");
		}else {
			System.out.println("먹지마");
		}
		
	}
	
}

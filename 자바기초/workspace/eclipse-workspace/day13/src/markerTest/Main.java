package markerTest;

public class Main {
public static void main(String[] args) {
	checkA(new Eagle());
	checkA(new Tiger());
	checkA(new Horse());
	
	Animal[] animals = {new Eagle(), new Tiger(), new Horse()};
	
	checkB(animals);
}
static void checkA(Animal animal) {
	if(animal instanceof Carnivore) {
		System.out.println("육식 동물");
	}else if (animal instanceof Herbivore) {
		System.out.println("초식 동물");
	}
}
static void checkB(Animal[] animals) {
	for(int i = 0; i <animals.length; i++) {
		if(animals[i] instanceof Sky) {
			System.out.println("날아 다닌다");
		}else if(animals[i] instanceof Land) {
			System.out.println("뛰어다닌다");
		}
	}
}
}

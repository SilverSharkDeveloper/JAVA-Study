package fruit;

public class Main {
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		
		f1.setName("banana");
		f1.setPrice(100);
	
		
		
		if(Market.checkFruitName(f1.getName())) {
			System.out.println("이미존재");
		}else {
			System.out.println("추가 성공");
			Market.addFruit(f1);
		}
		
		
		System.out.println(DBConnecter.db.get(0));
		
		Market.delFruit(f1.getName());
		
	
		
		

		if(Market.checkFruitName(f1.getName())) {
			System.out.println("이미존재");
		}else {
			System.out.println("추가 성공");
			Market.addFruit(f1);
		}
		
		f1 = new Fruit();
		f1.setName("apple");
		f1.setPrice(500);
		
		if(Market.checkFruitName(f1.getName())) {
			System.out.println("이미존재");
		}else {
			System.out.println("추가 성공");
			Market.addFruit(f1);
		}
		
		System.out.println(Market.checkLowAverage("banana"));

		System.out.println(Market.checkAllFruit());
		
	System.out.println(Market.checkPrice("apple"));
		
		
		
		
	}
}

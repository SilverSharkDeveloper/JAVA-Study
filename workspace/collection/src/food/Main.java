package food;

public class Main {
	public static void main(String[] args) {
		Food f1 = new Food();
		
		f1.setName("피자");
		f1.setPrice(5000);
		f1.setType("양식");
		
		if(Restaurant.checkFoodName(f1.getName())) {
			System.out.println("이미 있는 메뉴");
		}else {
			Restaurant.addFood(f1);
		}
		
		System.out.println(f1);
		
		System.out.println(Restaurant.findType(f1.getName()));
		
		
		
	}
}

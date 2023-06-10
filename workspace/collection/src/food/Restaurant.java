package food;


public class Restaurant {
	
	
	
	//음식 중복 검사
	static boolean checkFoodName(String food) {
		for(Food tempfood : DBConnecter.db) {
			if(tempfood.getName().equals(food)) {
				return true;
			}
		}
		return false;
	}
	
	//음식추가
	static void addFood(Food food) {
		DBConnecter.db.add(food);

	}
	//음식 객체 가져오기
	static Food getFood(String food) {
		for(Food tempFood : DBConnecter.db) {
			if(tempFood.getName().equals(food)){
				return tempFood;
			}
		}
		return null;
	}
	
	//이름으로 종류 조회
	static String findType(String food) {
		return getFood(food).getType();
	}
	
	//음식 종류에 전체조회
	static String foodsByType(String type) {
		String allFood = "";
		for(Food tempFood : DBConnecter.db) {
			if(tempFood.getType().equals(type)) {
				allFood += tempFood.getName()+",";
			}
		}
		return allFood;
	}
	
	//음식 종류 수정후 가격 10퍼센트 상승
	static void changeTypeAndIncrease10(String food, String type) {
		Food tempFood = getFood(food);
		tempFood.setType(type);
		tempFood.setPrice((int)(tempFood.getPrice()*1.1));
		
	}
	
	//사용자가 원하는 종류의 음식갯수 조회
	static int foodCount(String type) {
		int count = 0;
		for(Food tempFood : DBConnecter.db) {
			if(tempFood.getType().equals(type)) {
				count++;
			}
		}
		return count;
	}
}